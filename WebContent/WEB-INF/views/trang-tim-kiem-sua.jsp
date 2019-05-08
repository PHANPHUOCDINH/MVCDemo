<%-- 
    Document   : trang-tim-kiem-sua
    Author     : hvQ
--%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="dau-trang.jsp" %>
<fmt:setLocale value="vi-VN"/>
<div id="page4" class="main">
    <div class="col1 thuc-don">
        <%@include file="thuc-don.jsp"%>
    </div>
    <div class="col2">
    <form name="frmTimKiem" action="tim-kiem-sua" method="get">
        <table border="1">
            <thead>
                <tr>
                    <th>TÌM KIẾM THÔNG TIN SỮA</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td>
                        Loại sữa: 
                        <select name="cboLoaiSua">
                            <c:forEach items="${dsLoaiSua}" var="ls">
                                <option value="${ls.maLoai}" ${ls.maLoai==cboLoaiSua?"selected":""}>${ls.tenLoai}</option>
                            </c:forEach>
                        </select>
                        Hãng sữa:
                        <select name="cboHangSua">
                            <c:forEach items="${dsHangSua}" var="hs">
                                <option value="${hs.maHang}" ${hs.maHang==cboHangSua?"selected":""}>${hs.tenHang}</option>
                            </c:forEach>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td>Tên sữa: <input type="text" name="txtTenSuaTim" value="${txtTenSuaTim}" size="30"/>
                        <input type="submit" value="Tìm Kiếm" name="btnTimKiem"/>
                    </td>
                </tr>
            </tbody>
        </table>
    </form>
    <c:if test="${sosp>0}">
        <p><b>Có ${sosp} sản phẩm được tìm thấy</b></p>
        <table border="0">
            <c:forEach items="${dsSua}" var="s">
            <thead>
                <tr>
                    <th colspan="2" class="tieu-de-sua">${s.tenSua}</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td><a href="san-pham-sua/${s.maSua }"><img  src="images/${s.hinh}"></a></td>
                    <td>
                        <p><b>Thành phần dinh dưỡng:</b><br>${s.tpDinhDuong}</p>
                        <p><b>Lợi ích:</b><br>${s.loiIch}</p>
                        <fmt:formatNumber type="number" value="${s.donGia}" var="donGia"/>
                        <p><b>Trọng lượng:</b> ${s.trongLuong} gr - <b>Đơn giá:</b> ${s.donGia} đ</p>
                    </td>
                </tr>
            </tbody>
            </c:forEach>
        </table>
    </c:if>
    </div>
</div>
<%@include file="cuoi-trang.jsp" %>