package cbnu.capstone.tripwithme.service.TourRegister;

import cbnu.capstone.tripwithme.dto.TourRegister.AlwaysTourRegisterTableDTO;
import cbnu.capstone.tripwithme.dto.TourRegister.GPS;

import java.util.List;

public interface AlwaysTourRegisterService {

    List<AlwaysTourRegisterTableDTO> getAlwaysTourRegisterTable(GPS gps);

}
