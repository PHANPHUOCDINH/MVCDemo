package businesslogic;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javabean.KhachHang;

public class KhachHangBusiness {
	public static int them(KhachHang kh)
	{
		Connection ketNoi = QLBS.getKetNoi();
		String sql = "INSERT INTO `khach_hang`(`Ma_khach_hang`, `Ten_khach_hang`, `Phai`, `Dia_chi`, `Dien_thoai`, `Email`) VALUES (?,?,?,?,?,?)";
		try {
			PreparedStatement ps=ketNoi.prepareStatement(sql);
			ps.setString(1, kh.getMaKhachHang());
			ps.setString(2, kh.getTenKhachHang());
	//		ps.setInt(3, (kh.getPhai().equals("Nam"))?0:1);
			ps.setInt(3, kh.getGioiTinh());
			ps.setString(4, kh.getDiaChi());
			ps.setString(5, kh.getDienThoai());
			ps.setString(6, kh.getEmail());
			return ps.executeUpdate();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return 0;
	}
	public static List<KhachHang> dsKH()
	{
		List<KhachHang> khachHangs = new ArrayList<>();
		Connection ketNoi = QLBS.getKetNoi();
		try {
			Statement stm = ketNoi.createStatement();
			ResultSet rs = stm.executeQuery("select * from khach_hang");
			while(rs.next()) {
				KhachHang kh = new KhachHang();
				kh.setMaKhachHang(rs.getString("ma_khach_hang"));
				kh.setTenKhachHang(rs.getString("ten_khach_hang"));
				kh.setGioiTinh(rs.getInt("phai"));
				kh.setDiaChi(rs.getString("dia_chi"));
				kh.setDienThoai(rs.getString("dien_thoai"));
				kh.setEmail(rs.getString("email"));
				khachHangs.add(kh);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return khachHangs;
	}
}
