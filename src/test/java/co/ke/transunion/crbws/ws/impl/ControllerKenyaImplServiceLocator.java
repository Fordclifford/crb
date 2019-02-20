/**
 * ControllerKenyaImplServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package co.ke.transunion.crbws.ws.impl;

public class ControllerKenyaImplServiceLocator extends org.apache.axis.client.Service implements co.ke.transunion.crbws.ws.impl.ControllerKenyaImplService {

    public ControllerKenyaImplServiceLocator() {
    }


    public ControllerKenyaImplServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ControllerKenyaImplServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ControllerKenyaImplPort
    private java.lang.String ControllerKenyaImplPort_address = "file:///C:/Users/moses.munene/Documents/workspace-sts-3.8.1.RELEASE/CRBWSClientExample/src/resources/ke.wsdl_1.wsdl";

    public java.lang.String getControllerKenyaImplPortAddress() {
        return ControllerKenyaImplPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ControllerKenyaImplPortWSDDServiceName = "ControllerKenyaImplPort";

    public java.lang.String getControllerKenyaImplPortWSDDServiceName() {
        return ControllerKenyaImplPortWSDDServiceName;
    }

    public void setControllerKenyaImplPortWSDDServiceName(java.lang.String name) {
        ControllerKenyaImplPortWSDDServiceName = name;
    }

    public co.ke.transunion.crbws.ws.ControllerKenya getControllerKenyaImplPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ControllerKenyaImplPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getControllerKenyaImplPort(endpoint);
    }

    public co.ke.transunion.crbws.ws.ControllerKenya getControllerKenyaImplPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            co.ke.transunion.crbws.ws.impl.ControllerKenyaImplPortBindingStub _stub = new co.ke.transunion.crbws.ws.impl.ControllerKenyaImplPortBindingStub(portAddress, this);
            _stub.setPortName(getControllerKenyaImplPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setControllerKenyaImplPortEndpointAddress(java.lang.String address) {
        ControllerKenyaImplPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (co.ke.transunion.crbws.ws.ControllerKenya.class.isAssignableFrom(serviceEndpointInterface)) {
                co.ke.transunion.crbws.ws.impl.ControllerKenyaImplPortBindingStub _stub = new co.ke.transunion.crbws.ws.impl.ControllerKenyaImplPortBindingStub(new java.net.URL(ControllerKenyaImplPort_address), this);
                _stub.setPortName(getControllerKenyaImplPortWSDDServiceName());
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
        if ("ControllerKenyaImplPort".equals(inputPortName)) {
            return getControllerKenyaImplPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://impl.ws.crbws.transunion.ke.co/", "ControllerKenyaImplService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://impl.ws.crbws.transunion.ke.co/", "ControllerKenyaImplPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ControllerKenyaImplPort".equals(portName)) {
            setControllerKenyaImplPortEndpointAddress(address);
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
