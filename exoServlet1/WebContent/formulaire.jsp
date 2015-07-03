<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>bienvenue sur loncoto</title>
</head>
<body>

<form action="Home" method="post">
prix : <input type="text" name="prix" id="prix" /><br />
poids: <input type="text" name="poids" id="poids" /><br />
quantité : <input type="text" name="quantite" id="quantite" /><br />
<input type="submit" value="calculer" /> <br />
</form>

</body>
</html>