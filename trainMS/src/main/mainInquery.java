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
		
	}


}
