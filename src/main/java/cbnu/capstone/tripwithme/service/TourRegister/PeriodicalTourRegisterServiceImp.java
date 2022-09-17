package cbnu.capstone.tripwithme.service.TourRegister;

import cbnu.capstone.tripwithme.dto.TourRegister.PeriodicalTourRegisterTableDTO;

import cbnu.capstone.tripwithme.mapper.TourRegister.PeriodicalTourRegisterMapper;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PeriodicalTourRegisterServiceImp implements PeriodicalTourRegisterService  {
    private final PeriodicalTourRegisterMapper periodicalTourRegisterMapper;

    @Override
    public List<PeriodicalTourRegisterTableDTO> getPeriodicalTourRegisterTable(String up, String down) {
        return periodicalTourRegisterMapper.periodicalTourRegisterFilter(up, down);
    }

}
