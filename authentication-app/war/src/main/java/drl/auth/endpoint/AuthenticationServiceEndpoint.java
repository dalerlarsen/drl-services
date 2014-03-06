package drl.auth.endpoint;

import drl.auth.beans.UserDto;
import drl.auth.service.AuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * Created with IntelliJ IDEA.
 * User: Dale
 * Date: 3/6/14
 * Time: 9:17 AM
 * To change this template use File | Settings | File Templates.
 */

@WebService(serviceName = "AuthenticationService")
public class AuthenticationServiceEndpoint extends SpringBeanAutowiringSupport {

    @Autowired
    AuthenticationService authenticationService;

    @WebMethod
    public UserDto authenticateUser() {
        return authenticationService.authenticateUser();
    }
}
