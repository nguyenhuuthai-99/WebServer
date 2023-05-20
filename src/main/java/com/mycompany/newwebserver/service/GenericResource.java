/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/GenericResource.java to edit this template
 */
package com.mycompany.newwebserver.service;

import com.mycompany.newwebserver.Drone;
import com.mycompany.newwebserver.Fire;
import com.mycompany.newwebserver.Firetrucks;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author thainguyen
 */
@Path("generic")
public class GenericResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of GenericResource
     */
    public GenericResource() {
    }

    /**
     * Retrieves representation of an instance of com.mycompany.newwebserver.GenericResource
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getJson() {
        //TODO return proper representation object
        throw new UnsupportedOperationException();
    }

    /**
     * PUT method for updating or creating an instance of GenericResource
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
    }

    @GET
    @Path("/get-report")
    @Produces(MediaType.APPLICATION_JSON)
    public List getReport(){

//        List<Drone> drones = new DroneFacadeREST().findAll();
        List<Fire> fires = new FireFacadeREST().findAll();
//        List<Firetrucks> trucks = new FiretrucksFacadeREST().findAll();
//
//        ArrayList report = new ArrayList();
//        report.add(drones);
//        report.add(fires);
//        report.add(trucks);
        return fires;
    }
}
