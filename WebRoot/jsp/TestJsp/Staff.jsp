<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*"%>
  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
  
<table align='center' border='1' cellspacing='0'>
    <tr>
        <td>id</td>
        <td>姓名</td>
        <td>助记符</td>
        <td>性别</td>
        <td>电话</td>
        <td>手机</td>
        <td>地址</td>
        <td>注册日期</td>
        <td>备注</td>
    </tr>
    <c:forEach items="${staff}" var="s">
        <tr>
            <td>${s.sId}</td>
            <td>${s.sName}</td>
            <td>${s.sMark}</td>
            <td>${s.sSex}</td>
            <td>${s.sTel}</td>
            <td>${s.sPhoNum}</td>
            <td>${s.sAddr}</td>
            <td>${s.sRegDate}</td>
            <td>${s.sRemark}</td>
        </tr>
    </c:forEach>
</table>