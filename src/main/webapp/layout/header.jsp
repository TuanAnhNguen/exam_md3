<%--
  Created by IntelliJ IDEA.
  User: Nitro V
  Date: 4/2/2025
  Time: 7:34 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<header>
    <div class="logo">Logo</div>
    <nav>
        <a href="/books">Danh Sách Sách</a>
        <a href="">Thống Kê Sách Đang Mượn</a>
    </nav>
</header>
<style>
    body {
        font-family: Arial, sans-serif;
        margin: 0;
        padding: 0;
    }
    header {
        display: flex;
        justify-content: space-between;
        padding: 10px;
        background: #333;
        color: white;
    }
    nav a {
        color: white;
        margin: 0 15px;
        text-decoration: none;
    }
    .container {
        display: flex;
    }
    aside {
        width: 200px;
        background: #f4f4f4;
        padding: 15px;
    }
    .content {
        flex: 1;
        padding: 20px;
    }
    footer {
        background: #333;
        color: white;
        padding: 20px 50px;
        font-size: 14px;
    }
    .footer-container {
        display: flex;
        justify-content: space-between;
        align-items: center;
    }

    .footer-left {
        max-width: 50%;
    }

    .footer-right {
        text-align: right;
    }

    .footer-right a {
        color: #ccc;
        text-decoration: none;
        margin: 0 5px;
    }

    .footer-right a:hover {
        text-decoration: underline;
    }

    h2{
        text-align: center;
    }
</style>