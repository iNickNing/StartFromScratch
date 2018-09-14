package top.inick.start.user.service.impl;

import top.inick.start.user.entity.UserInfo;
import top.inick.start.user.mapper.UserInfoMapper;
import top.inick.start.user.service.IUserInfoService;
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
public class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper, UserInfo> implements IUserInfoService {

}
