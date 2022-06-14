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
        <title><s:text name="form.title" /></title>
    </head>
    <body>
        <h1><s:text name="form.title" /></h1>
        <a href="<s:url action="addPerson"/>"><s:text name="form.add" /></a>
        <s:if test="people.size() > 0">
            <div>
                <table border="1">
                    <tr>
                        <th><s:text name="p.personId" /></th>
                        <th><s:text name="p.name" /></th>
                        <th><s:text name="p.surname" /></th>
                        <th><s:text name="p.secondSurname" /></th>
                        <th><s:text name="p.email" /></th>
                        <th><s:text name="form.edit" /></th>
                        <th><s:text name="form.delete" /></th>
                    </tr>
                    <s:iterator value="people">
                        <tr>
                            <td><s:property value="id" /></td>
                            <td><s:property value="name" /></td>
                            <td><s:property value="surname" /></td>
                            <td><s:property value="lastSurname" /></td>
                            <td><s:property value="email" /></td>
                            <td>
                                <s:url action="updatePerson" var="updateUrl">
                                    <s:param name="person.id" value="%{id}"></s:param>
                                </s:url>
                                <s:a href="%{updateUrl}"><s:text name="form.edit" /></s:a>
                                </td>
                                <td>
                                <s:url action="deletePerson" var="deleteUrl">
                                    <s:param name="person.id" value="%{id}"></s:param>
                                </s:url>
                                <s:a href="%{deleteUrl}"><s:text name="form.delete" /></s:a>
                                </td>
                            </tr>
                    </s:iterator>
                </table>
            </div>
        </s:if>
    </body>
</html>