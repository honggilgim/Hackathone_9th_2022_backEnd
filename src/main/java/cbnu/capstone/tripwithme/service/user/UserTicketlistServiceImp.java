package cbnu.capstone.tripwithme.service.user;

import cbnu.capstone.tripwithme.dto.user.UserTicketlistDTO;
import cbnu.capstone.tripwithme.mapper.user.UserTicketlistMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserTicketlistServiceImp implements UserTicketlistService{

    private final UserTicketlistMapper userTicketlistMapper;

    @Override
    public List<UserTicketlistDTO> getUserTicketlist(String userid) {
        return userTicketlistMapper.getUserTicketlist(userid);
    }
}
