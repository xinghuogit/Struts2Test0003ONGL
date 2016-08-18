<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>OGNL表达式语言学习</title>
</head>
<body>
	<ol>
		<li>访问值栈中的action的普通属性：username = <s:property value="username" /></li>
		<li>访问值栈中对象的普通属性（get set\方法）：<s:property value="user.age" /> | <s:property
				value="user['age']" /> | <s:property value="user[\"age\"]" /> |
			wrong: <%--<s:property value="user[age]"/>--%></li>
		<li>访问值栈中对象的普通属性(get set方法): <s:property value="cat.friend.name" /></li>
		<li>访问值栈中对象的普通方法: <s:property value="password.length()" /></li>
		<li>访问值栈中对象的普通方法: <s:property value="cat.miaomiao()" /></li>
		<li>访问值栈中的action的普通方法: <s:property value="m()" /></li>
		<hr />
		<li>访问静态方法:<s:property value="@com.struts2.ongl.model.S@s()" /></li>
		<li>访问静态属性:<s:property value="@com.struts2.ongl.model.S@STR" /></li>
		<li>访问Math类的静态构造方法：<s:property value="@@max(2,3)" /> 两个@ 就是Math类
		</li>
		<hr />
		<li>访问普通类的构造方法：<s:property
				value="new com.struts2.ongl.model.User(13245325)"/></li>
		<hr />
		
		

	</ol>

	<s:debug></s:debug>
</body>
</html>