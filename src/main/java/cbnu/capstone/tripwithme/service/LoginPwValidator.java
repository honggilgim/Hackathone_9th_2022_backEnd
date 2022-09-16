//package cbnu.capstone.tripwithme.service;
//
//import cbnu.capstone.tripwithme.mapper.user.UserMapper;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//
//public class LoginPwValidator implements UserDetailsService {
//
//    @Bean
//    public PasswordEncoder passwordEncoder(){
//        return new BCryptPasswordEncoder();
//    }
//
//    @Autowired
//    private UserMapper mapper;
//
//    @Override
//    public UserDetails loadUserByUsername(String insertedid) throws UsernameNotFoundException {
//        UserInfo user = mapper.getUserInfo(insertedid);
//
//        if(user == null){
//            return null;
//        }
//
//        String pw = user.getPw();
//        String roles = user.getRoles();
//
//        return User.builder()
//                .username(insertedid)
//                .password(pw)
//                .roles(roles)
//                .build();
//
//
//    }
//}
