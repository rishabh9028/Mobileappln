package com.cg.mobile.dao;

import java.io.IOException;
import java.sql.*;

import com.cg.mobile.DTO.PurchaseDetails;
import com.cg.mobile.dbutil.DButil;
import com.cg.mobile.exception.MobileApplnException;


public class MobileDaoImpl implements IMobileDAO {
	public int addPurchaseDetails(PurchaseDetails p) throws MobileApplnException 
	{
		Connection conn=null;
		int result=0;
		try {
			conn=DButil.getConnection();
			String insertQuery="Insert into purchasedetails values(purchase_seq_id2.nextval,?,?,?,SYSDATE,?)";
			PreparedStatement ps=conn.prepareStatement(insertQuery);
			ps.setString(1,p.getcName());
			ps.setString(2,p.getMailId());
			ps.setString(3, p.getPhoneNo());
			String sql="Select mobileid from mobiles where mobileId=?";
			PreparedStatement pst=conn.prepareStatement(sql);
			pst.setInt(1,p.getMobileId());
			ResultSet rs=pst.executeQuery();
			
			while(rs.next())
			{
				ps.setInt(4, rs.getInt(1));
				result=ps.executeUpdate();
				
				System.out.println(result);
			}
			
			
			
			
		} catch (IOException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			
			throw new MobileApplnException(e.getMessage());
		}
		
		return result;
	}
}
