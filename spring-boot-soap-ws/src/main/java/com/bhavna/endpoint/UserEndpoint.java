package com.bhavna.endpoint;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.bhavna.service.UserService;
import com.bhavna.springbootsoap.GetUserRequest;
import com.bhavna.springbootsoap.GetUserResponse;

@Endpoint
public class UserEndpoint {

    @Autowired
    private UserService userService;


    @PayloadRoot(namespace = "http://bhavna.com/springbootsoap",
            localPart = "getUserRequest")
    @ResponsePayload
    public GetUserResponse getUserRequest(@RequestPayload GetUserRequest request) {
        GetUserResponse response = new GetUserResponse();
        response.setUser(userService.getUsers(request.getName()));
        return response;
    }
}