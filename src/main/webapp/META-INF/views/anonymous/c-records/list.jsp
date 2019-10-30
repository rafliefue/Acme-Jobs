<%--
- list.jsp
-
- Copyright (c) 2019 Rafael Corchuelo.
-
- In keeping with the traditional purpose of furthering education and research, it is
- the policy of the copyright owner to permit non-commercial use and redistribution of
- this software. It has been tested carefully, but it is not guaranteed for any particular
- purposes.  The copyright owner does not offer any warranties or representations, nor do
- they accept any liabilities with respect to them.
--%>

<%@page language="java"%>

<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="acme" tagdir="/WEB-INF/tags"%>

<acme:form>
	<acme:list-column code="anonymous.c-record.list.label.companyName" path="companyName" width="10%"/>
	<acme:list-column code="anonymous.c-record.list.label.sector" path="sector" width="10%"/>
	<acme:list-column code="anonymous.c-record.list.label.ceoName" path="ceoName" width="10%"/>
	<acme:list-column code="anonymous.c-record.list.label.activDescription" path="activDescription" width="20%"/>
	<acme:list-column code="anonymous.c-record.list.label.website" path="website" width="10%"/>
	<acme:list-column code="anonymous.c-record.list.label.phone" path="phone" width="10%"/>
	<acme:list-column code="anonymous.c-record.list.label.email" path="email" width="10%"/>
	<acme:list-column code="anonymous.c-record.list.label.companyType" path="companyType" width="10%"/>
	<acme:list-column code="anonymous.c-record.list.label.rating" path="rating" width="10%"/>
</acme:form>
