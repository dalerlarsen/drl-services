package drl.auth.service;

/**
 * Created with IntelliJ IDEA.
 * User: Dale
 * Date: 3/4/14
 * Time: 12:10 PM
 * To change this template use File | Settings | File Templates.
 */

import drl.auth.beans.UserDto;
import org.springframework.stereotype.Service;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import javax.jws.HandlerChain;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.BindingType;

/**
 * Implementation class for location management
 */
//@WebService(serviceName = "AuthenticationInquiryService",targetNamespace = "http://authenticationinquiry.service.auth.drl/")
//@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.WRAPPED, style = SOAPBinding.Style.RPC, use = SOAPBinding.Use.LITERAL)
//@BindingType(javax.xml.ws.soap.SOAPBinding.SOAP12HTTP_BINDING)
@Service ("authenticationService")
public class AuthenticationService {

//    @WebMethod(operationName = "authenticateUser", action = "urn:authenticateUser")
    public UserDto authenticateUser() {
        UserDto userDto = new UserDto();
        userDto.setUserFirstName("Dale");
        userDto.setUserLastName("Larsen");
        return userDto;
    }
}
