package com.test.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/")
public class PersonalityService {
    @GET // This annotation indicates GET request
    @Path("/Personality")
    public Response Personality() {
        long rand = Math.round(Math.random());
        return Response
                .status(Response.Status.OK)
                .entity(rand)
                .build();
    }
}