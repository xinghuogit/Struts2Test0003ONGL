/*************************************************************************************************
 * 版权所有 (C)2015
 * 
 * 文件名称：User.java
 * 内容摘要：User.java
 * 当前版本：TODO
 * 作        者：李加蒙
 * 完成日期：2016年8月18日 下午3:12:05
 * 修改记录：
 * 修改日期：2016年8月18日 下午3:12:05
 * 版   本 号：
 * 修   改 人：
 * 修改内容：
 ************************************************************************************************/
package com.struts2.ongl.model;

/**
 * @filename 文件名称：User.java
 * @contents 内容摘要：
 */
public class User {
	private int age = 8;

	public User() {
	}

	public User(int age) {
		super();
		System.out.println("age:" + age);
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		
		this.age = age;
	}

	@Override
	public String toString() {
		System.out.println("1age:" + age);
		return "age:" + age;
	}

}
