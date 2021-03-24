<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>File Uploaded Result</title>
</head>
<body>
File Uploaded Successfully ..!
<h1>${msg}</h1>
<img alt="img" src="<c:url value="/resource/image/${filename}" />">
</body>
</html>