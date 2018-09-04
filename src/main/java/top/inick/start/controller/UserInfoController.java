package top.inick.start.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.inick.start.core.ret.RetResponse;
import top.inick.start.core.ret.RetResult;
import top.inick.start.model.UserInfo;
import top.inick.start.service.UserInfoService;

import javax.annotation.Resource;

@RestController
@RequestMapping("userInfo")
public class UserInfoController {
    @Resource
    private UserInfoService userInfoService;

    @PostMapping("/hello")
    public String Hello() {
        return "hello SpringBoot";
    }

    @PostMapping("/selectById")
    public RetResult<UserInfo> selectById(Integer id){
        UserInfo userInfo = userInfoService.selectById(id);
        return RetResponse.makeOKRsp(userInfo);
    }

}
