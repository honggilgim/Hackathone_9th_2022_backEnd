package cbnu.capstone.tripwithme.controller.tour;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;


// 지도에 핀을 위한 전체 여행지 불러오기.

@RequestMapping("/tour")
@CrossOrigin(origins ="*", maxAge = 3600)
@RestController
@RequiredArgsConstructor
public class TourList
{

    private final PlacelistService placelistService;


    // 지도에 핀을 위한 전체 여행지 불러오기.
    @GetMapping("/")
    public List<PlacelistDTO> getTourList(HttpServletRequest request){
        return placelistService.getPlacelist();
    }

    @GetMapping("/filter")
    public List<PlacelistDTO> getTourListFilter(HttpServletRequest request){
        String region = request.getParameter("region");
        System.out.println(region);
        return  placelistService.getPlacelistFilter(region);
    }


    @PostMapping("/paidplace")
    public void setPaidPlace(@RequestBody PaidlistDTO paidlistDTO){
        System.out.println(paidlistDTO.getPlace_code());
        placelistService.setPaidlist(paidlistDTO.getUserid(),paidlistDTO.getPlace_code(),
                paidlistDTO.getPlace_price(),paidlistDTO.getRegion());
        placelistService.setUserTicketlist(paidlistDTO.getPlace_code(), paidlistDTO.getUserid());
    }



}