<%@include file="header.jsp" %>
	<form action="Mainservlet" method="post">
		Enter PNR No.<input type="text" name="pnrNo">
		<button type="submit" name="action" value="pnrStatus">submit</button>
	</form>
<%@include file="footer.jsp" %>