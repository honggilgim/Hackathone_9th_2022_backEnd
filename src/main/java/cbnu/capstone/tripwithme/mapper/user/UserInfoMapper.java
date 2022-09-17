package cbnu.capstone.tripwithme.mapper.user;


import cbnu.capstone.tripwithme.dto.userInfo.UserInfoDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserInfoMapper {
    String getUserInfo(String userId);
    void setUserInfo(String userId, String password, String flag);
}
