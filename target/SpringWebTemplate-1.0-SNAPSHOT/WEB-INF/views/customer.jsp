<%--<%--
  Created by IntelliJ IDEA.
  User: seandunn92
  Date: 5/8/17
  Time: 2:35 PM
  To change this template use File | Settings | File Templates.
--%>
<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>

<%--Use a form tag from the framework--%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>
    <title>Student Form Page</title>
    <style>

    </style>
</head>
<body>

<h2> Enter your information Information</h2>

<form:form method = "POST" action = "/addCustomer">
    <table>
        <tr>
            <td> <form:label path = "firstName"> First Name </form:label></td>
            <td> <form:input path="firstName"/> </td>
        </tr>
        <tr>
            <td> <form:label path = "coffeeChoice"> Coffee Choice </form:label></td>
            <td> <form:input path="coffeeChoice"/> </td>
        </tr>
        <%--<tr>--%>
            <%--<td> <form:label path = "age"> Age </form:label></td>--%>
            <%--<td> <form:input path="age"/> </td>--%>
        <%--</tr>--%>
        <%--<tr>--%>
            <%--<td> <form:label path = "id"> ID </form:label></td>--%>
            <%--<td> <form:input path="id"/> </td>--%>
        <%--</tr>--%>

        <tr>
            <td colspan="2">
                <input type ="submit"  value="Submit"/>
            </td>
        </tr>

    </table>

</form:form>

<script>

</script>

</body>

</html>