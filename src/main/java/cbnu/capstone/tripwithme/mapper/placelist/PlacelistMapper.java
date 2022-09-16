package cbnu.capstone.tripwithme.mapper.placelist;

import cbnu.capstone.tripwithme.dto.placelist.PlacelistDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PlacelistMapper {
    List<PlacelistDTO> getPlacelist();

    List<PlacelistDTO> getPlacelistFilter(String region);

    void setPaidlist(String userid, String place_code, int place_price, String region);

    void setUserTicketlist(String place_code,String userid);
}