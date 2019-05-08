package controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import businesslogic.SuaBusiness;
import businesslogic.HangSuaBusiness;
import businesslogic.LoaiSuaBusiness;
import javabean.Sua;
import javabean.HangSua;
import javabean.LoaiSua;

@Controller
public class SuaController {
	@RequestMapping(value="tim-kiem-sua",method=RequestMethod.GET)
	public ModelAndView timkiem(HttpServletRequest request)
	{
		ModelAndView mav= new ModelAndView();
		String maHang=request.getParameter("cboHangSua");
		String maLoai=request.getParameter("cboLoaiSua");
		String tenSua=request.getParameter("txtTenSuaTim");
		List<LoaiSua> dsLoai = LoaiSuaBusiness.getLoaiSuas();
		List<HangSua> dsHang = HangSuaBusiness.getHangSuas();
		mav.addObject("cboHangSua",maHang);
		mav.addObject("cboLoaiSua",maLoai);
		mav.addObject("txtTenSuaTim",tenSua);
		mav.addObject("dsLoaiSua",dsLoai);
		mav.addObject("dsHangSua",dsHang);
		List<Sua> dsSua = new ArrayList<Sua>();
		if (maHang != null) {
			if (maLoai != null) {
				if (tenSua != null)
					dsSua = SuaBusiness.dsSuaTheoLoaiHangTen(maHang, maLoai, tenSua);
				else
					dsSua = SuaBusiness.dsSuaTheoLoaiHang(maHang, maLoai);
			} else {
				if(tenSua!=null)
					dsSua=SuaBusiness.dsSuaTheoHangTen(maHang, tenSua);
				else 
					dsSua = SuaBusiness.dsSuaTheoHang(maHang);
			}
		} else {
			if (maLoai != null)
				{
					if(tenSua!=null)
						dsSua=SuaBusiness.dsSuaTheoLoaiTen(maLoai, tenSua);
					else
						dsSua=SuaBusiness.dsSuaTheoLoai(maLoai);
				}
			else 
				dsSua=SuaBusiness.dsSuaTheoTen(tenSua);
		}
		mav.addObject("sosp", dsSua.size());
		mav.addObject("dsSua", dsSua);
		mav.setViewName("trang-tim-kiem-sua");
		return mav;
	}
	@RequestMapping(value="them-sua-moi",method= RequestMethod.GET)
	public ModelAndView themsuamoi()
	{
		ModelAndView mav= new ModelAndView();
		List<LoaiSua> dsLoai = LoaiSuaBusiness.getLoaiSuas();
		List<HangSua> dsHang = HangSuaBusiness.getHangSuas();
		mav.addObject("dsLoaiSua",dsLoai);
		mav.addObject("dsHangSua",dsHang);
		mav.setViewName("trang-them-sua-moi");
		return mav;
	}
	@RequestMapping(value="them-sua-moi",method=RequestMethod.POST)
	public ModelAndView themsuamoi1(HttpServletRequest request)
	{
		ModelAndView mav= new ModelAndView();
		List<LoaiSua> dsLoai = LoaiSuaBusiness.getLoaiSuas();
		List<HangSua> dsHang = HangSuaBusiness.getHangSuas();
		mav.addObject("dsLoaiSua",dsLoai);
		mav.addObject("dsHangSua",dsHang);
		String maSua=request.getParameter("txtMaSua");
		String tenSua=request.getParameter("txtTenSua");
		String maHang=request.getParameter("cboHangSua");
		String maLoai=request.getParameter("cboLoaiSua");
		int trongLuong=Integer.parseInt(request.getParameter("txtTrongLuong"));
		int donGia=Integer.parseInt(request.getParameter("txtDonGia"));
		String tpDinhDuong=request.getParameter("txtTPDinhDuong");
		String loiIch=request.getParameter("txtLoiIch");
		String hinh=request.getParameter("txtHinh");
		Sua s=new Sua();
		s.setDonGia(donGia);
		s.setHinh(hinh);
		s.setLoiIch(loiIch);
		s.setMaHangSua(maHang);
		s.setMaLoaiSua(maLoai);
		s.setMaSua(maSua);
		s.setTenSua(tenSua);
		s.setTpDinhDuong(tpDinhDuong);
		s.setTrongLuong(trongLuong);
		int check=SuaBusiness.themSua(s);
		mav.addObject("check", check);
		mav.setViewName("trang-them-sua-moi");
		return mav;
	}
	@RequestMapping(value="san-pham-sua",method= RequestMethod.GET)
	public ModelAndView dsSua(HttpServletRequest request)
	{
			ModelAndView mav= new ModelAndView();
		    int trang=request.getParameter("trang")!=null?Integer.parseInt(request.getParameter("trang")):1;
	        List<Sua> dsSua =SuaBusiness.dsSua();
	        int tongSoTrang=dsSua.size()%5==0?dsSua.size()/5:dsSua.size()/5+1;
	        mav.addObject("tongSoTrang", tongSoTrang);
	        if(trang<tongSoTrang)
	        {
	        	mav.addObject("dsSua",dsSua.subList((trang-1)*5, (trang-1)*5+5));
	        }
	        else
	        {
	        	mav.addObject("dsSua",dsSua.subList((trang-1)*5, dsSua.size()));
	        }	
	       // mav.addObject("info", info);
	        mav.setViewName("trang-san-pham");
	        return mav;
	 }
	@RequestMapping(value="san-pham-sua/{maSua}",method=RequestMethod.GET)
	public ModelAndView sanpham(@PathVariable("maSua") String maSua)
	{
		ModelAndView mav= new ModelAndView();
		Sua s= SuaBusiness.sua(maSua);
		mav.addObject("sua", s);
		mav.setViewName("trang-thong-tin-sua");
		return mav;
	}
	@RequestMapping(value="/sua-ban-chay", method= RequestMethod.GET)
	public ModelAndView suabanchay(HttpServletRequest request)
	{
		ModelAndView mav= new ModelAndView();
		String maSua=request.getParameter("maSua");
        Sua sua=null;
        if(maSua!=null)
        {
        	sua=SuaBusiness.sua(maSua);
        }
        List<Sua> dsSua=SuaBusiness.dsSuaBanChay(5);
        mav.addObject("dsSua", dsSua);
        mav.addObject("sua", sua);
        mav.setViewName("trang-sua-ban-chay");
        return mav;
	}
}
