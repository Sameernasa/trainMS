package main;
import service.*;
import func.*;
import java.io.*;
//import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class mainInquery extends HttpServlet  {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

protected void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException {
	String action = req.getParameter("action");
	service serviceObj=new service();
	if(action.equals("pnrStatus")) {
		
		pnrStatus pnrObj=serviceObj.pnr(Long.parseLong(req.getParameter("pnrNo")));
		if(pnrObj!=null) {
		System.out.print(pnrObj.pnr);}
		  RequestDispatcher rd=req.getRequestDispatcher("pnrStatus.jsp");
		  rd.forward(req, res);
	}
		
	}


}
