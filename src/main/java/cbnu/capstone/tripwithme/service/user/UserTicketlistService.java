package cbnu.capstone.tripwithme.service.user;

import cbnu.capstone.tripwithme.dto.user.UserTicketlistDTO;

import java.util.List;

public interface UserTicketlistService {
    List<UserTicketlistDTO> getUserTicketlist(String userid);

}
