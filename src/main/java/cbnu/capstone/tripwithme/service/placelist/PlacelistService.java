package cbnu.capstone.tripwithme.service.placelist;


import cbnu.capstone.tripwithme.dto.placelist.PlacelistDTO;

import java.util.List;

public interface PlacelistService {
    List<PlacelistDTO> getPlacelist();
    List<PlacelistDTO> getPlacelistFilter(String region);
    void setPaidlist(String userid,String place_code,int place_price,String region);
    void setUserTicketlist(String place_code, String userid);
}