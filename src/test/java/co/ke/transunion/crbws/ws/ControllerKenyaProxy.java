package co.ke.transunion.crbws.ws;

public class ControllerKenyaProxy implements co.ke.transunion.crbws.ws.ControllerKenya {
  private String _endpoint = null;
  private co.ke.transunion.crbws.ws.ControllerKenya controllerKenya = null;
  
  public ControllerKenyaProxy() {
    _initControllerKenyaProxy();
  }
  
  public ControllerKenyaProxy(String endpoint) {
    _endpoint = endpoint;
    _initControllerKenyaProxy();
  }
  
  private void _initControllerKenyaProxy() {
    try {
      controllerKenya = (new co.ke.transunion.crbws.ws.impl.ControllerKenyaImplServiceLocator()).getControllerKenyaImplPort();
      if (controllerKenya != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)controllerKenya)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)controllerKenya)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (controllerKenya != null)
      ((javax.xml.rpc.Stub)controllerKenya)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public co.ke.transunion.crbws.ws.ControllerKenya getControllerKenya() {
    if (controllerKenya == null)
      _initControllerKenyaProxy();
    return controllerKenya;
  }
  
  public co.ke.transunion.crbws.ws.Product150 getProduct150(java.lang.String username, java.lang.String password, java.lang.String code, java.lang.String infinityCode, java.lang.String companyName, java.lang.String companyRegNo, java.lang.String taxID, java.lang.String vatID, java.util.Calendar companyRegDate, java.lang.String postalBoxNo, java.lang.String postalTown, java.lang.String postalCountry, java.lang.String telephoneNo, java.lang.String faxNo, java.lang.String websiteAddress, java.lang.String physicalAddress, java.lang.String physicalTown, java.lang.String physicalCountry, int reportSector, int reportReason) throws java.rmi.RemoteException{
    if (controllerKenya == null)
      _initControllerKenyaProxy();
    return controllerKenya.getProduct150(username, password, code, infinityCode, companyName, companyRegNo, taxID, vatID, companyRegDate, postalBoxNo, postalTown, postalCountry, telephoneNo, faxNo, websiteAddress, physicalAddress, physicalTown, physicalCountry, reportSector, reportReason);
  }
  
  public co.ke.transunion.crbws.ws.Product151 getProduct151(java.lang.String username, java.lang.String password, java.lang.String code, java.lang.String infinityCode, java.lang.String companyName, java.lang.String companyRegNo, java.lang.String taxID, java.lang.String vatID, java.util.Calendar companyRegDate, java.lang.String postalBoxNo, java.lang.String postalTown, java.lang.String postalCountry, java.lang.String telephoneNo, java.lang.String faxNo, java.lang.String websiteAddress, java.lang.String physicalAddress, java.lang.String physicalTown, java.lang.String physicalCountry, int reportSector, int reportReason) throws java.rmi.RemoteException{
    if (controllerKenya == null)
      _initControllerKenyaProxy();
    return controllerKenya.getProduct151(username, password, code, infinityCode, companyName, companyRegNo, taxID, vatID, companyRegDate, postalBoxNo, postalTown, postalCountry, telephoneNo, faxNo, websiteAddress, physicalAddress, physicalTown, physicalCountry, reportSector, reportReason);
  }
  
  public co.ke.transunion.crbws.ws.Product152 getProduct152(java.lang.String username, java.lang.String password, java.lang.String code, java.lang.String infinityCode, java.lang.String companyName, java.lang.String companyRegNo, java.lang.String taxID, java.lang.String vatID, java.util.Calendar companyRegDate, java.lang.String postalBoxNo, java.lang.String postalTown, java.lang.String postalCountry, java.lang.String telephoneNo, java.lang.String faxNo, java.lang.String websiteAddress, java.lang.String physicalAddress, java.lang.String physicalTown, java.lang.String physicalCountry, int reportSector, int reportReason) throws java.rmi.RemoteException{
    if (controllerKenya == null)
      _initControllerKenyaProxy();
    return controllerKenya.getProduct152(username, password, code, infinityCode, companyName, companyRegNo, taxID, vatID, companyRegDate, postalBoxNo, postalTown, postalCountry, telephoneNo, faxNo, websiteAddress, physicalAddress, physicalTown, physicalCountry, reportSector, reportReason);
  }
  
  public co.ke.transunion.crbws.ws.Product153 getProduct153(java.lang.String username, java.lang.String password, java.lang.String code, java.lang.String infinityCode, java.lang.String companyName, java.lang.String companyRegNo, java.lang.String taxID, java.lang.String vatID, java.util.Calendar companyRegDate, java.lang.String postalBoxNo, java.lang.String postalTown, java.lang.String postalCountry, java.lang.String telephoneNo, java.lang.String faxNo, java.lang.String websiteAddress, java.lang.String physicalAddress, java.lang.String physicalTown, java.lang.String physicalCountry, int reportSector, int reportReason) throws java.rmi.RemoteException{
    if (controllerKenya == null)
      _initControllerKenyaProxy();
    return controllerKenya.getProduct153(username, password, code, infinityCode, companyName, companyRegNo, taxID, vatID, companyRegDate, postalBoxNo, postalTown, postalCountry, telephoneNo, faxNo, websiteAddress, physicalAddress, physicalTown, physicalCountry, reportSector, reportReason);
  }
  
  public co.ke.transunion.crbws.ws.CreditBal getCreditBal(java.lang.String username, java.lang.String password, java.lang.String code, java.lang.String infinityCode) throws java.rmi.RemoteException{
    if (controllerKenya == null)
      _initControllerKenyaProxy();
    return controllerKenya.getCreditBal(username, password, code, infinityCode);
  }
  
  public co.ke.transunion.crbws.ws.Product100 getProduct100(java.lang.String username, java.lang.String password, java.lang.String code, java.lang.String infinityCode, java.lang.String name1, java.lang.String name2, java.lang.String name3, java.lang.String name4, java.lang.String nationalID, java.lang.String passportNo, java.lang.String serviceID, java.lang.String alienID, java.lang.String taxID, java.util.Calendar dateOfBirth, java.lang.String postalBoxNo, java.lang.String postalTown, java.lang.String postalCountry, java.lang.String telephoneWork, java.lang.String telephoneHome, java.lang.String telephoneMobile, java.lang.String physicalAddress, java.lang.String physicalTown, java.lang.String physicalCountry, int reportSector, int reportReason) throws java.rmi.RemoteException{
    if (controllerKenya == null)
      _initControllerKenyaProxy();
    return controllerKenya.getProduct100(username, password, code, infinityCode, name1, name2, name3, name4, nationalID, passportNo, serviceID, alienID, taxID, dateOfBirth, postalBoxNo, postalTown, postalCountry, telephoneWork, telephoneHome, telephoneMobile, physicalAddress, physicalTown, physicalCountry, reportSector, reportReason);
  }
  
  public co.ke.transunion.crbws.ws.Product126 getProduct126(java.lang.String username, java.lang.String password, java.lang.String code, java.lang.String infinityCode, java.lang.String name1, java.lang.String name2, java.lang.String name3, java.lang.String name4, java.lang.String nationalID, java.lang.String passportNo, java.lang.String serviceID, java.lang.String alienID, java.lang.String taxID, java.util.Calendar dateOfBirth, java.lang.String postalBoxNo, java.lang.String postalTown, java.lang.String postalCountry, java.lang.String telephoneWork, java.lang.String telephoneHome, java.lang.String telephoneMobile, java.lang.String physicalAddress, java.lang.String physicalTown, java.lang.String physicalCountry, int reportSector, int reportReason) throws java.rmi.RemoteException{
    if (controllerKenya == null)
      _initControllerKenyaProxy();
    return controllerKenya.getProduct126(username, password, code, infinityCode, name1, name2, name3, name4, nationalID, passportNo, serviceID, alienID, taxID, dateOfBirth, postalBoxNo, postalTown, postalCountry, telephoneWork, telephoneHome, telephoneMobile, physicalAddress, physicalTown, physicalCountry, reportSector, reportReason);
  }
  
  public co.ke.transunion.crbws.ws.Product401 getProduct401(java.lang.String username, java.lang.String password, java.lang.String code, java.lang.String infinityCode, java.lang.String phoneNumber, int reportSector, int reportReason, java.lang.String message) throws java.rmi.RemoteException{
    if (controllerKenya == null)
      _initControllerKenyaProxy();
    return controllerKenya.getProduct401(username, password, code, infinityCode, phoneNumber, reportSector, reportReason, message);
  }
  
  public co.ke.transunion.crbws.ws.Product402 getProduct402(java.lang.String username, java.lang.String password, java.lang.String code, java.lang.String infinityCode, java.lang.String documentNumber, java.lang.String names, java.lang.String phoneNumber, int reportSector, int reportReason) throws java.rmi.RemoteException{
    if (controllerKenya == null)
      _initControllerKenyaProxy();
    return controllerKenya.getProduct402(username, password, code, infinityCode, documentNumber, names, phoneNumber, reportSector, reportReason);
  }
  
  public co.ke.transunion.crbws.ws.Product403 getProduct403(java.lang.String username, java.lang.String password, java.lang.String code, java.lang.String infinityCode, java.lang.String phoneNumber, int reportSector, int reportReason) throws java.rmi.RemoteException{
    if (controllerKenya == null)
      _initControllerKenyaProxy();
    return controllerKenya.getProduct403(username, password, code, infinityCode, phoneNumber, reportSector, reportReason);
  }
  
  public co.ke.transunion.crbws.ws.Product405 getProduct405(java.lang.String username, java.lang.String password, java.lang.String code, java.lang.String infinityCode, java.lang.String origin, java.lang.String dest, java.lang.String receivedTimeStamp, java.lang.String transactionDate, java.lang.String transactionTime, java.lang.String transactionCode, java.lang.String transactionMobileNo, java.lang.String transactionAccount, java.lang.String senderNames, java.lang.String transactionAmount) throws java.rmi.RemoteException{
    if (controllerKenya == null)
      _initControllerKenyaProxy();
    return controllerKenya.getProduct405(username, password, code, infinityCode, origin, dest, receivedTimeStamp, transactionDate, transactionTime, transactionCode, transactionMobileNo, transactionAccount, senderNames, transactionAmount);
  }
  
  public co.ke.transunion.crbws.ws.Product406 getProduct406(java.lang.String username, java.lang.String password, java.lang.String code, java.lang.String infinityCode, java.lang.String phoneNumber, java.lang.String emailAddress, int reportSector, int reportReason) throws java.rmi.RemoteException{
    if (controllerKenya == null)
      _initControllerKenyaProxy();
    return controllerKenya.getProduct406(username, password, code, infinityCode, phoneNumber, emailAddress, reportSector, reportReason);
  }
  
  public co.ke.transunion.crbws.ws.Product159 getProduct159(java.lang.String username, java.lang.String password, java.lang.String code, java.lang.String infinityCode, java.lang.String companyName, java.lang.String companyRegNo, java.lang.String taxID, java.lang.String vatID, java.util.Calendar companyRegDate, java.lang.String postalBoxNo, java.lang.String postalTown, java.lang.String postalCountry, java.lang.String telephoneNo, java.lang.String faxNo, java.lang.String websiteAddress, java.lang.String physicalAddress, java.lang.String physicalTown, java.lang.String physicalCountry, int reportSector, int reportReason) throws java.rmi.RemoteException{
    if (controllerKenya == null)
      _initControllerKenyaProxy();
    return controllerKenya.getProduct159(username, password, code, infinityCode, companyName, companyRegNo, taxID, vatID, companyRegDate, postalBoxNo, postalTown, postalCountry, telephoneNo, faxNo, websiteAddress, physicalAddress, physicalTown, physicalCountry, reportSector, reportReason);
  }
  
  public co.ke.transunion.crbws.ws.Product125 getProduct125(java.lang.String username, java.lang.String password, java.lang.String code, java.lang.String infinityCode, java.lang.String name1, java.lang.String name2, java.lang.String name3, java.lang.String name4, java.lang.String nationalID, java.lang.String passportNo, java.lang.String serviceID, java.lang.String alienID, java.lang.String taxID, java.util.Calendar dateOfBirth, java.lang.String postalBoxNo, java.lang.String postalTown, java.lang.String postalCountry, java.lang.String telephoneWork, java.lang.String telephoneHome, java.lang.String telephoneMobile, java.lang.String physicalAddress, java.lang.String physicalTown, java.lang.String physicalCountry, int reportSector, int reportReason) throws java.rmi.RemoteException{
    if (controllerKenya == null)
      _initControllerKenyaProxy();
    return controllerKenya.getProduct125(username, password, code, infinityCode, name1, name2, name3, name4, nationalID, passportNo, serviceID, alienID, taxID, dateOfBirth, postalBoxNo, postalTown, postalCountry, telephoneWork, telephoneHome, telephoneMobile, physicalAddress, physicalTown, physicalCountry, reportSector, reportReason);
  }
  
  public co.ke.transunion.crbws.ws.Product108 getProduct108(java.lang.String username, java.lang.String password, java.lang.String code, java.lang.String infinityCode, java.lang.String name1, java.lang.String name2, java.lang.String name3, java.lang.String name4, java.lang.String nationalID, java.lang.String passportNo, java.lang.String serviceID, java.lang.String alienID, java.lang.String taxID, java.util.Calendar dateOfBirth, java.lang.String postalBoxNo, java.lang.String postalTown, java.lang.String postalCountry, java.lang.String telephoneWork, java.lang.String telephoneHome, java.lang.String telephoneMobile, java.lang.String physicalAddress, java.lang.String physicalTown, java.lang.String physicalCountry, int reportSector, int reportReason) throws java.rmi.RemoteException{
    if (controllerKenya == null)
      _initControllerKenyaProxy();
    return controllerKenya.getProduct108(username, password, code, infinityCode, name1, name2, name3, name4, nationalID, passportNo, serviceID, alienID, taxID, dateOfBirth, postalBoxNo, postalTown, postalCountry, telephoneWork, telephoneHome, telephoneMobile, physicalAddress, physicalTown, physicalCountry, reportSector, reportReason);
  }
  
  public co.ke.transunion.crbws.ws.Product112 getProduct112(java.lang.String username, java.lang.String password, java.lang.String code, java.lang.String infinityCode, java.lang.String name1, java.lang.String name2, java.lang.String name3, java.lang.String name4, java.lang.String nationalID, java.lang.String passportNo, java.lang.String serviceID, java.lang.String alienID, java.lang.String taxID, java.util.Calendar dateOfBirth, java.lang.String postalBoxNo, java.lang.String postalTown, java.lang.String postalCountry, java.lang.String telephoneWork, java.lang.String telephoneHome, java.lang.String telephoneMobile, java.lang.String physicalAddress, java.lang.String physicalTown, java.lang.String physicalCountry, int reportSector, int reportReason) throws java.rmi.RemoteException{
    if (controllerKenya == null)
      _initControllerKenyaProxy();
    return controllerKenya.getProduct112(username, password, code, infinityCode, name1, name2, name3, name4, nationalID, passportNo, serviceID, alienID, taxID, dateOfBirth, postalBoxNo, postalTown, postalCountry, telephoneWork, telephoneHome, telephoneMobile, physicalAddress, physicalTown, physicalCountry, reportSector, reportReason);
  }
  
  public co.ke.transunion.crbws.ws.Product114 getProduct114(java.lang.String username, java.lang.String password, java.lang.String code, java.lang.String infinityCode, java.lang.String name1, java.lang.String name2, java.lang.String name3, java.lang.String name4, java.lang.String nationalID, java.lang.String passportNo, java.lang.String serviceID, java.lang.String alienID, java.lang.String taxID, java.util.Calendar dateOfBirth, java.lang.String postalBoxNo, java.lang.String postalTown, java.lang.String postalCountry, java.lang.String telephoneWork, java.lang.String telephoneHome, java.lang.String telephoneMobile, java.lang.String physicalAddress, java.lang.String physicalTown, java.lang.String physicalCountry, int reportSector, int reportReason) throws java.rmi.RemoteException{
    if (controllerKenya == null)
      _initControllerKenyaProxy();
    return controllerKenya.getProduct114(username, password, code, infinityCode, name1, name2, name3, name4, nationalID, passportNo, serviceID, alienID, taxID, dateOfBirth, postalBoxNo, postalTown, postalCountry, telephoneWork, telephoneHome, telephoneMobile, physicalAddress, physicalTown, physicalCountry, reportSector, reportReason);
  }
  
  public co.ke.transunion.crbws.ws.Product110 getProduct110(java.lang.String username, java.lang.String password, java.lang.String code, java.lang.String infinityCode, int crn, java.lang.String phoneNumber, int reportSector, int reportReason) throws java.rmi.RemoteException{
    if (controllerKenya == null)
      _initControllerKenyaProxy();
    return controllerKenya.getProduct110(username, password, code, infinityCode, crn, phoneNumber, reportSector, reportReason);
  }
  
  public co.ke.transunion.crbws.ws.Product121 getProduct121(java.lang.String username, java.lang.String password, java.lang.String code, java.lang.String infinityCode, java.lang.String name1, java.lang.String name2, java.lang.String name3, java.lang.String name4, java.lang.String nationalID, java.lang.String passportNo, java.lang.String serviceID, java.lang.String alienID, java.lang.String taxID, java.util.Calendar dateOfBirth, java.lang.String postalBoxNo, java.lang.String postalTown, java.lang.String postalCountry, java.lang.String telephoneWork, java.lang.String telephoneHome, java.lang.String telephoneMobile, java.lang.String physicalAddress, java.lang.String physicalTown, java.lang.String physicalCountry, int reportReason) throws java.rmi.RemoteException{
    if (controllerKenya == null)
      _initControllerKenyaProxy();
    return controllerKenya.getProduct121(username, password, code, infinityCode, name1, name2, name3, name4, nationalID, passportNo, serviceID, alienID, taxID, dateOfBirth, postalBoxNo, postalTown, postalCountry, telephoneWork, telephoneHome, telephoneMobile, physicalAddress, physicalTown, physicalCountry, reportReason);
  }
  
  public co.ke.transunion.crbws.ws.Product124 getProduct124(java.lang.String username, java.lang.String password, java.lang.String code, java.lang.String infinityCode, java.lang.String name1, java.lang.String name2, java.lang.String name3, java.lang.String name4, java.lang.String nationalID, java.lang.String passportNo, java.lang.String serviceID, java.lang.String alienID, java.lang.String taxID, java.util.Calendar dateOfBirth, java.lang.String postalBoxNo, java.lang.String postalTown, java.lang.String postalCountry, java.lang.String telephoneWork, java.lang.String telephoneHome, java.lang.String telephoneMobile, java.lang.String physicalAddress, java.lang.String physicalTown, java.lang.String physicalCountry, int reportSector, int reportReason) throws java.rmi.RemoteException{
    if (controllerKenya == null)
      _initControllerKenyaProxy();
    return controllerKenya.getProduct124(username, password, code, infinityCode, name1, name2, name3, name4, nationalID, passportNo, serviceID, alienID, taxID, dateOfBirth, postalBoxNo, postalTown, postalCountry, telephoneWork, telephoneHome, telephoneMobile, physicalAddress, physicalTown, physicalCountry, reportSector, reportReason);
  }
  
  public co.ke.transunion.crbws.ws.Product102 getProduct102(java.lang.String username, java.lang.String password, java.lang.String code, java.lang.String infinityCode, java.lang.String name1, java.lang.String name2, java.lang.String name3, java.lang.String name4, java.lang.String nationalID, java.lang.String passportNo, java.lang.String serviceID, java.lang.String alienID, java.lang.String taxID, java.util.Calendar dateOfBirth, java.lang.String postalBoxNo, java.lang.String postalTown, java.lang.String postalCountry, java.lang.String telephoneWork, java.lang.String telephoneHome, java.lang.String telephoneMobile, java.lang.String physicalAddress, java.lang.String physicalTown, java.lang.String physicalCountry, int reportReason) throws java.rmi.RemoteException{
    if (controllerKenya == null)
      _initControllerKenyaProxy();
    return controllerKenya.getProduct102(username, password, code, infinityCode, name1, name2, name3, name4, nationalID, passportNo, serviceID, alienID, taxID, dateOfBirth, postalBoxNo, postalTown, postalCountry, telephoneWork, telephoneHome, telephoneMobile, physicalAddress, physicalTown, physicalCountry, reportReason);
  }
  
  public co.ke.transunion.crbws.ws.Product101 getProduct101(java.lang.String username, java.lang.String password, java.lang.String code, java.lang.String infinityCode, java.lang.String name1, java.lang.String name2, java.lang.String name3, java.lang.String name4, java.lang.String nationalID, java.lang.String passportNo, java.lang.String serviceID, java.lang.String alienID, java.lang.String taxID, java.util.Calendar dateOfBirth, java.lang.String postalBoxNo, java.lang.String postalTown, java.lang.String postalCountry, java.lang.String telephoneWork, java.lang.String telephoneHome, java.lang.String telephoneMobile, java.lang.String physicalAddress, java.lang.String physicalTown, java.lang.String physicalCountry, int reportSector, int reportReason) throws java.rmi.RemoteException{
    if (controllerKenya == null)
      _initControllerKenyaProxy();
    return controllerKenya.getProduct101(username, password, code, infinityCode, name1, name2, name3, name4, nationalID, passportNo, serviceID, alienID, taxID, dateOfBirth, postalBoxNo, postalTown, postalCountry, telephoneWork, telephoneHome, telephoneMobile, physicalAddress, physicalTown, physicalCountry, reportSector, reportReason);
  }
  
  public co.ke.transunion.crbws.ws.Product104 getProduct104(java.lang.String username, java.lang.String password, java.lang.String code, java.lang.String infinityCode, java.lang.String name1, java.lang.String name2, java.lang.String name3, java.lang.String name4, java.lang.String nationalID, java.lang.String passportNo, java.lang.String serviceID, java.lang.String alienID, java.lang.String taxID, java.util.Calendar dateOfBirth, java.lang.String postalBoxNo, java.lang.String postalTown, java.lang.String postalCountry, java.lang.String telephoneWork, java.lang.String telephoneHome, java.lang.String telephoneMobile, java.lang.String physicalAddress, java.lang.String physicalTown, java.lang.String physicalCountry, int reportSector, int reportReason) throws java.rmi.RemoteException{
    if (controllerKenya == null)
      _initControllerKenyaProxy();
    return controllerKenya.getProduct104(username, password, code, infinityCode, name1, name2, name3, name4, nationalID, passportNo, serviceID, alienID, taxID, dateOfBirth, postalBoxNo, postalTown, postalCountry, telephoneWork, telephoneHome, telephoneMobile, physicalAddress, physicalTown, physicalCountry, reportSector, reportReason);
  }
  
  public co.ke.transunion.crbws.ws.Product116 getProduct116(java.lang.String username, java.lang.String password, java.lang.String code, java.lang.String infinityCode, java.lang.String name1, java.lang.String name2, java.lang.String name3, java.lang.String name4, java.lang.String nationalID, java.lang.String passportNo, java.lang.String serviceID, java.lang.String alienID, java.lang.String taxID, java.util.Calendar dateOfBirth, java.lang.String postalBoxNo, java.lang.String postalTown, java.lang.String postalCountry, java.lang.String telephoneWork, java.lang.String telephoneHome, java.lang.String telephoneMobile, java.lang.String physicalAddress, java.lang.String physicalTown, java.lang.String physicalCountry, int reportSector, int reportReason) throws java.rmi.RemoteException{
    if (controllerKenya == null)
      _initControllerKenyaProxy();
    return controllerKenya.getProduct116(username, password, code, infinityCode, name1, name2, name3, name4, nationalID, passportNo, serviceID, alienID, taxID, dateOfBirth, postalBoxNo, postalTown, postalCountry, telephoneWork, telephoneHome, telephoneMobile, physicalAddress, physicalTown, physicalCountry, reportSector, reportReason);
  }
  
  public co.ke.transunion.crbws.ws.Product118 getProduct118(java.lang.String username, java.lang.String password, java.lang.String code, java.lang.String infinityCode, java.lang.String name1, java.lang.String name2, java.lang.String name3, java.lang.String name4, java.lang.String nationalID, java.lang.String passportNo, java.lang.String serviceID, java.lang.String alienID, java.lang.String taxID, java.util.Calendar dateOfBirth, java.lang.String postalBoxNo, java.lang.String postalTown, java.lang.String postalCountry, java.lang.String telephoneWork, java.lang.String telephoneHome, java.lang.String telephoneMobile, java.lang.String physicalAddress, java.lang.String physicalTown, java.lang.String physicalCountry, int reportSector, int reportReason) throws java.rmi.RemoteException{
    if (controllerKenya == null)
      _initControllerKenyaProxy();
    return controllerKenya.getProduct118(username, password, code, infinityCode, name1, name2, name3, name4, nationalID, passportNo, serviceID, alienID, taxID, dateOfBirth, postalBoxNo, postalTown, postalCountry, telephoneWork, telephoneHome, telephoneMobile, physicalAddress, physicalTown, physicalCountry, reportSector, reportReason);
  }
  
  public co.ke.transunion.crbws.ws.Product105 getProduct105(java.lang.String username, java.lang.String password, java.lang.String code, java.lang.String infinityCode, java.lang.String name1, java.lang.String name2, java.lang.String name3, java.lang.String name4, java.lang.String nationalID, java.lang.String passportNo, java.lang.String serviceID, java.lang.String alienID, java.lang.String taxID, java.util.Calendar dateOfBirth, java.lang.String postalBoxNo, java.lang.String postalTown, java.lang.String postalCountry, java.lang.String telephoneWork, java.lang.String telephoneHome, java.lang.String telephoneMobile, java.lang.String physicalAddress, java.lang.String physicalTown, java.lang.String physicalCountry, int reportSector, int reportReason) throws java.rmi.RemoteException{
    if (controllerKenya == null)
      _initControllerKenyaProxy();
    return controllerKenya.getProduct105(username, password, code, infinityCode, name1, name2, name3, name4, nationalID, passportNo, serviceID, alienID, taxID, dateOfBirth, postalBoxNo, postalTown, postalCountry, telephoneWork, telephoneHome, telephoneMobile, physicalAddress, physicalTown, physicalCountry, reportSector, reportReason);
  }
  
  public co.ke.transunion.crbws.ws.Product109 getProduct109(java.lang.String username, java.lang.String password, java.lang.String code, java.lang.String infinityCode, java.lang.String name1, java.lang.String name2, java.lang.String name3, java.lang.String name4, java.lang.String nationalID, java.lang.String passportNo, java.lang.String serviceID, java.lang.String alienID, java.lang.String taxID, java.util.Calendar dateOfBirth, java.lang.String postalBoxNo, java.lang.String postalTown, java.lang.String postalCountry, java.lang.String telephoneWork, java.lang.String telephoneHome, java.lang.String telephoneMobile, java.lang.String physicalAddress, java.lang.String physicalTown, java.lang.String physicalCountry, int reportSector, int reportReason) throws java.rmi.RemoteException{
    if (controllerKenya == null)
      _initControllerKenyaProxy();
    return controllerKenya.getProduct109(username, password, code, infinityCode, name1, name2, name3, name4, nationalID, passportNo, serviceID, alienID, taxID, dateOfBirth, postalBoxNo, postalTown, postalCountry, telephoneWork, telephoneHome, telephoneMobile, physicalAddress, physicalTown, physicalCountry, reportSector, reportReason);
  }
  
  public co.ke.transunion.crbws.ws.Product103 getProduct103(java.lang.String username, java.lang.String password, java.lang.String code, java.lang.String infinityCode, java.lang.String name1, java.lang.String name2, java.lang.String name3, java.lang.String name4, java.lang.String nationalID, java.lang.String passportNo, java.lang.String serviceID, java.lang.String alienID, java.lang.String taxID, java.util.Calendar dateOfBirth, java.lang.String postalBoxNo, java.lang.String postalTown, java.lang.String postalCountry, java.lang.String telephoneWork, java.lang.String telephoneHome, java.lang.String telephoneMobile, java.lang.String physicalAddress, java.lang.String physicalTown, java.lang.String physicalCountry, int reportReason) throws java.rmi.RemoteException{
    if (controllerKenya == null)
      _initControllerKenyaProxy();
    return controllerKenya.getProduct103(username, password, code, infinityCode, name1, name2, name3, name4, nationalID, passportNo, serviceID, alienID, taxID, dateOfBirth, postalBoxNo, postalTown, postalCountry, telephoneWork, telephoneHome, telephoneMobile, physicalAddress, physicalTown, physicalCountry, reportReason);
  }
  
  public co.ke.transunion.crbws.ws.Product107 getProduct107(java.lang.String username, java.lang.String password, java.lang.String code, java.lang.String infinityCode, java.lang.String name1, java.lang.String name2, java.lang.String name3, java.lang.String name4, java.lang.String nationalID, java.lang.String passportNo, java.lang.String serviceID, java.lang.String alienID, java.lang.String taxID, java.util.Calendar dateOfBirth, java.lang.String postalBoxNo, java.lang.String postalTown, java.lang.String postalCountry, java.lang.String telephoneWork, java.lang.String telephoneHome, java.lang.String telephoneMobile, java.lang.String physicalAddress, java.lang.String physicalTown, java.lang.String physicalCountry, int reportSector, int reportReason) throws java.rmi.RemoteException{
    if (controllerKenya == null)
      _initControllerKenyaProxy();
    return controllerKenya.getProduct107(username, password, code, infinityCode, name1, name2, name3, name4, nationalID, passportNo, serviceID, alienID, taxID, dateOfBirth, postalBoxNo, postalTown, postalCountry, telephoneWork, telephoneHome, telephoneMobile, physicalAddress, physicalTown, physicalCountry, reportSector, reportReason);
  }
  
  public co.ke.transunion.crbws.ws.Product115 getProduct115(java.lang.String username, java.lang.String password, java.lang.String code, java.lang.String infinityCode, java.lang.String name1, java.lang.String name2, java.lang.String name3, java.lang.String name4, java.lang.String nationalID, java.lang.String passportNo, java.lang.String serviceID, java.lang.String alienID, java.lang.String taxID, java.util.Calendar dateOfBirth, java.lang.String postalBoxNo, java.lang.String postalTown, java.lang.String postalCountry, java.lang.String telephoneWork, java.lang.String telephoneHome, java.lang.String telephoneMobile, java.lang.String physicalAddress, java.lang.String physicalTown, java.lang.String physicalCountry, int reportSector, int reportReason) throws java.rmi.RemoteException{
    if (controllerKenya == null)
      _initControllerKenyaProxy();
    return controllerKenya.getProduct115(username, password, code, infinityCode, name1, name2, name3, name4, nationalID, passportNo, serviceID, alienID, taxID, dateOfBirth, postalBoxNo, postalTown, postalCountry, telephoneWork, telephoneHome, telephoneMobile, physicalAddress, physicalTown, physicalCountry, reportSector, reportReason);
  }
  
  public co.ke.transunion.crbws.ws.Product122 getProduct122(java.lang.String username, java.lang.String password, java.lang.String code, java.lang.String infinityCode, java.lang.String name1, java.lang.String name2, java.lang.String name3, java.lang.String name4, java.lang.String nationalID, java.lang.String passportNo, java.lang.String serviceID, java.lang.String alienID, java.lang.String taxID, java.util.Calendar dateOfBirth, java.lang.String postalBoxNo, java.lang.String postalTown, java.lang.String postalCountry, java.lang.String telephoneWork, java.lang.String telephoneHome, java.lang.String telephoneMobile, java.lang.String physicalAddress, java.lang.String physicalTown, java.lang.String physicalCountry, int reportSector, int reportReason) throws java.rmi.RemoteException{
    if (controllerKenya == null)
      _initControllerKenyaProxy();
    return controllerKenya.getProduct122(username, password, code, infinityCode, name1, name2, name3, name4, nationalID, passportNo, serviceID, alienID, taxID, dateOfBirth, postalBoxNo, postalTown, postalCountry, telephoneWork, telephoneHome, telephoneMobile, physicalAddress, physicalTown, physicalCountry, reportSector, reportReason);
  }
  
  public co.ke.transunion.crbws.ws.ServerInfo getServerInfo(java.lang.String username, java.lang.String password, java.lang.String code, java.lang.String infinityCode) throws java.rmi.RemoteException{
    if (controllerKenya == null)
      _initControllerKenyaProxy();
    return controllerKenya.getServerInfo(username, password, code, infinityCode);
  }
  
  
}