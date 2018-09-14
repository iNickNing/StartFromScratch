package top.inick.start.user.service.impl;

import top.inick.start.user.entity.User;
import top.inick.start.user.mapper.UserMapper;
import top.inick.start.user.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author iNick
 * @since 2018-09-14
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
