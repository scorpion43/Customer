<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<form:form action="/formularz" modelAttribute="form" method="post">

    Imię:
    <form:input path="imie" id="imie"></form:input>
    <c:if test="${pageContext.request.method=='POST'}"><form:errors path="imie" /></c:if>
    <br />

    Adres email:
    <form:input path="email" id="email"></form:input>
    <c:if test="${pageContext.request.method=='POST'}"><form:errors path="email" /></c:if>
    <br />

    Wiek:
    <form:input path="wiek" id="wiek"></form:input>
    <c:if test="${pageContext.request.method=='POST'}"><form:errors path="wiek" /></c:if>
    <br />

    <input type="submit" value="Wyślij formularz" />
</form:form>
</body>
</html>
