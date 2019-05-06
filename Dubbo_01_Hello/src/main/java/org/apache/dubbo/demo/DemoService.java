package org.apache.dubbo.demo;

import java.util.List;

public interface DemoService {
	/**
	 * 输出名字
	 * 
	 * @param name
	 * @return
	 */
	String sayHello(String name);

	/***
	 * 根据用户ID得到用户名字集合
	 * 
	 * @param ids
	 * @return
	 */
	List<String> queryUsers(String[] ids);
}
