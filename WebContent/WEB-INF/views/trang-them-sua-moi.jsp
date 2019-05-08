<%-- 
    Document   : trang-them-sua-moi
    Author     : hv
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="dau-trang.jsp" %>
<div id="page2" class="main">
    <div class="col1 thuc-don">
        <%@include  file="thuc-don.jsp" %>
    </div>
    <div class="col2">
        <form name="frmThemSua" action="them-sua-moi" method="post">
        <table border="0">
            <tbody>
            <c:if test="${check==1&&check!=null}">
	<span style="color:blue">Thêm thành công</span>
</c:if>
<c:if test="${check!=1&&check!=null}">
    <span style="color:red">Thêm thất bại</span>
</c:if>
           
	
                <tr>
                    <td>Mã sữa: </td>
                    <td><input type="text" name="txtMaSua" value="" /></td>
                </tr>
                <tr>
                    <td>Tên sữa: </td>
                    <td><input type="text" name="txtTenSua" value="" /></td>
                </tr>
                <tr>
                    <td>Hãng sữa: </td>
                    <td><select name="cboHangSua">
                            <c:forEach items="${dsHangSua}" var="hs">
                                <option value="${hs.maHang}">${hs.tenHang}</option>
                            </c:forEach>
                        </select></td>
                </tr>
                <tr>
                    <td>Lọai sữa: </td>
                    <td><select name="cboLoaiSua">
                            <c:forEach items="${dsLoaiSua}" var="ls">
                            <option value="${ls.maLoai}">${ls.tenLoai}</option>
                            </c:forEach>
                        </select></td>
                </tr>
                <tr>
                    <td>Trọng lượng: </td>
                    <td><input type="text" name="txtTrongLuong" value="" /></td>
                </tr>
                <tr>
                    <td>Đơn giá: </td>
                    <td><input type="text" name="txtDonGia" value="" /></td>
                </tr>
                <tr>
                    <td>TP dinh dưỡng: </td>
                    <td><textarea name="txtTPDinhDuong" rows="4" cols="20">
                        </textarea></td>
                </tr>
                <tr>
                    <td>Lợi ích: </td>
                    <td><textarea name="txtLoiIch" rows="4" cols="20">
                        </textarea></td>
                </tr>
                <tr>
                    <td>Hình ảnh: </td>
                    <td><input type="file" name="txtHinh" value="" width="50" /></td>
                </tr>
                <tr>
                    <td colspan="2">
                        <input type="submit" value="Thêm mới" name="btnThemMoi" />
                    </td>
                </tr>
            </tbody>
        </table>
        </form>                 
    </div>
</div>
<%@include file="cuoi-trang.jsp" %>