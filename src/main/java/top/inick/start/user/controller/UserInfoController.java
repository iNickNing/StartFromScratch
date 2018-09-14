package top.inick.start.user.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;

import top.inick.start.user.entity.UserInfo;
import top.inick.start.user.service.IUserInfoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author iNick
 * @since 2018-09-14
 */
@Controller
@RequestMapping("/user/userInfo")
public class UserInfoController {
	
	@Autowired
	IUserInfoService userInfoService;
	
	@RequestMapping("findAllUser")
	@ResponseBody
	public Object findAllUser() {
		
		QueryWrapper<UserInfo> queryWrapper = new QueryWrapper<>();
		return userInfoService.list(queryWrapper);
	}
}

