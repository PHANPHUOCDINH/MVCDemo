package controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import businesslogic.KhachHangBusiness;
import businesslogic.LoaiSuaBusiness;
import javabean.KhachHang;
import javabean.LoaiSua;

@Controller
public class TrangChuController {
	@RequestMapping(value= {"/","/trang-chu"})
	public String trangchu()
	{
		return "trang-chu";
	}
	
}
