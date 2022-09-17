package cbnu.capstone.tripwithme.service.TourRegister;

import cbnu.capstone.tripwithme.dto.TourRegister.AlwaysTourRegisterTableDTO;

import java.util.List;

public interface AlwaysTourRegisterService {
    List<AlwaysTourRegisterTableDTO> getAlwaysTourRegisterTable();

    List<AlwaysTourRegisterTableDTO> getAlwaysTourRegisterTable(String up, String down);

    List<AlwaysTourRegisterTableDTO> alwaysTourRegisterTableFilter(String tourcode);
    void setAlwaysTourRegisterTables(Long alwaysTourRegisterTableid, String tourCode, String userId, String date);
}
