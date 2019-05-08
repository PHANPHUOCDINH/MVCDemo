package businesslogic;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javabean.HangSua;
import javabean.Sua;

public class SuaBusiness {
	public static int soLuongSua()
	{
		Connection ketNoi = QLBS.getKetNoi();
		String sql="select count(sua.ma_sua) as tong from sua";
		int t=0;
		try {
			PreparedStatement ps=ketNoi.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				return t=rs.getInt("tong");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return t;
	}
	public static List<Sua> dsSuaTheoLoaiHangTen(String mahang,String maloai,String tenSua){
		List<Sua> sua = new ArrayList<>();
		Connection ketNoi = QLBS.getKetNoi();
		String sql = "select * from sua where ma_hang_sua=? and ma_loai_sua=? and ten_sua like ?";
		try {
			PreparedStatement ps=ketNoi.prepareStatement(sql);
			ps.setString(1, mahang);
			ps.setString(2,maloai);
			ps.setString(3,"%"+ tenSua+"%");
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				Sua s=new Sua();
				s.setDonGia(rs.getInt("don_gia"));
				s.setHinh(rs.getString("hinh"));
				s.setLoiIch(rs.getString("loi_ich"));
				s.setMaHangSua(rs.getString("ma_hang_sua"));
				s.setMaLoaiSua(rs.getString("ma_loai_sua"));
				s.setMaSua(rs.getString("ma_sua"));
				s.setTenSua(rs.getString("ten_sua"));
				s.setTpDinhDuong(rs.getString("tp_dinh_duong"));
				s.setTrongLuong(rs.getInt("trong_luong"));
				sua.add(s);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		return sua;
	}
	public static List<Sua> dsSuaTheoLoaiHang(String mahang,String maloai){
		List<Sua> sua = new ArrayList<>();
		Connection ketNoi = QLBS.getKetNoi();
		String sql = "select * from sua where ma_hang_sua=? and ma_loai_sua=?";
		try {
			PreparedStatement ps=ketNoi.prepareStatement(sql);
			ps.setString(1, mahang);
			ps.setString(2,maloai);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				Sua s=new Sua();
				s.setDonGia(rs.getInt("don_gia"));
				s.setHinh(rs.getString("hinh"));
				s.setLoiIch(rs.getString("loi_ich"));
				s.setMaHangSua(rs.getString("ma_hang_sua"));
				s.setMaLoaiSua(rs.getString("ma_loai_sua"));
				s.setMaSua(rs.getString("ma_sua"));
				s.setTenSua(rs.getString("ten_sua"));
				s.setTpDinhDuong(rs.getString("tp_dinh_duong"));
				s.setTrongLuong(rs.getInt("trong_luong"));
				sua.add(s);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		return sua;
	}
	public static List<Sua> dsSuaTheoHangTen(String mahang,String tenSua){
		List<Sua> sua = new ArrayList<>();
		Connection ketNoi = QLBS.getKetNoi();
		String sql = "select * from sua where ma_hang_sua=? and ten_sua like ?";
		try {
			PreparedStatement ps=ketNoi.prepareStatement(sql);
			ps.setString(1, mahang);
			ps.setString(2,"%" +tenSua+"%");
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				Sua s=new Sua();
				s.setDonGia(rs.getInt("don_gia"));
				s.setHinh(rs.getString("hinh"));
				s.setLoiIch(rs.getString("loi_ich"));
				s.setMaHangSua(rs.getString("ma_hang_sua"));
				s.setMaLoaiSua(rs.getString("ma_loai_sua"));
				s.setMaSua(rs.getString("ma_sua"));
				s.setTenSua(rs.getString("ten_sua"));
				s.setTpDinhDuong(rs.getString("tp_dinh_duong"));
				s.setTrongLuong(rs.getInt("trong_luong"));
				sua.add(s);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		return sua;
	}
	public static List<Sua> dsSuaTheoLoaiTen(String maloai,String tenSua){
		List<Sua> sua = new ArrayList<>();
		Connection ketNoi = QLBS.getKetNoi();
		String sql = "select * from sua where ma_loai_sua=? and ten_sua like ?";
		try {
			PreparedStatement ps=ketNoi.prepareStatement(sql);
			ps.setString(1, maloai);
			ps.setString(2,"%"+tenSua+"%");
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				Sua s=new Sua();
				s.setDonGia(rs.getInt("don_gia"));
				s.setHinh(rs.getString("hinh"));
				s.setLoiIch(rs.getString("loi_ich"));
				s.setMaHangSua(rs.getString("ma_hang_sua"));
				s.setMaLoaiSua(rs.getString("ma_loai_sua"));
				s.setMaSua(rs.getString("ma_sua"));
				s.setTenSua(rs.getString("ten_sua"));
				s.setTpDinhDuong(rs.getString("tp_dinh_duong"));
				s.setTrongLuong(rs.getInt("trong_luong"));
				sua.add(s);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		return sua;
	}
	public static List<Sua> dsSuaTheoTen(String tenSua){
		List<Sua> sua = new ArrayList<>();
		Connection ketNoi = QLBS.getKetNoi();
		String sql = "select * from sua where ten_sua like ?";
		try {
			PreparedStatement ps=ketNoi.prepareStatement(sql);
			ps.setString(1,"%"+ tenSua+"%");
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				Sua s=new Sua();
				s.setDonGia(rs.getInt("don_gia"));
				s.setHinh(rs.getString("hinh"));
				s.setLoiIch(rs.getString("loi_ich"));
				s.setMaHangSua(rs.getString("ma_hang_sua"));
				s.setMaLoaiSua(rs.getString("ma_loai_sua"));
				s.setMaSua(rs.getString("ma_sua"));
				s.setTenSua(rs.getString("ten_sua"));
				s.setTpDinhDuong(rs.getString("tp_dinh_duong"));
				s.setTrongLuong(rs.getInt("trong_luong"));
				sua.add(s);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		return sua;
	}
	public static List<Sua> dsSua(int start,int end){
		List<Sua> sua = new ArrayList<>();
		Connection ketNoi = QLBS.getKetNoi();
		String sql = "select * from sua limit ?,?";
		try {
			PreparedStatement ps=ketNoi.prepareStatement(sql);
			ps.setInt(1, start);
			ps.setInt(2, end);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				Sua s=new Sua();
				s.setDonGia(rs.getInt("don_gia"));
				s.setHinh(rs.getString("hinh"));
				s.setLoiIch(rs.getString("loi_ich"));
				s.setMaHangSua(rs.getString("ma_hang_sua"));
				s.setMaLoaiSua(rs.getString("ma_loai_sua"));
				s.setMaSua(rs.getString("ma_sua"));
				s.setTenSua(rs.getString("ten_sua"));
				s.setTpDinhDuong(rs.getString("tp_dinh_duong"));
				s.setTrongLuong(rs.getInt("trong_luong"));
				sua.add(s);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		return sua;
	}
	public static List<Sua> dsSua(){
		List<Sua> sua = new ArrayList<>();
		Connection ketNoi = QLBS.getKetNoi();
		String sql = "select * from sua ";
		try {
			PreparedStatement ps=ketNoi.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				Sua s=new Sua();
				s.setDonGia(rs.getInt("don_gia"));
				s.setHinh(rs.getString("hinh"));
				s.setLoiIch(rs.getString("loi_ich"));
				s.setMaHangSua(rs.getString("ma_hang_sua"));
				s.setMaLoaiSua(rs.getString("ma_loai_sua"));
				s.setMaSua(rs.getString("ma_sua"));
				s.setTenSua(rs.getString("ten_sua"));
				s.setTpDinhDuong(rs.getString("tp_dinh_duong"));
				s.setTrongLuong(rs.getInt("trong_luong"));
				sua.add(s);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		return sua;
	}
	public static List<Sua> dsSuaTheoLoai(String maLoai){
		List<Sua> sua = new ArrayList<>();
		Connection ketNoi = QLBS.getKetNoi();
		String sql = "select * from sua where ma_loai_sua=? ";
		try {
			PreparedStatement ps=ketNoi.prepareStatement(sql);
			ps.setString(1, maLoai);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				Sua s=new Sua();
				s.setDonGia(rs.getInt("don_gia"));
				s.setHinh(rs.getString("hinh"));
				s.setLoiIch(rs.getString("loi_ich"));
				s.setMaHangSua(rs.getString("ma_hang_sua"));
				s.setMaLoaiSua(rs.getString("ma_loai_sua"));
				s.setMaSua(rs.getString("ma_sua"));
				s.setTenSua(rs.getString("ten_sua"));
				s.setTpDinhDuong(rs.getString("tp_dinh_duong"));
				s.setTrongLuong(rs.getInt("trong_luong"));
				sua.add(s);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		return sua;
	}
	public static List<Sua> dsSuaTheoHang(String maHang){
		List<Sua> sua = new ArrayList<>();
		Connection ketNoi = QLBS.getKetNoi();
		String sql = "select * from sua where ma_hang_sua=? ";
		try {
			PreparedStatement ps=ketNoi.prepareStatement(sql);
			ps.setString(1, maHang);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				Sua s=new Sua();
				s.setDonGia(rs.getInt("don_gia"));
				s.setHinh(rs.getString("hinh"));
				s.setLoiIch(rs.getString("loi_ich"));
				s.setMaHangSua(rs.getString("ma_hang_sua"));
				s.setMaLoaiSua(rs.getString("ma_loai_sua"));
				s.setMaSua(rs.getString("ma_sua"));
				s.setTenSua(rs.getString("ten_sua"));
				s.setTpDinhDuong(rs.getString("tp_dinh_duong"));
				s.setTrongLuong(rs.getInt("trong_luong"));
				sua.add(s);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		return sua;
	}
	public static List<Sua> dsSua(int pos){
		List<Sua> sua = new ArrayList<>();
		Connection ketNoi = QLBS.getKetNoi();
		String sql = "select * from sua limit "+pos*5+","+(pos*5+4);
		try {
			PreparedStatement ps=ketNoi.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				Sua s=new Sua();
				s.setDonGia(rs.getInt("don_gia"));
				s.setHinh(rs.getString("hinh"));
				s.setLoiIch(rs.getString("loi_ich"));
				s.setMaHangSua(rs.getString("ma_hang_sua"));
				s.setMaLoaiSua(rs.getString("ma_loai_sua"));
				s.setMaSua(rs.getString("ma_sua"));
				s.setTenSua(rs.getString("ten_sua"));
				s.setTpDinhDuong(rs.getString("tp_dinh_duong"));
				s.setTrongLuong(rs.getInt("trong_luong"));
				sua.add(s);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		return sua;
	}
	public static List<Sua> dsSuaTheoLoai(String maLoai,int pos){
		List<Sua> sua = new ArrayList<>();
		Connection ketNoi = QLBS.getKetNoi();
		String sql = "select * from sua where ma_loai_sua=? limit "+pos*5+","+(pos*5+4);
		try {
			PreparedStatement ps=ketNoi.prepareStatement(sql);
			ps.setString(1, maLoai);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				Sua s=new Sua();
				s.setDonGia(rs.getInt("don_gia"));
				s.setHinh(rs.getString("hinh"));
				s.setLoiIch(rs.getString("loi_ich"));
				s.setMaHangSua(rs.getString("ma_hang_sua"));
				s.setMaLoaiSua(rs.getString("ma_loai_sua"));
				s.setMaSua(rs.getString("ma_sua"));
				s.setTenSua(rs.getString("ten_sua"));
				s.setTpDinhDuong(rs.getString("tp_dinh_duong"));
				s.setTrongLuong(rs.getInt("trong_luong"));
				sua.add(s);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		return sua;
	}
	public static List<Sua> dsSuaTheoHang(String maHang,int pos){
		List<Sua> sua = new ArrayList<>();
		Connection ketNoi = QLBS.getKetNoi();
		String sql = "select * from sua where ma_hang_sua=? limit "+pos*5+","+(pos*5+4);
		try {
			PreparedStatement ps=ketNoi.prepareStatement(sql);
			ps.setString(1, maHang);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				Sua s=new Sua();
				s.setDonGia(rs.getInt("don_gia"));
				s.setHinh(rs.getString("hinh"));
				s.setLoiIch(rs.getString("loi_ich"));
				s.setMaHangSua(rs.getString("ma_hang_sua"));
				s.setMaLoaiSua(rs.getString("ma_loai_sua"));
				s.setMaSua(rs.getString("ma_sua"));
				s.setTenSua(rs.getString("ten_sua"));
				s.setTpDinhDuong(rs.getString("tp_dinh_duong"));
				s.setTrongLuong(rs.getInt("trong_luong"));
				sua.add(s);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		return sua;
	}
	public static int themSua(Sua sua)
	{
		Connection ketNoi = QLBS.getKetNoi();
		String sql = "INSERT INTO `sua`(`Ma_sua`, `Ten_sua`, `Ma_hang_sua`, `Ma_loai_sua`, `Trong_luong`, `Don_gia`, `Tp_dinh_duong`, `Loi_ich`, `Hinh`) VALUES (?,?,?,?,?,?,?,?,?)";
		try {
			PreparedStatement ps=ketNoi.prepareStatement(sql);
			ps.setString(1, sua.getMaSua());
			ps.setString(2,sua.getTenSua());
			ps.setString(3,sua.getMaHangSua());
			ps.setString(4,sua.getMaLoaiSua());
			ps.setInt(5,sua.getTrongLuong());
			ps.setInt(6,sua.getDonGia());
			ps.setString(7,sua.getTpDinhDuong());
			ps.setString(8,sua.getLoiIch());
			ps.setString(9,sua.getHinh());
			return ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
	public static List<Sua> dsSuaBanChay(int limit){
		List<Sua> sua = new ArrayList<>();
		Connection ketNoi = QLBS.getKetNoi();
		String sql = "SELECT sua.Ma_sua,sua.Ten_sua from sua,ct_hoadon where sua.Ma_sua=ct_hoadon.Ma_sua group by sua.Ma_sua order by sum(ct_hoadon.So_luong) DESC limit 0,"+limit;
		try {
			PreparedStatement ps=ketNoi.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				Sua s=new Sua();
				s.setMaSua(rs.getString("ma_sua"));
				s.setTenSua(rs.getString("ten_sua"));
				
				sua.add(s);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		return sua;
	}
	public static Sua sua(String maSua)
	{
		Connection ketNoi = QLBS.getKetNoi();
		Sua s=new Sua();
		String sql="SELECT * from sua where Ma_sua=?";
		try {
			PreparedStatement ps=ketNoi.prepareStatement(sql);
			ps.setString(1, maSua);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				s.setDonGia(rs.getInt("don_gia"));
				s.setHinh(rs.getString("hinh"));
				s.setLoiIch(rs.getString("loi_ich"));
				s.setMaHangSua(rs.getString("ma_hang_sua"));
				s.setMaLoaiSua(rs.getString("ma_loai_sua"));
				s.setMaSua(rs.getString("ma_sua"));
				s.setTenSua(rs.getString("ten_sua"));
				s.setTpDinhDuong(rs.getString("tp_dinh_duong"));
				s.setTrongLuong(rs.getInt("trong_luong"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}			
		return s;
	}
}
