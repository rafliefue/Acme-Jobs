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
	<acme:form-textbox code="anonymous.topRecord.form.label.companyName" path="companyname" />
	<acme:form-textbox code="anonymous.topRecord.form.label.sector" path="sector" />
	<acme:form-textbox code="anonymous.topRecord.form.label.ceoName" path="ceoname" />
	<acme:form-textarea code="anonymous.topRecord.form.label.activDescription" path="activdescription"/>
	<acme:form-url code="anonymous.topRecord.form.label.website" path="website" />
	<acme:form-textbox code="anonymous.topRecord.form.label.phone" path="phone" />
	<acme:form-textbox code="anonymous.topRecord.form.label.email" path="email" />
	<acme:form-textbox code="anonymous.topRecord.form.label.companyType" path="companytype" />
	<acme:form-integer code="anonymous.topRecord.form.label.rating" path="rating" />
	
  	<acme:form-return code="anonymous.topRecord.button.return"/>
</acme:form>
