<%@page language="java"%>

<%@taglib prefix="jstl" uri= "http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="acme" tagdir="/WEB-INF/tags"%>

<acme:form readonly="true">
	<acme:form-textbox code="anonymous.topInvestor.form.label.name" path="name"/>
	<acme:form-textbox code="anonymous.topInvestor.form.label.sector" path="sector"/>
	<acme:form-textbox code="anonymous.topInvestor.form.label.investingStatement" path="investingStatement"/>
	<acme:form-integer code="anonymous.topInvestor.form.label.star" path="star"/>
	
	<acme:form-return code="anonymous.topInvestor.form.button.return" />	
</acme:form>