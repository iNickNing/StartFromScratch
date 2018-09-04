package top.inick.start.service.impl;

import org.springframework.stereotype.Service;
import top.inick.start.dao.UserInfoMapper;
import top.inick.start.model.UserInfo;
import top.inick.start.service.UserInfoService;

import javax.annotation.Resource;

@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Resource
    private UserInfoMapper userInfoMapper;

    @Override
    public UserInfo selectById(Integer id) {
        return userInfoMapper.selectById(id);
    }
}
