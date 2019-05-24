package com.example.wsrestfretecorreios;

import org.springframework.stereotype.Component;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

@Component 
public class SOAPConnector extends WebServiceGatewaySupport { 
 
    public Object callWebService(String soapActionCallback, Object request) {
        return getWebServiceTemplate().marshalSendAndReceive(request, new SoapActionCallback(soapActionCallback)); 
    }
}