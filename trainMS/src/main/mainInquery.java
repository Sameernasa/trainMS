package main;
import service.*;
import func.*;
import java.io.*;
import java.util.*;

//import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class mainInquery extends HttpServlet  {
/**
	 * 
	 */
	service serviceObj=new service();
	protected void pnrFunc(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
		
		pnrStatus pnrObj=serviceObj.pnr(Long.parseLong(req.getParameter("pnrNo")));
		if(pnrObj!=null) {
			
			req.setAttribute("sts","found");
			System.out.print(pnrObj.pnr);
			req.setAttribute("pnr",pnrObj.pnr);
			req.setAttribute("p_name",pnrObj.p_name);
			req.setAttribute("age",pnrObj.age);
			req.setAttribute("seat_no",pnrObj.seat_no);
			req.setAttribute("train_id",pnrObj.train_id);
			req.setAttribute("u_id",pnrObj.u_id);
			req.setAttribute("reserve_status",pnrObj.reserve_status);
			req.setAttribute("gender",pnrObj.gender);
			req.getRequestDispatcher("pnrStatus.jsp").forward(req, res);
		}
		else {
			req.setAttribute("sts","not found");
			req.setAttribute("print","Enter a valid pnr no.");
			req.getRequestDispatcher("pnrStatus.jsp").forward(req, res);
		}
		
	}
	protected void trainBWStation(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
		ArrayList<trainBWStation> a=serviceObj.trainBetweenStation(req.getParameter("from"), req.getParameter("to"));
		if(a!=null)
		{	
			if(a.size()!=0) {
				req.setAttribute("flag","found");
				req.setAttribute("list",a);
				System.out.println("found");
				
				for(int i=0;i<a.size();i++)
				System.out.println(a.get(i).train_id);
				req.getRequestDispatcher("trainBWStation.jsp").forward(req, res);
			}
			else {
				System.out.println("not found");
				req.setAttribute("flag","not found");
				req.setAttribute("list",null);
				req.getRequestDispatcher("trainBWStation.jsp").forward(req, res);
			}
		}	
	}
	protected void trainSchedule(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
		ArrayList<route> a=serviceObj.trainSchedule(Long.parseLong(req.getParameter("train_id")));
		if(a!=null)
		{
			if(a.size()!=0) {
				req.setAttribute("flag","found");
				req.setAttribute("list",a);
				System.out.print(" found");
				for(int i=0;i<a.size();i++)
					System.out.println(a.get(i).station_id);
			}
			else {
				req.setAttribute("flag","not found");
				req.setAttribute("list",null);
				System.out.print("not found");
			}
			req.getRequestDispatcher("trainSchedule.jsp").forward(req, res);
		}
	}
	protected void trainStatus(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
		trainStatus trainStatusObj=serviceObj.trainStatus(Long.parseLong(req.getParameter("train_id")));
		System.out.print("1");
		if(trainStatusObj!=null) {
			System.out.print("4");
			req.setAttribute("flag","found");
			req.setAttribute("avai_seat",trainStatusObj.avai_seat);
			req.setAttribute("book_seat",trainStatusObj.book_seat);
			req.setAttribute("train_id",trainStatusObj.train_id);
			req.setAttribute("wait_seat",trainStatusObj.wait_seat);
			
		}
		else {
			System.out.print("5");
			req.setAttribute("flag","not found");
			req.setAttribute("print","Enter a valid train no.");
		}
		req.getRequestDispatcher("trainStatus.jsp").forward(req, res);
	}
	protected void login(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
		String uname=serviceObj.login(req.getParameter("user_name"),req.getParameter("pass"));
		System.out.print(uname);
		if(uname!=null)
		{ 
			req.getRequestDispatcher("home.jsp").forward(req, res);
			
		}
		else {
			req.setAttribute("notfound","please enter valid user name and password");
			req.getRequestDispatcher("login.jsp").forward(req, res);
		}
	}
	private static final long serialVersionUID = 1L;
	
protected void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException {
	String action = req.getParameter("action");
	
		if(action.equals("pnrStatus")) {
			pnrFunc(req,res);	  
			  
		}
		if(action.equals("trainBWStation")) {
				  
			trainBWStation(req,res);
		}
		if(action.equals("trainSchedule")) {
			  
			trainSchedule(req,res);
		}
		if(action.equals("trainStatus")) {
			  
			trainStatus(req,res);
		}
		if(action.equals("login")) {
			  
			login(req,res);
		}
	}


}
