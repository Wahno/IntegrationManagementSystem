<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*"%>
  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
  
<table align='center' border='1' cellspacing='0'>
    <tr>
        <td>操作类型ID</td>
        <td>操作类型名称</td>
    </tr>
    <c:forEach items="${operation}" var="o">
        <tr>
            <td>${o.oTid}</td>
            <td>${o.oTName}</td>
        </tr>
    </c:forEach>
</table>