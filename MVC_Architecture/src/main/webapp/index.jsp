<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml"
      xmlns:h="http://xmlns.jcp.org/jsf/html"
      xmlns:f="http://xmlns.jcp.org/jsf/core">

<head>
    <title>Captcha Example</title>
</head>
<body>
    <h1>Captcha Example</h1>

    <h:form id="captchaForm" >
        <h:outputLabel for="captcha">Enter CAPTCHA:</h:outputLabel>
        <h:inputText id="captcha" name="captcha" required="true"/>

        <h:graphicImage library="images" name="captcha" alt="Captcha Image"/>

        <h:commandButton value="Submit" type="submit"/>
    </h:form>
</body>
</html>
