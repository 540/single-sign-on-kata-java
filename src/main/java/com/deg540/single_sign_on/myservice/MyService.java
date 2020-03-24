package com.deg540.single_sign_on.myservice;

import com.deg540.single_sign_on.sso.Request;
import com.deg540.single_sign_on.sso.Response;
import com.deg540.single_sign_on.sso.SSOToken;
import com.deg540.single_sign_on.sso.SingleSignOnRegistry;

public class MyService {

    private SingleSignOnRegistry registry;

    public MyService(SingleSignOnRegistry registry) {
        this.registry = registry;
    }

    public Response handleRequest(Request request) {
        // TODO: check request has a valid SSOToken
        return new Response("hello " + request.getName() + "!");
    }

    public SSOToken handleRegister(String username, String password) {
        // TODO: register and return token
        return new SSOToken();
    }

    public void handleUnRegister(SSOToken token) {
        // TODO: unregister token
    }
}
