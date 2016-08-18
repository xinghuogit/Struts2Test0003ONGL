/*************************************************************************************************
 * 版权所有 (C)2015
 * 
 * 文件名称：Cat.java
 * 内容摘要：Cat.java
 * 当前版本：TODO
 * 作        者：李加蒙
 * 完成日期：2016年8月18日 下午3:54:29
 * 修改记录：
 * 修改日期：2016年8月18日 下午3:54:29
 * 版   本 号：
 * 修   改 人：
 * 修改内容：
 ************************************************************************************************/
package com.struts2.ongl.model;

/**
 * @filename 文件名称：Cat.java
 * @contents 内容摘要：
 */
public class Cat {
	private Dog friend;

	public Dog getFriend() {
		return friend;
	}

	public void setFriend(Dog friend) {
		this.friend = friend;
	}

	public String miaomiao() {
		return "miaomaio";
	}

}
