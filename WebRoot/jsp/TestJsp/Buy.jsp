<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*"%>
  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
  
<table align='center' border='1' cellspacing='0'>
    <tr>
        <td>购买类型ID</td>
        <td>类型名称</td>
        <td>对应1元的积分</td>
    </tr>
    <c:forEach items="${buy}" var="b">
        <tr>
            <td>${b.bTid}</td>
            <td>${b.bTname}</td>
            <td>${b.bTCredit}</td>          
        </tr>
    </c:forEach>
</table>