<%-- 
    Document   : trang-thong-tin-sua
    Author     : hv
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="dau-trang.jsp"%>
<div id="page2" class="main">
    <div class="col1 thuc-don">
        <%@include file="thuc-don.jsp"%>
    </div>
    <div class="col2">
        <table border="0" width="100%">
         <tr>
                <td colspan="2" class="tieu-de-sua">${sua.tenSua}</td>
            </tr>
            <tr>
                <td><img src="<c:url value="/images/${sua.hinh}"/>"/></a></td>
                <td>
                    <p><b><i>Thành phần dinh dưỡng:</i></b><br> ${sua.tpDinhDuong}</p>
                    <p><b><i>Lợi ích:</i></b><br> ${sua.loiIch}</p>
                    <p><b><i>Trọng lượng:</i></b> ${sua.trongLuong } gr - <b><i>Đơn giá:</i></b> ${sua.donGia } đ</p>
                </td>
            </tr>
        </table>
    </div>
</div>
<%@include file="cuoi-trang.jsp"%>