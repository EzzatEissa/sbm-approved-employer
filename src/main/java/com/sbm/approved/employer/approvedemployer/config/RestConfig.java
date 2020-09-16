package com.sbm.approved.employer.approvedemployer.config;

import com.sbm.approved.employer.approvedemployer.controller.ApprovedEmployerController;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import javax.ws.rs.ApplicationPath;

@Component
@ApplicationPath("/api")
public class RestConfig extends ResourceConfig {

	public RestConfig() {
		register(ApprovedEmployerController.class);
	}
}