<%@ page import="java.util.*" %>
<%@ page import="func.*" %>
<%@include file="header.jsp" %>
<form action="Mainservlet" method="post" >
From <input type="text" name="from">
 To <input type="text" name="to">
 <button type="submit" name="action" value="trainBWStation">Go</button>
</form>
<%String flag=null;%>
<%flag=(String)request.getAttribute("flag"); %>
<%if(flag!=null){ %>
	<%trainBWStation category = new trainBWStation(); %>
	<%if(flag.equals("found")){ %>
		<%ArrayList<trainBWStation> list=new ArrayList<trainBWStation>(); %>
		<%list = (ArrayList<trainBWStation>) request.getAttribute("list");%>
		<%if(list.size()!=0){ %>
			<table>
				<tr>
				    <th>Train no.</th>
				    <th>Train name</th>
				    <th>Train type</th>
  				</tr>
  
				<%for(int i = 0; i < list.size(); i++) {category = list.get(i);%>
					<tr>
					    <td><%=category.train_id %></td>
					    <td><%=category.train_name%></td>
					    <td><%=category.train_type %></td>
				 	 </tr>				
				<% }%>
				</table>
		<%} %>
		
		
	<% }else{%>
	<%out.print("enter a valid station id"); %>
			
<%}} %>




<%@include file="footer.jsp" %>