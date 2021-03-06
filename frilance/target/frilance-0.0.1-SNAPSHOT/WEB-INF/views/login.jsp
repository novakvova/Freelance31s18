<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
    	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    	<title>Custom login</title>
    	<style type="text/css">
    		.error {
    			color: #ff0000;
    			font-weight: bold;
    		}    		
    		.msg {
    			color: #008000;
    			font-weight: bold;
    		}
    	</style>
	</head>
    <body>
        <h1 id="banner">Custom login form</h1>
        
        <!-- invalid credentials error msg -->
        <c:if test="${not empty error}">
			<div class="error">${error}</div>
		</c:if>
		
		<!-- logged out msg -->
		<c:if test="${not empty msg}">
			<div class="msg">${msg}</div>
		</c:if>
		
		<!-- custom login form -->
        <form name="loginform" action="<c:url value='/login'/>" method="POST">
            <table>
                <tr>
                    <td>Nombre de usuario:</td>		<!-- Enter username -->
                    <td><input type='text' name='username' value=''></td>
                </tr>
                <tr>
                    <td>Contraseņa:</td>			<!-- Enter password -->
                    <td><input type='password' name='password' /></td>
                </tr>
                <tr>
                    <td colspan="2">&nbsp;</td>
                </tr>
                <tr>
                    <td colspan='2'><input name="submit" type="submit" value="Submit" /></td>
                </tr>
            </table>
        </form>
    </body>
</html>