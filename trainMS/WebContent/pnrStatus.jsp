<%@include file="header.jsp" %>
	<form action="Mainservlet" method="post">
		Enter PNR No.<input type="text" name="pnrNo">
		<button type="submit" name="action" value="pnrStatus">submit</button>
	</form>
	
	<table>
  <tr>
    <th>PNR no.</th>
    <th>Passenger Name</th>
    <th>Gender</th>
    <th>Age</th>
    <th>User ID</th>
    <th>Train no.</th>
    <th>Reserve Status</th>
    <th>Seat no.</th>
  </tr>
  <tr>
    <td><%= request.getAttribute("pnr")%></td>
    <td><%= request.getAttribute("p_name")%></td>
    <td><%= request.getAttribute("gender")%></td>
    <td><%= request.getAttribute("age")%></td>
    <td><%= request.getAttribute("u_id")%></td>
    <td><%= request.getAttribute("train_id")%></td>
    <td><%= request.getAttribute("reserve_status")%></td>
    <td><%= request.getAttribute("seat_no")%></td>
  </tr>
</table>

<%@include file="footer.jsp" %>