package controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import businesslogic.KhachHangBusiness;
import javabean.KhachHang;

@Controller
public class KhachHangController {
	@RequestMapping("/khach-hang")
	public ModelAndView khachhang()
	{
		ModelAndView mav = new ModelAndView();
		List<KhachHang> listKH= KhachHangBusiness.dsKH();
		mav.addObject("khachHangs",listKH);
		mav.setViewName("trang-thong-tin-khach-hang");
		return mav;
	}
	@RequestMapping(value="/them-khach-hang",method= RequestMethod.GET)
	public String themkhachhang()
	{
		return "trang-them-khach-hang";
	}
	@RequestMapping(value="/them-khach-hang",method= RequestMethod.POST)
	public ModelAndView themkhachhang1(HttpServletRequest request)
	{
		ModelAndView mav= new ModelAndView();
		String maKH=request.getParameter("txtMaKH");
		String tenKH=request.getParameter("txtTenKH");
		String phai=request.getParameter("rdbPhai");
		String diaChi=request.getParameter("txtDiaChi");
		String dienThoai=request.getParameter("txtDienThoai");
		String email=request.getParameter("txtEmail");
		KhachHang kh=new KhachHang();
		kh.setDiaChi(diaChi);
		kh.setDienThoai(dienThoai);
		kh.setEmail(email);
		kh.setMaKhachHang(maKH);
		kh.setGioiTinh(phai.equals("Nu")?1:0);
		kh.setTenKhachHang(tenKH);
		int check=KhachHangBusiness.them(kh);
		mav.addObject("check", check);
		mav.setViewName("trang-them-khach-hang");
		return mav;
	}
}
