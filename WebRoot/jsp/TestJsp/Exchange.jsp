<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*"%>
  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
  
<table align='center' border='1' cellspacing='0'>
    <tr>
        <td>用户ID</td>
        <td>兑换日期</td>
        <td>兑换时间</td>
        <td>商品ID</td>
        <td>兑换数量</td>
        <td>当前获得积分</td>
        <td>员工ID</td>
    </tr>
    <c:forEach items="${exchange}" var="e">
        <tr>
            <td>${e.uId}</td>
            <td>${e.exDate}</td>
            <td>${e.exTime}</td>
            <td>${e.gId}</td>
            <td>${e.exNum}</td>
            <td>${e.cRedits}</td>
            <td>${e.sId}</td>
        </tr>
    </c:forEach>
</table>