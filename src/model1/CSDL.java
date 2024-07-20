package model1;

import java.sql.Connection;
import java.sql.SQLException;
import model1.business.DBConnection;

public class CSDL {
	public static void main(String[] args) throws SQLException{
		//tao ket noi den csdl tren may ao fedora sever 40
		Connection kncsdl = DBConnection.getInstance().getConnection();
		if(kncsdl != null) {
			System.out.println("ket noi toi may chu thanh cong");
		}else {
			System.out.println("loi ket noi");
		}
		}
}
