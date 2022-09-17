<<<<<<< HEAD
//package cbnu.capstone.tripwithme.controller.sign;
//
//import cbnu.capstone.tripwithme.service.sign.SignService;
//import lombok.RequiredArgsConstructor;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import javax.servlet.http.HttpServletRequest;
//
//@RequestMapping("/sign")
//@CrossOrigin(origins ="*", maxAge = 3600)
//@RestController
//@RequiredArgsConstructor
//public class SignController {
//
//    private final SignService signService;
=======
package cbnu.capstone.tripwithme.controller.sign;

import cbnu.capstone.tripwithme.service.sign.SignService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RequestMapping("/sign")
@CrossOrigin(origins ="*", maxAge = 3600)
@RestController
@RequiredArgsConstructor
public class SignController {

    private final SignService signService;
>>>>>>> 0cd51088d7054e7879ca8f2446781125ae54d380
//
//    @GetMapping("/signin")
//    public String getUserInfo(HttpServletRequest request){
//        String userId = request.getParameter("userId");
//        String password = request.getParameter("password");
//
<<<<<<< HEAD
//        signService.getUserInfo(userId,password);
//
//        return  placelistService.getPlacelistFilter(region);
//    }
//}
=======
//        signService.get
//
//        return  placelistService.getPlacelistFilter(region);
//    }
}
>>>>>>> 0cd51088d7054e7879ca8f2446781125ae54d380
