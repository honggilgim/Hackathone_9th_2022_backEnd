package cbnu.capstone.tripwithme.service.TourRegister;

import cbnu.capstone.tripwithme.dto.TourRegister.AlwaysTourRegisterTableDTO;

import java.util.List;

public interface AlwaysTourRegisterService {
    List<AlwaysTourRegisterTableDTO> getAlwaysTourRegisterTable();

    List<AlwaysTourRegisterTableDTO> getAlwaysTourRegisterTable(String tourcode);

    List<AlwaysTourRegisterTableDTO> AlwaysTourRegisterTableFilter(String tourcode);
    void setAlwaysTourRegisterTables(Long alwaysTourRegisterTableid, String tourCode, String userId, String date);
}
