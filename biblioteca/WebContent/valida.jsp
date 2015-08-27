<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title> Validação de Usuário</title>
</head>
<body>
	
	<%
	
	     String usuario = request.getParameter("nmusuario");
	     String senha   = request.getParameter("nmsenha");
	     
	     if(usuario.equals("admin") && senha.equals("admin")){
	    	 
	    	 out.println("Usuário logado com sucesso!");
	    	 
	     } else {
	    	 out.println("Usuário ou senha incorreta!");
	     }
	
	%>
	
	
	
	
	
</body>
</html>