package client;

public class CardValidatorProxy implements client.CardValidator {
  private String _endpoint = null;
  private client.CardValidator cardValidator = null;
  
  public CardValidatorProxy() {
    _initCardValidatorProxy();
  }
  
  public CardValidatorProxy(String endpoint) {
    _endpoint = endpoint;
    _initCardValidatorProxy();
  }
  
  private void _initCardValidatorProxy() {
    try {
      cardValidator = (new client.CardValidatorServiceLocator()).getCardValidatorPort();
      if (cardValidator != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)cardValidator)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)cardValidator)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (cardValidator != null)
      ((javax.xml.rpc.Stub)cardValidator)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public client.CardValidator getCardValidator() {
    if (cardValidator == null)
      _initCardValidatorProxy();
    return cardValidator;
  }
  
  public boolean validate(client.CreditCard arg0) throws java.rmi.RemoteException{
    if (cardValidator == null)
      _initCardValidatorProxy();
    return cardValidator.validate(arg0);
  }
  
  
}