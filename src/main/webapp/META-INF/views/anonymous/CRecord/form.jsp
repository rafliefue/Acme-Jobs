<%--
- form.jsp
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

<acme:form readonly="true">
	<acme:form-textbox code="anonymous.CRecord.form.label.companyName" path="companyName" />
	<acme:form-textbox code="anonymous.CRecord.form.label.sector" path="sector" />
	<acme:form-textbox code="anonymous.CRecord.form.label.ceoName" path="ceoName" />
	<acme:form-textarea code="anonymous.CRecord.form.label.activDescription" path="activDescription"/>
	<acme:form-textbox code="anonymous.CRecord.form.label.website" path="website" />
	<acme:form-textbox code="anonymous.CRecord.form.label.phone" path="phone" />
	<acme:form-textbox code="anonymous.CRecord.form.label.email" path="email" />
	<acme:form-textbox code="anonymous.CRecord.form.label.companyType" path="companyType" />
	<acme:form-textbox code="anonymous.CRecord.form.label.rating" path="rating" />
	
  	<acme:form-return code="anonymous.CRecords.button.return"/>
</acme:form>
