<%@ include file = "/view/model-header.jsp" %>

<%=request.getSession().getAttribute("username") %>
Welcome login

<div>
	<form action="GroupConstructionServlet" method="post">
	Create A group: <input type="text" name="newgroupname" class="input-text" placeholder="Please input Group name">
	<button type="submit">Create</button>
	</form>
</div>


<%@ include file = "/view/model-footer.jsp"%>