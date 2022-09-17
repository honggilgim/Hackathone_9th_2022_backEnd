<<<<<<< HEAD
//package cbnu.capstone.tripwithme.mapper.user;
//
//
//import cbnu.capstone.tripwithme.dto.userInfo.UserInfoDTO;
//import org.apache.ibatis.annotations.Mapper;
//
//@Mapper
//public interface UserInfoMapper {
//    String getUserInfo(String userId);
//    void setUserInfo(String userId, String password, String flag);
//}
=======
package cbnu.capstone.tripwithme.mapper.user;


import cbnu.capstone.tripwithme.dto.userInfo.UserInfoDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserInfoMapper {
    String getUserInfo(String userId);
    void setUserInfo(String userId, String password, String flag);
}

>>>>>>> 0cd51088d7054e7879ca8f2446781125ae54d380
