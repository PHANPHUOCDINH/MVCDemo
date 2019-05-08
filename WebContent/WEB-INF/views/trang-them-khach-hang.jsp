<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="dau-trang.jsp"%>
<div id="page5" class="main">
	 <div class="col1 thuc-don">
        <%@include file="thuc-don.jsp"%>
    </div>
    
    <div class="col2">
        <form name="frmThemKhachHang" action="them-khach-hang" method="post">
        <table border="0">
            <thead>
                <tr>
                    <th colspan="4">THÊM KHÁCH HÀNG MỚI</th>
                </tr>
                <c:if test="${check==1&&check!=null}">
	<tr><span style="color:blue">Thêm thành công</span></tr>
</c:if>
<c:if test="${check!=1&&check!=null}">
    <tr><span style="color:red">Thêm thất bại</span></tr>
</c:if>
            </thead>
            <tbody>
                <tr>
                    <td>Mã KH</td>
                    <td><input type="text" name="txtMaKH" value="" /></td>
                    <td>Tên KH</td>
                    <td><input type="text" name="txtTenKH" value="" /></td>
                </tr>
                <tr>
                    <td>Phái</td>
                    <td>
                        <input type="radio" name="rdbPhai" value="Nam"/>Nam
                        <input type="radio" name="rdbPhai" value="Nu" />Nữ
                    </td>
                    <td>Địa chỉ</td>
                    <td><input type="text" name="txtDiaChi" value="" /></td>
                </tr>
                <tr>
                    <td>Điện thoại:</td>
                    <td><input type="text" name="txtDienThoai" value="" /></td>
                    <td>Email:</td>
                    <td><input type="text" name="txtEmail" value="" /></td>
                </tr>
                <tr>
                    <td colspan="4">
                        <input type="submit" value="Thêm mới" name="btnThemMoi" />
                    </td>
                </tr>
            </tbody>
        </table>
        </form>        
    </div>
</div>
<%@include file="cuoi-trang.jsp"%>
