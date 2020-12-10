<%@ page import="func.*" %>
<%@include file="header.jsp" %>
<form action="Mainservlet" method="post">
		Enter Train No.<input type="text" name="train_id">
		<button type="submit" name="action" value="trainStatus">Go</button>
	</form>
<%String flag=null;%>
<%flag=(String)request.getAttribute("flag"); %>
<%if(flag!=null){ %>
	<%if(flag.equals("found")){ %>
		<table>
				<tr>
				    <th>Train no.</th>
				    <th>Available seats</th>
				    <th>Booked seats</th>
				    <th>Waiting seats</th>
  				</tr>
  
				
					<tr>
					    <td><%=request.getAttribute("train_id") %></td>
					    <td><%=request.getAttribute("avai_seat") %></td>
					    <td><%=request.getAttribute("book_seat") %></td>
					    <td><%=request.getAttribute("wait_seat") %></td>
				 	 </tr>				
				
				</table>
	<% }else{%>
		<%out.print("enter a valid Train no");%>	
<%}}%>
<%@include file="footer.jsp" %>