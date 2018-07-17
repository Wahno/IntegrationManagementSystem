<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*"%>
  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
  
<table align='center' border='1' cellspacing='0'>
    <tr>
        <td>id</td>
        <td>密码</td>
        <td>姓名</td>
        <td>性别</td>
        <td>电话</td>
        <td>手机</td>
        <td>地址</td>
        <td>权限</td>
        <td>注册时间</td>
    </tr>
    <c:forEach items="${admin}" var="a">
        <tr>
            <td>${a.aId}</td>
            <td>${a.aPassword}</td>
            <td>${a.aName}</td>
            <td>${a.aSex}</td>
            <td>${a.aTel}</td>
            <td>${a.aPhoNum}</td>
            <td>${a.aAddr}</td>
            <td>${a.aLimit}</td>
            <td>${a.aDate}</td>
        </tr>
    </c:forEach>
</table>