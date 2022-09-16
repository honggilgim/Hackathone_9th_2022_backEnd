package cbnu.capstone.tripwithme.controller.placelist;


import cbnu.capstone.tripwithme.dto.placelist.PaidlistDTO;
import cbnu.capstone.tripwithme.dto.placelist.PlacelistDTO;

import cbnu.capstone.tripwithme.service.placelist.PlacelistService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.*;

@RequestMapping("/placelist")
@CrossOrigin(origins ="*", maxAge = 3600)
@RestController
@RequiredArgsConstructor
public class PlaceList
{

    private final PlacelistService placelistService;



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