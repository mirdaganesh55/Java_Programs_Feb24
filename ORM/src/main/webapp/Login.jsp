<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core" %>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html" %>

<f:view>
    <html>
    
    <head>
    <link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Poppins:ital,wght@0,100;0,200;0,300;0,400;0,500;0,600;0,700;0,800;0,900;1,100;1,200;1,300;1,400;1,500;1,600;1,700;1,800;1,900&display=swap" rel="stylesheet">
        <title>SimplyRail</title>
    </head>
    <body onload="generate()" style="display: flex;
            justify-content: center;
            align-items: center;">
    <div style="display:grid;justify-content:center;  align-items:center;font-family:'Poppins';border:3px solid #5198bf;width:400px;padding:50px;
    border-radius:30px;">
    <h:form id="form">
            <h2>Passenger Login</h2>

            <h:outputLabel for="username">UserName:</h:outputLabel>
            <h:inputText id="username" value="#{login.username}" />
            <br />

            <h:outputLabel for="password">Password:</h:outputLabel>
            <h:inputSecret id="password" value="#{login.password}" />
            <br />

            <h:commandButton value="Login" action="#{loginDao.loginDao(login)}" />
            
            <h:outputText value="#{passWordErr3}" id="success_message" />
            <div id="signup_prompt">
              <p>Don't have an account?</p><a href="#"> Sign Up.</a>	
            </div>
          
        </h:form>
    </div>
        
    </body>
    </html>
</f:view>
