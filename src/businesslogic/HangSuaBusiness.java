package businesslogic;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.PreparedStatement;

import javabean.HangSua;

public class HangSuaBusiness {
	public static List<HangSua> getHangSuas(){
		List<HangSua> hangsua = new ArrayList<>();
		Connection ketNoi = QLBS.getKetNoi();
		try {
			Statement stm = ketNoi.createStatement();
			ResultSet rs = stm.executeQuery("select * from hang_sua");
			while(rs.next()) {
				HangSua ls = new HangSua();
				ls.setMaHang(rs.getString("ma_hang_sua"));
				ls.setTenHang(rs.getString("ten_hang_sua"));
				hangsua.add(ls);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return hangsua;
	}
	public static HangSua getByMaHang(String mahang){
		HangSua hangsua = new HangSua();
		Connection ketNoi = QLBS.getKetNoi();
		try {
			PreparedStatement ps=(PreparedStatement) ketNoi.prepareStatement("select * from hang_sua where ma_hang_sua=?");
			ps.setString(1, mahang);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				
				hangsua.setMaHang(rs.getString("ma_hang_sua"));
				hangsua.setTenHang(rs.getString("ten_hang_sua"));
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return hangsua;
	}
}
