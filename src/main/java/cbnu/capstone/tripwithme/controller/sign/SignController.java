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
//
//    @GetMapping("/signin")
//    public String getUserInfo(HttpServletRequest request){
//        String userId = request.getParameter("userId");
//        String password = request.getParameter("password");
//
//        signService.getUserInfo(userId,password);
//
//        return  placelistService.getPlacelistFilter(region);
//    }
//}
