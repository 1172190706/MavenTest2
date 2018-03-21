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
<form action="list">
模糊查询：姓名:<input type="text" name="ename">
部门:<select name="dept.did">
<option value="">--请选择--</option>
<c:forEach items="${dl}" var="dept">
<option value="${dept.did}">${dept.dname}</option>
</c:forEach>
</select>
<input type="submit" value="查询">
</form>
<br>
<button onclick="add()">添加</button>
<div id="addDiv" style="display: none;">
<form  action="add" >
添加：姓名:<input type="text" name="ename">
性别：<input type="radio" name="sex" value="男" checked="checked">男
<input type="radio" name="sex" value="女" >女
部门:<select name="dept.did">
<!-- <option value="">--请选择--</option>-->
<c:forEach items="${dl}" var="dept">
<option value="${dept.did}">${dept.dname}</option>
</c:forEach>
</select>
工资：<input type="text" onkeyup="this.value=this.value.replace(/\D/g, '')" name="sar" >
<input type="submit" value="添加">
</form>
</div>
<br>
 <table border="1" width="600" >
 <tr>
 <td>编号</td>
 <td>姓名</td>
 <td>性别</td>
 <td>部门</td>
 <td>工资</td>
 <td>操作</td>
 </tr>
 <c:forEach items="${el}" var="emp">
 <tr>
 <td>${emp.eid}</td>
 <td>${emp.ename}</td>
 <td>${emp.sex}</td>
 <td>${emp.dept.dname}</td>
 <td>${emp.sar}</td>
 <td><button onclick="del(${emp.eid})">删除</button>
 <button onclick="update(${emp.eid})">修改</button>
 </td>
 </tr>
  </c:forEach>
 </table>
 
 <script type="text/javascript">
 function add(){
	 var a = document.getElementById("addDiv");
	 a.style.display= "block";
 }
 
 function del(eid){
	location="del?eid="+eid;
 }
 
 function update(eid){
	  location="update?eid="+eid; 
 }
 </script>
 
</body>
</html>