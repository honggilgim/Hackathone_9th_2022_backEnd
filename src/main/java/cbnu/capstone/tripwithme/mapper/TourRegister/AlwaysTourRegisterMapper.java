package cbnu.capstone.tripwithme.mapper.TourRegister;

import cbnu.capstone.tripwithme.dto.TourRegister.AlwaysTourRegisterTableDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AlwaysTourRegisterMapper {
    List<AlwaysTourRegisterTableDTO> alwaysTourRegisterTableFilter(String up, String down);
}
