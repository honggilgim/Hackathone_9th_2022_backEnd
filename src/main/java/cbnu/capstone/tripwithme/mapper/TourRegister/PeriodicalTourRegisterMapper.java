package cbnu.capstone.tripwithme.mapper.TourRegister;

import cbnu.capstone.tripwithme.dto.TourRegister.PeriodicalTourRegisterTableDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface PeriodicalTourRegisterMapper {
    List<PeriodicalTourRegisterTableDTO> periodicalTourRegisterFilter(String up, String down);
}
