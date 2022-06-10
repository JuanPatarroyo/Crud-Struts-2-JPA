<%-- 
    Document   : person
    Created on : 9/06/2022, 8:31:29 p. m.
    Author     : jpatarroyo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <title><s:text name="person.title" /></title>
    </head>
    <body>
        <h1><s:text name="person.title" /></h1>

        <s:if test="people.size() > 0">
            <div>
                <table border="1">
                    <tr>
                        <th><s:text name="p.personId" /></th>
                        <th><s:text name="p.name" /></th>
                        <th><s:text name="p.surname" /></th>
                        <th><s:text name="p.secondSurname" /></th>
                        <th><s:text name="p.email" /></th>
                    </tr>
                    <s:iterator value="people">
                        <tr>
                            <td><s:property value="id" /></td>
                            <td><s:property value="name" /></td>
                            <td><s:property value="surname" /></td>
                            <td><s:property value="lastSurname" /></td>
                            <td><s:property value="email" /></td>
                        </tr>
                    </s:iterator>
                </table>
            </div>
        </s:if>

        <s:form>
            <s:submit key="person.button" name="submit" />
        </s:form>

        <div><s:text name="person.count" />: <s:property value="peopleCount" /></div>
    </body>
</html>