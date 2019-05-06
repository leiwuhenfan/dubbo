package org.apache.dubbo.demo;

import java.util.ArrayList;
import java.util.List;

import org.apache.dubbo.common.utils.Assert;

public class DemoServiceImpl implements DemoService {

	@Override
	public String sayHello(String name) {

		return "hello " + name + "!";
	}

	@Override
	public List<String> queryUsers(String[] ids) {
		Assert.notNull(ids, "查询学生编号为空!");

		List<String> usernames = new ArrayList<>();

		for (int i = 0; i < ids.length; i++) {
			usernames.add("用户" + (i + 1));
		}

		return usernames;
	}

}
