package cbnu.capstone.tripwithme.service.user;

import cbnu.capstone.tripwithme.dto.userInfo.UserRegisterListDTO;

import java.util.List;

public interface UserRegisterInfoService {
    List<UserRegisterListDTO> getUserRegisterList(String tourCode);

}
