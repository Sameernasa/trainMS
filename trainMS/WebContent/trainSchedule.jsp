<%@ page import="java.util.*" %>
<%@ page import="func.*" %>
<%@include file="header.jsp" %>
	<form action="Mainservlet" method="post">
		Enter Train No.<input type="text" name="train_id">
		<button type="submit" name="action" value="trainSchedule">Go</button>
	</form>
<%String flag=null;%>
<%flag=(String)request.getAttribute("flag"); %>
<%if(flag!=null){ %>
	<%route category = new route(); %>
	<%if(flag.equals("found")){ %>
		<%ArrayList<route> list=new ArrayList<route>(); %>
		<%list = (ArrayList<route>) request.getAttribute("list");%>
		<%if(list.size()!=0){ %>
			<table>
				<tr>
				    <th>Train no.</th>
				    <th>Station ID</th>
				    <th>Stop no</th>
				    <th>Arrival Time</th>
				    <th>Departure Time</th>
  				</tr>
  
				<%for(int i = 0; i < list.size(); i++) {category = list.get(i);%>
					<tr>
					    <td><%=category.train_id %></td>
					    <td><%=category.station_id %></td>
					    <td><%=category.stop_no %></td>
					    <td><%=category.arr_time %></td>
					    <td><%=category.dept_time %></td>
					    
					    
				 	 </tr>				
				<% }%>
				</table>
		<%} %>
		
		
	<% }else{%>
	<%out.print("enter a valid train no"); %>
			
<%}} %>

<%@include file="footer.jsp" %>