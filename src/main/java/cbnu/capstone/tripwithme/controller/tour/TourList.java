package cbnu.capstone.tripwithme.controller.tour;


import cbnu.capstone.tripwithme.dto.tour.TourPlaceDTO;
import cbnu.capstone.tripwithme.service.tour.TourListService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RequestMapping("/tour")
@CrossOrigin(origins ="*", maxAge = 3600)
@RestController
@RequiredArgsConstructor
public class TourList
{

    private final TourListService tourListService;


    // 지도에 핀을 위한 전체 여행지 불러오기.
    @GetMapping("/")
    public List<TourPlaceDTO> getTourList(HttpServletRequest request){
        return tourListService.getTourList();
    }
//
//    @GetMapping("/filter")
//    public List<PlacelistDTO> getTourListFilter(HttpServletRequest request){
//        String region = request.getParameter("region");
//        System.out.println(region);
//        return  placelistService.getPlacelistFilter(region);
//    }
//
//
//    @PostMapping("/paidplace")
//    public void setPaidPlace(@RequestBody PaidlistDTO paidlistDTO){
//        System.out.println(paidlistDTO.getPlace_code());
//        placelistService.setPaidlist(paidlistDTO.getUserid(),paidlistDTO.getPlace_code(),
//                paidlistDTO.getPlace_price(),paidlistDTO.getRegion());
//        placelistService.setUserTicketlist(paidlistDTO.getPlace_code(), paidlistDTO.getUserid());
//    }
//


}