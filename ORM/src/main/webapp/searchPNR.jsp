<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<f:view>
	<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>PNR Status</title>
<link rel="stylesheet" href="Pnr.css">
</head>
<body>

	<div class="irctc-heading">
		<img src="irctc-logo.png" alt="IRCTC Logo" class="irctc-logo" />
		<h1>IRCTC PNR Status</h1>
		<p class="irctc-info">Official Indian Railways PNR Status Enquiry</p>
	</div>

	<h:form id="form" rendered="#{!not empty PnrData}">
		<label for="PnrNum">Enter PNR Number</label>
		<h:inputText id="PnrNum" value="#{booking.pnr}" required="true" />
		<br />
		<h:commandButton value="Submit"
			action="#{bookingController.getDataByPnr(booking.pnr)}" /> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		<h:commandButton value="Clear"
			action="#{bookingdao.clearbutton(booking)}" />
		<br />
		<h:message for="PnrNum" />
	</h:form>

	<h:form id="PNREnquiry" rendered="#{not empty PnrData}">
		<h:panelGroup rendered="#{not empty PnrData}">

			<center>
				<h2>Passenger Current Status Enquiry</h2>
				<hr />


				<h:dataTable value="#{PnrData}" var="e" border="3">
					<h6>You Queried For : PNR Number:</h6>
					<h:column>
						<f:facet name="header">
							<h:outputText value="Train Number" />
						</f:facet>
						<h:outputText value="#{e.trainNo}" />
					</h:column>
					<h:column>
						<f:facet name="header">
							<h:outputText value="Train Name" />
						</f:facet>
						<h:outputText value="#{e.trainName}" />
					</h:column>
					<h:column>
						<f:facet name="header">
							<h:outputText value="Boarding Date(YYYY-MM-DD)" />
						</f:facet>
						<h:outputText value="#{e.journeyDate}" />
					</h:column>
					<h:column>
						<f:facet name="header">
							<h:outputText value="From" />
						</f:facet>
						<h:outputText value="#{e.source}" />
					</h:column>
					<h:column>
						<f:facet name="header">
							<h:outputText value="To" />
						</f:facet>
						<h:outputText value="#{e.destination}" />
					</h:column>
					<h:column>
						<f:facet name="header">
							<h:outputText value="Reserved Upto" />
						</f:facet>
						<h:outputText value="#{e.destination}" />
					</h:column>
					<h:column>
						<f:facet name="header">
							<h:outputText value="Boarding Point" />
						</f:facet>
						<h:outputText value="#{e.source}" />
					</h:column>
					<h:column>
						<f:facet name="header">
							<h:outputText value="Class" />
						</f:facet>
						<h:outputText value="#{e.coach}" />
					</h:column>
				</h:dataTable>
				<br />

				<div class="t2">
					<h:dataTable value="#{PnrData}" var="e" border="3"
						style="display: inline-block;">
						<h:column>
							<f:facet name="header">
								<h:outputText value="Passenger Name" />
							</f:facet>
							<h:outputText value="#{e.passengerName}" />
						</h:column>

						<h:column>
							<f:facet name="header">
								<h:outputText value="Booking Status" />
							</f:facet>
							<h:outputText value="#{e.status}" />
						</h:column>

						<h:column>
							<f:facet name="header">
								<h:outputText value="Ticket Price" />
							</f:facet>
							<h:outputText value="#{e.cost}" />
						</h:column>
					</h:dataTable>
				</div>
			</center>
		</h:panelGroup>
		<h:commandButton action="#{bookingdao.Backbutton()}" value="Back"
			style=" font-size: large;
    margin-top: 23px;
    margin-left: 302px;" />

	</h:form>

</body>
	</html>
</f:view>
