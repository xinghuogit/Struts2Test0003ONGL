/*************************************************************************************************
 * 版权所有 (C)2015
 * 
 * 文件名称：Dog.java
 * 内容摘要：Dog.java
 * 当前版本：TODO
 * 作        者：李加蒙
 * 完成日期：2016年8月18日 下午3:52:17
 * 修改记录：
 * 修改日期：2016年8月18日 下午3:52:17
 * 版   本 号：
 * 修   改 人：
 * 修改内容：
 ************************************************************************************************/
package com.struts2.ongl.model;

/**
 * @filename 文件名称：Dog.java
 * @contents 内容摘要：
 */
public class Dog {
	private String name;

	public Dog() {
	}

	public Dog(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "name" + name;
	}

}
