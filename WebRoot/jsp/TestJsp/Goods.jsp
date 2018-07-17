<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*"%>
  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
  
<table align='center' border='1' cellspacing='0'>
    <tr>
        <td>id</td>
        <td>名称</td>
        <td>数量</td>
        <td>成本</td>
        <td>售价</td>
        <td>兑换所需积分</td>
        <td>备注</td>
   </tr>
    <c:forEach items="${Goods}" var="g">
        <tr>
            <td>${g.gId}</td>
            <td>${g.gName}</td>
            <td>${g.gNum}</td>
            <td>${g.gCost}</td>
            <td>${g.gPrice}</td>
            <td>${g.gExchange}</td>
            <td>${g.gRemark}</td>
        </tr>
    </c:forEach>
</table>