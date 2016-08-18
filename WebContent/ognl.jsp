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
	</ol>

	<s:debug></s:debug>
</body>
</html>