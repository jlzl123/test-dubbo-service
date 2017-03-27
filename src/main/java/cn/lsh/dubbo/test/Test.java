package cn.lsh.dubbo.test;

import cn.lsh.dubbo.bean.User;
import cn.lsh.dubbo.registry.service.impl.TestRegistryServiceImpl;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User u=new User();
		u.setAge(1);
		u.setName("abc");
		u.setSex("女");
		System.out.println(u.getSex());
		TestRegistryServiceImpl t=new TestRegistryServiceImpl();
		System.out.println(t.hello("abc"));
	}

}
