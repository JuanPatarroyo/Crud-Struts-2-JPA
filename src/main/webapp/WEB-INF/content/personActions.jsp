<%-- 
    Document   : personActions
    Created on : 13/06/2022, 10:47:50 p. m.
    Author     : jpatarroyo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <title><s:text name="form.detail" /></title>
    </head>
    <body>
        <h1><s:text name="form.detail" /></h1>
         <a href="<s:url action="list"/>"><s:text name="form.list" /></a>

        <s:form action="savePerson">
            <s:hidden name="person.id" />
            <s:textfield name="person.name" key="p.name" />
            <s:textfield name="person.surname" key="p.surname" />
            <s:textfield name="person.lastSurname" key="p.secondSurname" />
             <s:textfield name="person.email" key="p.email" />
             <s:submit action="savePerson" key="form.send"/>
        </s:form>
    </body>
</html>