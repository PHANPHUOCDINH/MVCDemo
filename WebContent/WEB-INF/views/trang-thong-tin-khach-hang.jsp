<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="dau-trang.jsp" %>
<div id="page2" class="main">
   
    <div class="col1 thuc-don">
        <%@include file="thuc-don.jsp"%>
    </div>
    
    <div class="col2">
        <table border="1">
	<caption>THÔNG TIN KHÁCH HÀNG</caption>
	<tr>
		<th>Mã KH</th>
		<th>Tên khách hàng</th>
		<th>Giới tính</th>
		<th>Địa chỉ</th>
		<th>Điện thoại</th>
		<th>Email</th>
	</tr>
	<c:forEach items="${khachHangs}" var="kh">
	
		<tr>
			<td>${kh.maKhachHang }</td>
			<td>${kh.tenKhachHang }</td>
			<td><img src="images/${kh.gioiTinh==1?"nu.jpg":"nam.jpg"}"/> </td>
			<td>${kh.diaChi}</td>
			<td>${kh.dienThoai }</td>
			<td>${kh.email }</td>
		</tr>
	</c:forEach>
</table>
    </div>
</div>
<%@include file="cuoi-trang.jsp" %>