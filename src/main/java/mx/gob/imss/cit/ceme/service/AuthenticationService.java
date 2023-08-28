package mx.gob.imss.cit.ceme.service;

import mx.gob.imss.cit.ceme.dao.request.SignUpRequest;
import mx.gob.imss.cit.ceme.dao.request.LoginRequest;
import mx.gob.imss.cit.ceme.dao.response.JwtAuthenticationResponse;

public interface AuthenticationService {
	
    JwtAuthenticationResponse signup(SignUpRequest request);

    JwtAuthenticationResponse signin(LoginRequest request);
}
