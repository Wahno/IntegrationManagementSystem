<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*"%>
  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
  
<table align='center' border='1' cellspacing='0'>
    <tr>
        <td>用户ID</td>
        <td>消费日期</td>
        <td>消费时间</td>
        <td>商品ID</td>
        <td>消费数量</td>
        <td>操作类型ID</td>
        <td>购买类型ID</td>
        <td>获得积分</td>
        <td>消费备注</td>
        <td>员工ID</td>
    </tr>
    <c:forEach items="${consume}" var="c">
        <tr>
            <td>${c.uId}</td>
            <td>${c.cDate}</td>
            <td>${c.cTime}</td>
            <td>${c.gId}</td>
            <td>${c.cNum}</td>
            <td>${c.oTid}</td>
            <td>${c.bTid}</td>
            <td>${c.cRedits}</td>
            <td>${c.cRemark}</td>
            <td>${c.sId}</td>
        </tr>
    </c:forEach>
</table>