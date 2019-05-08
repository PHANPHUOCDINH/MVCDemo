package businesslogic;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javabean.LoaiSua;

public class LoaiSuaBusiness {
	public static List<LoaiSua> getLoaiSuas(){
		List<LoaiSua> loaiSuas = new ArrayList<>();
		Connection ketNoi = QLBS.getKetNoi();
		try {
			Statement stm = ketNoi.createStatement();
			ResultSet rs = stm.executeQuery("select * from loai_sua");
			while(rs.next()) {
				LoaiSua ls = new LoaiSua();
				ls.setMaLoai(rs.getString("ma_loai_sua"));
				ls.setTenLoai(rs.getString("ten_loai"));
				loaiSuas.add(ls);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return loaiSuas;
	}
}