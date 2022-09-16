package cbnu.capstone.tripwithme.controller.Auth;

import cbnu.capstone.tripwithme.exception.AppExceptions;
import cbnu.capstone.tripwithme.entity.User.Role;
import cbnu.capstone.tripwithme.entity.User.RoleName;
import cbnu.capstone.tripwithme.entity.User.User;
import cbnu.capstone.tripwithme.service.payload.request.LoginRequest;
import cbnu.capstone.tripwithme.service.payload.request.SignUpRequest;
import cbnu.capstone.tripwithme.service.payload.response.ApiResponse;
import cbnu.capstone.tripwithme.service.payload.response.JwtAuthenticationResponse;
import cbnu.capstone.tripwithme.repository.RoleRepository;
import cbnu.capstone.tripwithme.repository.UserRepository;
import cbnu.capstone.tripwithme.security.JwtTokenProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.Collections;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    AuthenticationManager authenticationManager;

    @Autowired
    UserRepository userRepository;

    @Autowired
    RoleRepository roleRepository;

    @Autowired
    PasswordEncoder passwordEncoder;

    @Autowired
    JwtTokenProvider tokenProvider;

    @PostMapping("/signin")
    public ResponseEntity<?> authenticateUser(@Valid @RequestBody LoginRequest loginRequest) {

        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(loginRequest.getUserid(), loginRequest.getPassword()));

        SecurityContextHolder.getContext().setAuthentication(authentication);

        String jwt = tokenProvider.generateToken(authentication);
        return ResponseEntity.ok(new JwtAuthenticationResponse(jwt));
    }

    @PostMapping("/signup")
    public ResponseEntity<?> registerUser(@Valid @RequestBody SignUpRequest signUpRequest) {
//        if (userRepository.existsByUsername(signUpRequest.getUserid())) {
//            return new ResponseEntity(new ApiResponse(false, "Username is already taken!"), HttpStatus.BAD_REQUEST);
//        }

        // 회원가입
        User user = new User(signUpRequest.getName(), signUpRequest.getUserid(),
                signUpRequest.getPassword(), signUpRequest.getPhone_number(), signUpRequest.getbirth());

        user.setPassword(passwordEncoder.encode(user.getPassword()));
        Role userRole = roleRepository.findByName(RoleName.ROLE_USER)
                .orElseThrow(() -> new AppExceptions("User Role not set."));

        user.setRoles(Collections.singleton(userRole));

        User result = userRepository.save(user);


        URI location = ServletUriComponentsBuilder.fromCurrentContextPath().path("/api/users/{username}")
                .buildAndExpand(result.getUserid()).toUri();

        return ResponseEntity.created(location).body(new ApiResponse(true, "User registered successfully"));
    }
}