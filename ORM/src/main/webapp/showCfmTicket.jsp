<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<f:view>
	<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Ticket Confirmation</title>
<link rel="stylesheet" href="Ticket.css">
</head>
<body>

	<h:form id="form" styleClass="form-border">
		<center>
			<h2>Your Ticket</h2>
			<hr />
		
			<h:outputLabel value="Train Name : " />
			<h:outputText value="#{bookingDetails.trainName}" />
			<br />
		
			<h:outputLabel value="Train Number : " />
			<h:outputText value="#{bookingDetails.trainNo}" />
			<br />
			
			<h:outputLabel value="Boarding Date: " />
			<h:outputText value="#{bookingDetails.journeyDate}" />
			<br />
			
			<h:outputLabel value="Coach : " />
			<h:outputText value="#{bookingDetails.coach}" />
			<br />
			
			<h:outputLabel value="PNR Number : " />
			<h:outputText value="#{bookingDetails.pnr}" />
			<br />
			
			<h:outputLabel value="Price  : " />
			<h:outputText value="#{bookingDetails.cost}" />
			<br />
			
			<h:outputLabel value="Name : " />
			<h:outputText value="#{bookingDetails.passengerName}" />
			<br />
			
			<h:outputLabel value="Age : " />
			<h:outputText value="#{bookingDetails.age}" />
			<br />
			
			<h:outputLabel value="Gender : " />
			<h:outputText value="#{bookingDetails.gender}" />
			<br />
			
			<h:outputLabel value="Source : " />
			<h:outputText value="#{bookingDetails.source}" />
			<br />
			
			<h:outputLabel value="Destination : " />
			<h:outputText value="#{bookingDetails.destination}" />
			<br />
			
			
		</center>
	</h:form>
	<center>
			<a href="addPassenger.jsf">Book Another Ticket</a>
	</center>
<%-- 			<h:commandButton action="#{bookingController.backToBookingTicket()}" value="Back" /> --%>
			
</body>
	</html>
</f:view>
