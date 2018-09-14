package top.inick.start.user.mapper;

import top.inick.start.user.entity.User;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author iNick
 * @since 2018-09-14
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
