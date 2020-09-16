package com.sbm.approved.employer.approvedemployer.controller;

import org.springframework.stereotype.Service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Service
@Path("/approvedemployer")
public class ApprovedEmployerController {

    @GET
    @Path("/emp")
    @Produces(MediaType.TEXT_PLAIN)
    public String getApprovedEmployer() {
        return "approved employer";
    }
}
