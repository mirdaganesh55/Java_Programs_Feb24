<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsf/html" prefix="p"%>
<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<f:view>
	<html>
<head>
<meta charset="UTF-8">
<title>JSP Page</title>
<script src="https://code.jquery.com/jquery-3.6.4.min.js"></script>
<script type="text/javascript"
	src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
<link rel="stylesheet" href="style.css">
</head>
<body>

	<div class="irctc-heading">
		<img src="irctc-logo.png" alt="IRCTC Logo" class="irctc-logo" />
		<h1>IRCTC DashBoard</h1>
		<p class="irctc-info">Official Indian Railways PNR Status Enquiry</p>
	</div>
	
	<h:form id="form" rendered="#{!not empty list}">
		<label for="TrainNum">Enter Train Number</label>
		<h:inputText id="TrainNum" value="#{booking.trainNo}" required="true" />
		<br />
		<h:commandButton value="Search"
			action="#{bookingController.searchTrainNum(booking.trainNo)}" 
			 style="background-color: aliceblue; color:black; padding: 10px; border: none; border-radius: 5px; cursor: pointer;"/>
		<br />
		<h:message for="TrainNum" />
		<a href="searchPNR.jsf" class="button-link">PNR Status</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		<a href="showTrain.jsf" class="button-link">Show Trains</a><br/>
	</h:form>

	<h:form id="bookingForm" rendered="#{not empty list}">
		<h:panelGroup rendered="#{not empty list}">
			<div class="center_contents">
				<h:dataTable value="#{list}" var="s" border="3">

					<h2>Train Detail</h2>
					<h:column>
						<f:facet name="header">
							<h:outputText value="Train Number" />
						</f:facet>
						<h:outputText value="#{s.number}" />
					</h:column>
					<h:column>
						<f:facet name="header">
							<h:outputText value="Train Name" />
						</f:facet>
						<h:outputText value="#{s.trainName}" />
					</h:column>
					<h:column>
						<f:facet name="header">
							<h:outputText value="Sleeper" />
						</f:facet>
						<h:outputText value="#{s.sl_price}" />
					</h:column>
					<h:column>
						<f:facet name="header">
							<h:outputText value="3AC" />
						</f:facet>
						<h:outputText value="#{s.TAC_price}" />
					</h:column>
					<h:column>
						<f:facet name="header">
							<h:outputText value="2AC" />
						</f:facet>
						<h:outputText value="#{s.SAC_price}" />
					</h:column>
					<h:column>
						<f:facet name="header">
							<h:outputText value="1AC" />
						</f:facet>
						<h:outputText value="#{s.FAC_price}" />
					</h:column>
				</h:dataTable>
			</div>
			<h2>BOOK TICKET</h2>
			<div class="coach-section">
				<label>Name</label>
				<h:inputText id="Name" value="#{booking.passengerName}" />


				<br /> <br />
				<%-- 			<h:message for="form:Name"/> --%>

				<label>Age</label>
				<h:inputText id="Age" value="#{booking.age}" />
				<br /> <br /> <label>Gender:</label>
				<h:selectOneMenu id="gender" value="#{booking.gender}">
					<f:selectItem itemLabel="Select Gender" />
					<f:selectItem itemLabel="MALE" itemValue="MALE" />
					<f:selectItem itemLabel="FEMALE" itemValue="FEMALE" />
				</h:selectOneMenu>
				<br /> <br /> <label>Select Coach:</label>
				<h:selectOneMenu id="coach" value="#{booking.coach}">
					<f:selectItem itemLabel="All Classes" />
					<f:selectItem itemLabel="SL" itemValue="sl_price" />
					<f:selectItem itemLabel="3A" itemValue="TAC_price" />
					<f:selectItem itemLabel="2A" itemValue="SAC_price" />
					<f:selectItem itemLabel="1A" itemValue="FAC_price" />
				</h:selectOneMenu>
				<br /> <br />
			</div>

			<div class="coach-section">
				<label>Select Quote:</label>
				<h:selectOneMenu id="Quote" value="#{booking.quote}">
					<f:selectItem itemLabel="General" itemValue="General" />
					<f:selectItem itemLabel="Lower Berth/SR Citizen"
						itemValue="Lower Berth/SR Citizen" />
					<f:selectItem itemLabel="Person With Disability"
						itemValue="Person With Disability" />
					<f:selectItem itemLabel="Duty Pass" itemValue="Duty Pass" />
					<f:selectItem itemLabel="Tatkal" itemValue="Tatkal" />
					<f:selectItem itemLabel="Premium Tatkal" itemValue="Premium Tatkal" />
				</h:selectOneMenu>
				<br /> <br />

				<!-- 				<label>Select Date</label> -->
				<%-- 				<h:inputText id="searchDate" value="#{booking.journeyDate}" --%>
				<%-- 					styleClass="datepicker" autocomplete="on" />  --%>
				<!-- 					<br /> -->
				<!-- 					<br /> -->

				<label>Station From</label>
				<h:inputText id="source" value="#{booking.source}" />
				<br /> <br /> <label>To Destination</label>
				<h:inputText id="destination" value="#{booking.destination}" />
				<br /> <br /> <label>Select Date(YYYY-MM-DD)</label>
				<h:inputText id="Select_Date" value="#{booking.journeyDate}" />
				<br /> <br />

			</div>

			<h:commandButton id="confirmation"
				action="#{bookingController.addPassenger(booking)}"
				value="Book Ticket" styleClass="confirmation-button" />&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;

<h:commandButton id="Back" action="#{bookingdao.Backbutton()}"
				value="Back" styleClass="back-button" />
		</h:panelGroup>
	</h:form>
</body>
	</html>
</f:view>


