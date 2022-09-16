package cbnu.capstone.tripwithme.dto.placelist;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class PlacelistDTO {
    private String place_code;
    private String place_name;
    private int place_price;
    private String region;
}