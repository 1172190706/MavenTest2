<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
${emp}<br>
${dl}
<form  action="add">
修改：姓名:<input type="text" name="ename" value="${emp.ename}">
性别：<input type="radio" name="sex" value="男" ${emp.sex=="男"?"checked":""}>男
<input type="radio" name="sex" value="女" ${emp.sex=="女"?"checked":""}>女
部门:<select name="dept.did">
<c:forEach items="${dl}" var="dept">
<option value="${dept.did}"  ${emp.dept.did==dept.did?"selected":""}>${dept.dname}</option>
</c:forEach>
</select>
工资：<input type="text" onkeyup="this.value=this.value.replace(/\D/g, '')" name="sar" value="${emp.sar}">
<input type="hidden" name="eid" value="${emp.eid}">
<input type="submit" value="添加">
</form>
</body>
</html>