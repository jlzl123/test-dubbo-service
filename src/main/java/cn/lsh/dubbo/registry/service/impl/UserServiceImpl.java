package cn.lsh.dubbo.registry.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.lsh.dubbo.bean.UserBean;
import cn.lsh.dubbo.mapper.UserMapper;
import cn.lsh.dubbo.registry.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService{
	@Resource
	private UserMapper userMapper;

	public List<UserBean> list() {
		// TODO Auto-generated method stub
		return userMapper.list();
	}
}
