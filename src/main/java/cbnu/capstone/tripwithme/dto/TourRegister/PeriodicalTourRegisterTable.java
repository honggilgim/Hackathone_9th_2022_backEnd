package cbnu.capstone.tripwithme.dto.TourRegister;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PeriodicalTourRegisterTable {
    private long periodicalTourRegisterTableId;
    private String tourCode;
    private String userId;
    private String date;
}
