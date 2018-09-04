package top.inick.start.dao;

import org.apache.ibatis.annotations.Param;
import top.inick.start.model.UserInfo;


public interface UserInfoMapper {

    UserInfo selectById(@Param("id") Integer id);
}
