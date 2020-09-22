package com.sbm.approved.employer.approvedemployer.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Service
@Path("/approvedemployer")
public class ApprovedEmployerController {


    @Value("${welcome:default}")
    private String welcome;

    @Value("${message:default}")
    private String message;

    @GET
    @Path("/message")
    @Produces(MediaType.TEXT_PLAIN)
    public String getApprovedEmployer() {
        return "welcome: " + welcome + "\nmessage: "+ message;
    }
}
