<%--
  Created by IntelliJ IDEA.
  User: Nitro V
  Date: 4/2/2025
  Time: 7:40 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Danh sách sách</title>
    <c:import url="../layout/library.jsp"/>
</head>
<body>
<c:import url="../layout/header.jsp"/>
<h2>Danh sách sách</h2>

<div class="container mt-4">
    <table class="table table-bordered table-striped table-hover text-center align-middle">
        <thead class="table-dark">
        <tr>
            <th>Mã sách</th>
            <th>Tên sách</th>
            <th>Tác giả</th>
            <th>Số lượng</th>
            <th>Mô tả</th>
            <th>Mượn</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${bookList}" var="books" varStatus="status">
            <tr>
                <td>${books.getMaSach()}</td>
                <td>${books.getTenSach()}</td>
                <td>${books.getTacGia()}</td>
                <td>${books.getSoLuong()}</td>
                <td>${books.getMoTa()}</td>
                <td>
                    <a href="borrow?maSach=${books.getMaSach()}" class="btn btn-primary">
                        Mượn
                    </a>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>

</body>
</html>
