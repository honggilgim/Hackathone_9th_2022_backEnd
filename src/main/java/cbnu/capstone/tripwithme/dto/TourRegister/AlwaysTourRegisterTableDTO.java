package cbnu.capstone.tripwithme.dto.TourRegister;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AlwaysTourRegisterTableDTO {

    //상시 접수 테이블을 가져올 DTO
    private long alwaysTourRegisterTableId;
    private String tourCode;
    private String userId;
    private String date;
}