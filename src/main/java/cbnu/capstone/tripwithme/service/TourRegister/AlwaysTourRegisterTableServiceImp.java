package cbnu.capstone.tripwithme.service.TourRegister;

import cbnu.capstone.tripwithme.dto.TourRegister.AlwaysTourRegisterTableDTO;

import cbnu.capstone.tripwithme.mapper.TourRegister.AlwaysTourRegisterMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AlwaysTourRegisterTableServiceImp implements AlwaysTourRegisterService {

    private final AlwaysTourRegisterMapper alwaysTourRegisterMapper;


    @Override
    public List<AlwaysTourRegisterTableDTO> getAlwaysTourRegisterTable() {
        return null;
    }

    @Override
    public List<AlwaysTourRegisterTableDTO> getAlwaysTourRegisterTable(String up, String down) {
        return alwaysTourRegisterMapper.AlwaysTourRegisterTableFilter(up, down);
    }

    @Override
    public List<AlwaysTourRegisterTableDTO> alwaysTourRegisterTableFilter(String tourcode) {
        return null;
    }

    @Override
    public void setAlwaysTourRegisterTables(Long alwaysTourRegisterTableid, String tourCode, String userId, String date) {

    }

}
