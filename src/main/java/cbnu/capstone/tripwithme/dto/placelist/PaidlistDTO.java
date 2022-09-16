package cbnu.capstone.tripwithme.dto.placelist;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PaidlistDTO {
    private String userid;
    private String place_code;
    private int place_price;
    private String region;
}