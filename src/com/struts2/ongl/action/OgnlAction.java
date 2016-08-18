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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.opensymphony.xwork2.ActionSupport;
import com.struts2.ongl.model.Cat;
import com.struts2.ongl.model.Dog;
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

	private Map<String, Dog> dogMap = new HashMap<String, Dog>();
	private Set<Dog> dogs = new HashSet<Dog>();
	private List<User> users = new ArrayList<User>();

	public OgnlAction() {
		users.add(new User(1));
		users.add(new User(2));
		users.add(new User(3));

		dogs.add(new Dog("dog1"));
		dogs.add(new Dog("dog2"));
		dogs.add(new Dog("dog3"));

		dogMap.put("dog100", new Dog("dog100"));
		dogMap.put("dog101", new Dog("dog101"));
		dogMap.put("dog102", new Dog("dog102"));
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

	public String m() {
		return "helloworld";
	}

	public Map<String, Dog> getDogMap() {
		return dogMap;
	}

	public void setDogMap(Map<String, Dog> dogMap) {
		this.dogMap = dogMap;
	}

	public Set<Dog> getDogs() {
		return dogs;
	}

	public void setDogs(Set<Dog> dogs) {
		this.dogs = dogs;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	@Override
	public String execute() throws Exception {
		return SUCCESS;
	}
}
