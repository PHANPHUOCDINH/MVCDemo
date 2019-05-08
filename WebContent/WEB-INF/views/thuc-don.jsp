<%-- 
    Document   : thuc-don
    Author     : hv
--%>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<ul>
	<li><a href="${contextPath}/trang-chu"><img src="<c:url value="/images/Sunset.jpg"/>"/>Trang chủ</a></li>  
	<li><a href="${contextPath}/san-pham-sua"><img src="<c:url value="/images/Sunset.jpg"/>"/>Sản phẩm sữa</a></li>
    <li><a href="${contextPath}/sua-ban-chay"><img src="<c:url value="/images/ba_gai_1.jpg"/>"/>Sữa bán chạy</a></li>  
    <li><a href="${contextPath}/them-sua-moi"><img src="<c:url value="/images/icon_insert.jpg"/>"/>Thêm sữa mới</a></li>  
    <li><a href="${contextPath}/tim-kiem-sua"><img src="<c:url value="/images/icon_search.gif"/>"/>Tìm kiếm sữa</a></li>  
    <li><a href="${contextPath}/them-khach-hang"><img src="<c:url value="/images/icon_insert.jpg"/>"/>Thêm khách hàng</a></li>
    <li><a href="${contextPath}/khach-hang"><img src="<c:url value="/images/nam.jpg"/>"/>Khách hàng</a></li>
</ul>