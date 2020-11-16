<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<center>
		<form action="Process" method="post">
			<h1>Hi Welcome to filters sessions!</h1>
			<table>
				<tr>
					<td><input type="text" name="uname"
						placeholder="enter your user name" >
						
						
					</td>
					<td>
						<%
							String message = (String) request.getAttribute("message");
						if (message != null) {
							out.println(message);
						}
						%>
					</td>
				</tr>
				<tr>
					<td><input type="text" name="name"
						placeholder="enter your  name" value="">
						
						</td>
					<td>
						<%
							String message2 = (String) request.getAttribute("message2");
						if (message2 != null) {
							out.println(message2);
						}
						%>
					</td>
				</tr>
				<tr>
					<td><input type="email" name="email"
						placeholder="enter your email"></td>
					<td>
						<%
							String message3 = (String) request.getAttribute("message3");
						if (message3 != null) {
							out.println(message3);
						}
						%>
					</td>
				</tr>

				<tr>
					<td><input type="password" name="password"
						placeholder="enter your password"></td>
					<td>
						<%
							String message4 = (String) request.getAttribute("message4");
						if (message4 != null) {
							out.println(message4);
						}
						%>
						<tr>
					<td><input type="password" name="cpassword"
						placeholder="enter your confirm-password"></td>
					<td>
						<%
							String message5 = (String) request.getAttribute("message5");
						if (message5 != null) {
							out.println(message5);
						}
						%>
						
					</td>
				</tr>
				<tr>
				<td>
				<input type="submit" value="login!">
				</td>
				</center>
			</table>
		</form>
</body>
</html>