<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml"
      xmlns:h="http://java.sun.com/jsf/html"
      xmlns:f="http://java.sun.com/jsf/core">

    <h:head>
        <title>JSF Captcha</title>
    </h:head>

    <h:body onload="generate()">
        <h:form>
            <h:panelGroup id="user-input" styleClass="inline">
                <h:inputText id="submit" placeholder="Captcha code" />
            </h:panelGroup>

            <h:panelGroup styleClass="inline" onclick="generate()">
                <i class="fas fa-sync"></i>
            </h:panelGroup>

            <h:panelGroup id="image" styleClass="inline" selectable="false"></h:panelGroup>

            <h:commandButton id="btn" value="Submit" action="#{bean.printmsg}" />

            <h:outputText id="key" />
        </h:form>
    </h:body>
</html>
