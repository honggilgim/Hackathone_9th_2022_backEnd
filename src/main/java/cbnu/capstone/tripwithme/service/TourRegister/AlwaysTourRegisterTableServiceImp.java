package cbnu.capstone.tripwithme.service.TourRegister;

import cbnu.capstone.tripwithme.dto.TourRegister.AlwaysTourRegisterTableDTO;

import cbnu.capstone.tripwithme.mapper.TourRegister.AlwaysTourRegisterMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import cbnu.capstone.tripwithme.dto.TourRegister.GPS;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AlwaysTourRegisterTableServiceImp implements AlwaysTourRegisterService {

    private final AlwaysTourRegisterMapper alwaysTourRegisterMapper;

    @Override
    public List<AlwaysTourRegisterTableDTO> getAlwaysTourRegisterTable(GPS gps) {
        return alwaysTourRegisterMapper.alwaysTourRegisterTableFilter(gps.getUp(), gps.getDown());
    }

}
