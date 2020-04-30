package com.test.rest; // Note your package will be {{ groupId }}.rest

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/")
public class MoodService {
    String Moods[] = {"DEAD","SAD","NEUTRAL","HAPPY"};
    @GET // This annotation indicates GET request

    @Path("/Mood")
    public Response Mood() {
        return Response.status(200).entity("Need to Specify Which Mood").build();
    }
    @GET // This annotation indicates GET request
    @Path("/Mood/0")
    public Response Mood0() {
        return Response.status(200).entity("DEAD").build();
    }
    @GET // This annotation indicates GET request
    @Path("/Mood/1")
    public Response Mood1() {
        return Response.status(200).entity("SAD").build();
    }
    @GET // This annotation indicates GET request
    @Path("/Mood/2")
    public Response Mood2() {
        return Response.status(200).entity("NEUTRAL").build();
    }
    @GET // This annotation indicates GET request
    @Path("/Mood/3")
    public Response Mood3() {
        return Response.status(200).entity("HAPPY").build();
    }

}