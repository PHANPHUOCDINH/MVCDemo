<%-- 
    Document   : trang-chu
    Author     : hv
--%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="dau-trang.jsp" %>
<div id="page2" class="main">
    <div class="col1 thuc-don">
        <%@include file="thuc-don.jsp"%>
    </div>
    <div class="col2">
        
            <table border="1">
                <caption>DANH SÁCH SỮA ${info}</caption>
                <thead>
                    <tr>
                        <th>Hình</th>
                        <th>Tên sữa</th>
                        <th>Trọng lượng</th>
                        <th>Đơn giá</th>
                        <th>Thành phần dinh dưỡng</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${dsSua}" var="s">    
                    <tr>
                        <td style="text-align: center;"><a href="san-pham-sua/${s.maSua }"><img src="images/${s.hinh}"/></a></td>
                        <td><a href="san-pham-sua/${s.maSua }">${s.tenSua}</a></td>
                        <td style="text-align: right;">${s.trongLuong}</td>
                        <fmt:setLocale value="vi-VN"></fmt:setLocale>
                        <fmt:formatNumber value="${s.donGia}" var="donGia" type="number"></fmt:formatNumber>
                        <td style="text-align: right;">${s.donGia}</td>
                        <td style="text-align: right;">${s.tpDinhDuong}</td>
                    </tr>
                    </c:forEach>
                </tbody>
            </table>
            <div class="danh-sach-trang">
            <c:if test="${tongSoTrang>1}">
                <c:forEach var="i" begin="1" end="${tongSoTrang}" step="1">
             
                        <a href="san-pham-sua?trang=${i}"> ${i} </a>
                    
                </c:forEach>
            </c:if>
            </div>
        
        
    </div>
</div>
<%@include file="cuoi-trang.jsp" %>