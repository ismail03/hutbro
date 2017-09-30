package com.ismail.hutbro.controller;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.stereotype.Component;
@Component
@Path("/info")
public class Index {
	 @GET
		@Produces(MediaType.TEXT_PLAIN)
		public String getWelcomemessage()
		{
			
			return "service is up and running";
		}
}
