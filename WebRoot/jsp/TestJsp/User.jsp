<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*"%>
  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
  
<table align='center' border='1' cellspacing='0'>
    <tr>
        <td>id</td>
        <td>姓名</td>
        <td>性别</td>
        <td>生日</td>
        <td>电话</td>
        <td>手机</td>
        <td>地址</td>
        <td>注册日期</td>
        <td>备注</td>
    </tr>
    <c:forEach items="${user}" var="u">
        <tr>
            <td>${u.uId}</td>
            <td>${u.uName}</td>
            <td>${u.uSex}</td>
            <td>${u.uBirth}</td>
            <td>${u.uTel}</td>
            <td>${u.uPhoNum}</td>
            <td>${u.uAddr}</td>
            <td>${u.uRegDate}</td>
            <td>${u.uRemark}</td>
        </tr>
    </c:forEach>
</table>