package cbnu.capstone.tripwithme.dto.tour;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TourPlaceDTO {
// 여행지 장소 정보 DTO

    private String tourCode;
    private String tourName;
    private String tourLocation;
    private int adultFee_P;
    private int adolescentFee_P;
    private int childFee_P;
    private int elderPeopleFee_P;
    private int adultFee_G;
    private int adolescentFee_G;
    private int childFee_G;
    private int elderPeopleFee_G;
    private int score;
    private String picUrl;
    private String explanation;
    private String location_y;
    private String location_x;

}
