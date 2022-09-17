package cbnu.capstone.tripwithme.mapper.TourRegister;

import cbnu.capstone.tripwithme.dto.TourRegister.AlwaysTourRegisterTableDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AlwaysTourRegisterMapper {
    List<AlwaysTourRegisterTableDTO> getAlwaysTourRegisterTable();
    List<AlwaysTourRegisterTableDTO> AlwaysTourRegisterTableFilter(String up, String down);
    void setAlwaysTourRegisterTables(Long alwaysTourRegisterTableid, String tourCode, String userId, String date);
}
