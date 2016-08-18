/*************************************************************************************************
 * 版权所有 (C)2015
 * 
 * 文件名称：OgnlAction.java
 * 内容摘要：OgnlAction.java
 * 当前版本：TODO
 * 作        者：李加蒙
 * 完成日期：2016年8月18日 下午3:08:04
 * 修改记录：
 * 修改日期：2016年8月18日 下午3:08:04
 * 版   本 号：
 * 修   改 人：
 * 修改内容：
 ************************************************************************************************/
package com.struts2.ongl.action;

import com.opensymphony.xwork2.ActionSupport;
import com.struts2.ongl.model.Cat;
import com.struts2.ongl.model.User;

/**
 * @filename 文件名称：OgnlAction.java
 * @contents 内容摘要：
 */
public class OgnlAction extends ActionSupport {
	private String username;
	private String password;

	private User user;

	private Cat cat;

	public OgnlAction() {

	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Cat getCat() {
		return cat;
	}

	public void setCat(Cat cat) {
		this.cat = cat;
	}

	@Override
	public String execute() throws Exception {
		System.out.println("username:" + username);
		System.out.println("password:" + password);
		System.out.println("getUser().getAge():" + getUser().getAge());
		return SUCCESS;
	}

}
