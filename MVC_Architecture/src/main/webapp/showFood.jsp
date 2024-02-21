<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%>

<f:view>
	<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Menu</title>
</head>
<body>
	<h:form>
		<center>
			<h2>
				<h:outputText value="Restaurent Food Items" />
			</h2>

			<h:dataTable value="#{foodController.getFoods()}" var="f" border="3">
				<h:column>
					<f:facet name="header">
						<h:outputLabel value="ID" />
					</f:facet>
					<h:outputText value="#{f.id}" />
				</h:column>
				<h:column>
					<f:facet name="header">
						<h:outputLabel value="Items" />
					</f:facet>
					<h:outputText value="#{f.item}" />
				</h:column>
				<h:column>
					<f:facet name="header">
						<h:outputLabel value="Price" />
					</f:facet>
					<h:outputText value="#{f.price}" />
				</h:column>
			</h:dataTable>
		</center>
	</h:form>
</body>
	</html>
</f:view>