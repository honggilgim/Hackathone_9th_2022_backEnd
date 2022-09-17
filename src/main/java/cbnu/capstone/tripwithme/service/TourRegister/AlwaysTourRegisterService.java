package cbnu.capstone.tripwithme.service.TourRegister;

import cbnu.capstone.tripwithme.dto.TourRegister.AlwaysTourRegisterTableDTO;
import cbnu.capstone.tripwithme.dto.TourRegister.GPS;

import java.util.List;

public interface AlwaysTourRegisterService {

    List<AlwaysTourRegisterTableDTO> getAlwaysTourRegisterTable(GPS gps);

<<<<<<< HEAD
=======
    List<AlwaysTourRegisterTableDTO> alwaysTourRegisterTableFilter(String tourcode);
    void setAlwaysTourRegisterTables(Long alwaysTourRegisterTableid, String tourCode, String userId, String date);
>>>>>>> 0cd51088d7054e7879ca8f2446781125ae54d380
}
