package service;
import java.sql.*;
import java.util.*;
import func.*;
import util.GetConnection;
public class service {
	GetConnection c;
	Connection con;
	PreparedStatement ps;
	public service() {
		c=new GetConnection();
		con=c.getDBConnection();
	}
	public pnrStatus pnr(long no){
		
		try {
			ps=con.prepareStatement("Select * from TRAINMS.passenger where pnr=?");
			ps.setLong(1, no);
			ResultSet rs=ps.executeQuery();
			pnrStatus pnrObj=null;
			while(rs.next())
			{	
				pnrObj=new pnrStatus(rs.getLong(1),rs.getString(2),rs.getInt(3),rs.getString(4),rs.getInt(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getLong(9));
			System.out.println("pnr found");
			}
			return pnrObj;
		}catch(Exception e) {
			System.out.println("Error in pnr function service class");
			e.printStackTrace();
			return null;
		}	
	}
	public ArrayList<trainBWStation> trainBetweenStation(String st1,String st2){
		ArrayList<trainBWStation> a=null;
		try {
			ps=con.prepareStatement("select * from train where train_id in (SELECT train_id FROM route WHERE train_id in (SELECT train_id FROM route WHERE station_id='?') and station_id='?');");
			ps.setString(1, st1);
			ps.setString(2, st2);
			ResultSet rs=ps.executeQuery();
			a= new ArrayList<trainBWStation>();
			while(rs.next()) {
				
				a.add( new trainBWStation( rs.getLong(1) , rs.getString(2) ,rs.getString(3) ) );
			}
		}
		catch(Exception e) {
			System.out.println("Error in  trainBetweenStation function service class");
			e.printStackTrace();
		}
		return a;
	}
	public ArrayList<route> trainSchedule(long train_no){
		ArrayList<route> a=null;
		try {
			ps=con.prepareStatement("select train_id,station_id,stop_no,arr_time,dept_time from route where train_id=14626 order by stop_no");
			ps.setLong(1, train_no);
			ResultSet rs=ps.executeQuery();
			a= new ArrayList<route>();
			while(rs.next()) {
				
				a.add( new route( rs.getLong(1) , rs.getString(2) ,rs.getInt(3) ,rs.getString(4) ,rs.getString(5) ) );
			}
		}
		catch(Exception e) {
			System.out.println("Error in  trainSchedule function service class");
			e.printStackTrace();
		}
		return a;
		
		
	}

}
