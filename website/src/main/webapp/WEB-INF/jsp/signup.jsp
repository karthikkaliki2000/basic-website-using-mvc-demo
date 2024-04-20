<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
	<head></head>
	<body>
	<div>
	<h1>Welcome to Signin Page</h1>
	<form:form action="registerUser" modelAttribute="user">
	Name:
	<form:input path="name"/>
	<br/>
	<br/>
	Gender:
	<br/>
	Male
	<form:radiobutton path="gender" value="male"/>
	Female
	<form:radiobutton path="gender" value="female"/>
	<br/>
	<br/>
	Location:
	<form:select path="location">
	<form:option value="India"></form:option>
	<form:option value="NRI"></form:option>
	</form:select>
	<br/>
	<br/>
	
	Phone No:
	<form:input path="phoneNo"/>
	<br/>
	<br/>
	<input type="submit">
	</form:form>
	</div>
	</body>
</html>