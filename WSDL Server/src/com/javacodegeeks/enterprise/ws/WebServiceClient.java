package com.javacodegeeks.enterprise.ws;

import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Service;
import javax.xml.ws.handler.MessageContext;

public class WebServiceClient{

	public static void main(String[] args) throws Exception {

	    URL wsdlUrl = new URL("http://localhost:8888/webservice/helloworld?wsdl");

	    //qualifier name ...
        QName qname = new QName("http://ws.enterprise.javacodegeeks.com/", "WebServiceImplService");

        Service service = Service.create(wsdlUrl, qname);

        WebServiceInterface sayHello = service.getPort(WebServiceInterface.class);

        Map<String, Object> requestContext = ((BindingProvider)sayHello).getRequestContext();

        requestContext.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, "http://localhost:8888/webservice/helloworld?wsdl");

        Map<String, List<String>> requestHeaders = new HashMap<String, List<String>>();

        requestHeaders.put("username", Collections.singletonList("nikos"));
        requestHeaders.put("Password", Collections.singletonList("superpassword"));

        requestContext.put(MessageContext.HTTP_REQUEST_HEADERS, requestHeaders);

        System.out.println(sayHello.getHelloWorldAsString("- This is Java Code Geeks"));

    }
}