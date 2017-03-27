package cn.lsh.dubbo.test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;





import com.mchange.v2.c3p0.ComboPooledDataSource;

import cn.lsh.dubbo.bean.UserBean;
import cn.lsh.dubbo.registry.service.UserService;

public class TestJDBC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac=new FileSystemXmlApplicationContext("classpath:applicationContext.xml");
		UserService userService=(UserService) ac.getBean("userService");
//		SqlSessionFactory sqlSessionFactory=(SqlSessionFactory) ac.getBean("sqlSessionFactory");
//		SqlSession session=sqlSessionFactory.openSession();
//		session.commit();
//		System.out.println(session.getConnection());
		
		List<UserBean> list=userService.list();
		System.out.println(list.size());
		
//		ComboPooledDataSource dataSource=(ComboPooledDataSource) ac.getBean("dataSource");
//		System.out.println(dataSource.getJdbcUrl());
	}

}
