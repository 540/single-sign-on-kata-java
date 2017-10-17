package com.deg540.single_sign_on;

import com.deg540.single_sign_on.myservice.MyService;
import com.deg540.single_sign_on.sso.Request;
import com.deg540.single_sign_on.sso.Response;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertThat;

public class MyServiceTest {

    @Test
    public void invalidSSOTokenIsRejected() {
        MyService service = new MyService(null);

        Response response = service.handleRequest(new Request("Foo", null));

        assertThat("hello Foo!", is(not(response.getText())));
    }
}
