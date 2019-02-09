/**
 * CardValidatorServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package client;

public class CardValidatorServiceLocator extends org.apache.axis.client.Service implements client.CardValidatorService {

    public CardValidatorServiceLocator() {
    }


    public CardValidatorServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public CardValidatorServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for CardValidatorPort
    private java.lang.String CardValidatorPort_address = "http://localhost:4780/server/main";

    public java.lang.String getCardValidatorPortAddress() {
        return CardValidatorPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String CardValidatorPortWSDDServiceName = "CardValidatorPort";

    public java.lang.String getCardValidatorPortWSDDServiceName() {
        return CardValidatorPortWSDDServiceName;
    }

    public void setCardValidatorPortWSDDServiceName(java.lang.String name) {
        CardValidatorPortWSDDServiceName = name;
    }

    public client.CardValidator getCardValidatorPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(CardValidatorPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getCardValidatorPort(endpoint);
    }

    public client.CardValidator getCardValidatorPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            client.CardValidatorPortBindingStub _stub = new client.CardValidatorPortBindingStub(portAddress, this);
            _stub.setPortName(getCardValidatorPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setCardValidatorPortEndpointAddress(java.lang.String address) {
        CardValidatorPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (client.CardValidator.class.isAssignableFrom(serviceEndpointInterface)) {
                client.CardValidatorPortBindingStub _stub = new client.CardValidatorPortBindingStub(new java.net.URL(CardValidatorPort_address), this);
                _stub.setPortName(getCardValidatorPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("CardValidatorPort".equals(inputPortName)) {
            return getCardValidatorPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://server/", "CardValidatorService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://server/", "CardValidatorPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("CardValidatorPort".equals(portName)) {
            setCardValidatorPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
