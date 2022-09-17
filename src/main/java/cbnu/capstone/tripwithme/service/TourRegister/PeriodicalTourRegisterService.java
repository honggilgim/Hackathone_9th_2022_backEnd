package cbnu.capstone.tripwithme.service.TourRegister;

import cbnu.capstone.tripwithme.dto.TourRegister.PeriodicalTourRegisterTableDTO;

import java.util.List;

public interface PeriodicalTourRegisterService {
    List<PeriodicalTourRegisterTableDTO> getPeriodicalTourRegisterTable(String up, String down);

}
