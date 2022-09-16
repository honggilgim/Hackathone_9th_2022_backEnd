//package cbnu.capstone.tripwithme.controller.placelist;
//
//import cbnu.capstone.tripwithme.dto.placelist.PaidlistDTO;
//import cbnu.capstone.tripwithme.service.paidlist.PaidlistService;
//import lombok.RequiredArgsConstructor;
//import org.springframework.web.bind.annotation.*;
//
//
//
//@RequestMapping("/paidlist1")
//@CrossOrigin(origins ="*", maxAge = 3600)
//@RestController
//@RequiredArgsConstructor
//public class PaidList {
//
//    private final PaidlistService paidlistService;
//
//
//    @PostMapping("/paidplace")
//    public void setPaidPlace(@RequestBody PaidlistDTO paidlistDTO){
//
//        paidlistService.setPaidlist(paidlistDTO.getUserid(),paidlistDTO.getPlace_code(),
//                paidlistDTO.getPlace_price(),paidlistDTO.getRegion());
//        return;
//    }
//
//
//}