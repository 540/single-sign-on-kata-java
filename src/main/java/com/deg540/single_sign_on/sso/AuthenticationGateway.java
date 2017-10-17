package com.deg540.single_sign_on.sso;
/**
 * Uses something like LDAP to determine if the given credentials are valid
 */
public interface AuthenticationGateway {
    boolean credentialsAreValid(String username, String password);
}