package cbnu.capstone.tripwithme.mapper.user;

import cbnu.capstone.tripwithme.dto.user.UserTicketlistDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserTicketlistMapper {
    List<UserTicketlistDTO> getUserTicketlist(String userid);
}
