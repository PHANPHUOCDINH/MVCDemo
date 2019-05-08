package javabean;

import java.io.Serializable;

public class LoaiSua implements Serializable {
	private String maloai,tenloai;
	public String getMaLoai() {
		return maloai;
	}
	public void setMaLoai(String maLoai) {
		this.maloai = maLoai;
	}
	public String getTenLoai() {
		return tenloai;
	}
	public void setTenLoai(String tenLoai) {
		this.tenloai = tenLoai;
	}
	

}
