<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>员工管理界面</title>
</head>
<body>
<a href="" >添加</a>
<table border="1" align="center">
    <thead>
    <tr>
        <th>员工编号</th>
        <th>姓名</th>
        <th>部门</th>
        <th>修改</th>
        <th>删除</th>
    </tr>
    </thead>
    <tbody>
        <c:forEach var="emp" items="${requestScope.get('list')}" varStatus="status">
            <tr>
                <td>${emp.empid}</td>
                <td>${emp.ename}</td>
                <td>${emp.depid}</td>
                <td>
                    <a href="${path}/Emp/toupdateEmp?id=${emp.empid}">更改</a>
                </td>
                <td>
                    <a href="${path}/Emp/del/${emp.empid}">删除</a>
                </td>
            </tr>
        </c:forEach>
    </tbody>
</table>
</body>
</html>
<script>
    function confirm(){
        if (!confirm("确定删除？")){
            window.Event.returnValue = false;
        }
    }
</script>