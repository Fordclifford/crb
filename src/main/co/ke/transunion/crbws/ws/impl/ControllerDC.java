
package co.ke.transunion.crbws.ws.impl;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import co.ke.transunion.crbws.ws.CreditBal;
import co.ke.transunion.crbws.ws.ObjectFactory;
import co.ke.transunion.crbws.ws.Product201;
import co.ke.transunion.crbws.ws.Product250;
import co.ke.transunion.crbws.ws.ServerInfo;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ControllerDC", targetNamespace = "http://ws.crbws.transunion.ke.co/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ControllerDC {


    /**
     * 
     * @param password
     * @param code
     * @param infinityCode
     * @param username
     * @return
     *     returns co.ke.transunion.crbws.ws.CreditBal
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getCreditBal", targetNamespace = "http://ws.crbws.transunion.ke.co/", className = "co.ke.transunion.crbws.ws.GetCreditBal")
    @ResponseWrapper(localName = "getCreditBalResponse", targetNamespace = "http://ws.crbws.transunion.ke.co/", className = "co.ke.transunion.crbws.ws.GetCreditBalResponse")
    @Action(input = "http://ws.crbws.transunion.ke.co/ControllerDC/getCreditBalRequest", output = "http://ws.crbws.transunion.ke.co/ControllerDC/getCreditBalResponse")
    public CreditBal getCreditBal(
        @WebParam(name = "username", targetNamespace = "")
        String username,
        @WebParam(name = "password", targetNamespace = "")
        String password,
        @WebParam(name = "code", targetNamespace = "")
        String code,
        @WebParam(name = "infinityCode", targetNamespace = "")
        String infinityCode);

    /**
     * 
     * @param password
     * @param code
     * @param infinityCode
     * @param username
     * @return
     *     returns co.ke.transunion.crbws.ws.ServerInfo
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getServerInfo", targetNamespace = "http://ws.crbws.transunion.ke.co/", className = "co.ke.transunion.crbws.ws.GetServerInfo")
    @ResponseWrapper(localName = "getServerInfoResponse", targetNamespace = "http://ws.crbws.transunion.ke.co/", className = "co.ke.transunion.crbws.ws.GetServerInfoResponse")
    @Action(input = "http://ws.crbws.transunion.ke.co/ControllerDC/getServerInfoRequest", output = "http://ws.crbws.transunion.ke.co/ControllerDC/getServerInfoResponse")
    public ServerInfo getServerInfo(
        @WebParam(name = "username", targetNamespace = "")
        String username,
        @WebParam(name = "password", targetNamespace = "")
        String password,
        @WebParam(name = "code", targetNamespace = "")
        String code,
        @WebParam(name = "infinityCode", targetNamespace = "")
        String infinityCode);

    /**
     * 
     * @param passportNo
     * @param code
     * @param dateOfBirth
     * @param postalBoxNo
     * @param postalCountry
     * @param password
     * @param name4
     * @param name3
     * @param infinityCode
     * @param nationalID
     * @param taxID
     * @param postalTown
     * @param name2
     * @param serviceID
     * @param name1
     * @param alienID
     * @param username
     * @param reportReason
     * @return
     *     returns co.ke.transunion.crbws.ws.Product201
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getProduct201", targetNamespace = "http://ws.crbws.transunion.ke.co/", className = "co.ke.transunion.crbws.ws.GetProduct201")
    @ResponseWrapper(localName = "getProduct201Response", targetNamespace = "http://ws.crbws.transunion.ke.co/", className = "co.ke.transunion.crbws.ws.GetProduct201Response")
    @Action(input = "http://ws.crbws.transunion.ke.co/ControllerDC/getProduct201Request", output = "http://ws.crbws.transunion.ke.co/ControllerDC/getProduct201Response")
    public Product201 getProduct201(
        @WebParam(name = "username", targetNamespace = "")
        String username,
        @WebParam(name = "password", targetNamespace = "")
        String password,
        @WebParam(name = "code", targetNamespace = "")
        String code,
        @WebParam(name = "infinityCode", targetNamespace = "")
        String infinityCode,
        @WebParam(name = "name1", targetNamespace = "")
        String name1,
        @WebParam(name = "name2", targetNamespace = "")
        String name2,
        @WebParam(name = "name3", targetNamespace = "")
        String name3,
        @WebParam(name = "name4", targetNamespace = "")
        String name4,
        @WebParam(name = "nationalID", targetNamespace = "")
        String nationalID,
        @WebParam(name = "passportNo", targetNamespace = "")
        String passportNo,
        @WebParam(name = "serviceID", targetNamespace = "")
        String serviceID,
        @WebParam(name = "alienID", targetNamespace = "")
        String alienID,
        @WebParam(name = "taxID", targetNamespace = "")
        String taxID,
        @WebParam(name = "dateOfBirth", targetNamespace = "")
        XMLGregorianCalendar dateOfBirth,
        @WebParam(name = "postalBoxNo", targetNamespace = "")
        String postalBoxNo,
        @WebParam(name = "postalTown", targetNamespace = "")
        String postalTown,
        @WebParam(name = "postalCountry", targetNamespace = "")
        String postalCountry,
        @WebParam(name = "reportReason", targetNamespace = "")
        int reportReason);

    /**
     * 
     * @param code
     * @param companyName
     * @param companyRegNo
     * @param vatID
     * @param postalBoxNo
     * @param companyRegDate
     * @param postalCountry
     * @param password
     * @param infinityCode
     * @param taxID
     * @param postalTown
     * @param username
     * @param reportReason
     * @return
     *     returns co.ke.transunion.crbws.ws.Product250
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getProduct250", targetNamespace = "http://ws.crbws.transunion.ke.co/", className = "co.ke.transunion.crbws.ws.GetProduct250")
    @ResponseWrapper(localName = "getProduct250Response", targetNamespace = "http://ws.crbws.transunion.ke.co/", className = "co.ke.transunion.crbws.ws.GetProduct250Response")
    @Action(input = "http://ws.crbws.transunion.ke.co/ControllerDC/getProduct250Request", output = "http://ws.crbws.transunion.ke.co/ControllerDC/getProduct250Response")
    public Product250 getProduct250(
        @WebParam(name = "username", targetNamespace = "")
        String username,
        @WebParam(name = "password", targetNamespace = "")
        String password,
        @WebParam(name = "code", targetNamespace = "")
        String code,
        @WebParam(name = "infinityCode", targetNamespace = "")
        String infinityCode,
        @WebParam(name = "companyName", targetNamespace = "")
        String companyName,
        @WebParam(name = "companyRegNo", targetNamespace = "")
        String companyRegNo,
        @WebParam(name = "taxID", targetNamespace = "")
        String taxID,
        @WebParam(name = "vatID", targetNamespace = "")
        String vatID,
        @WebParam(name = "companyRegDate", targetNamespace = "")
        XMLGregorianCalendar companyRegDate,
        @WebParam(name = "postalBoxNo", targetNamespace = "")
        String postalBoxNo,
        @WebParam(name = "postalTown", targetNamespace = "")
        String postalTown,
        @WebParam(name = "postalCountry", targetNamespace = "")
        String postalCountry,
        @WebParam(name = "reportReason", targetNamespace = "")
        int reportReason);

}
