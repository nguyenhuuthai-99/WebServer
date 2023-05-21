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
import javax.ejb.Stateless;
import javax.persistence.*;
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
@Stateless
@Path("generic")
public class GenericResource {

    @Context
    private UriInfo context;

    @PersistenceContext(unitName = "com.mycompany_newWebServer_war_1.0PU")
    private EntityManager em;

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
    public List<Object> getReport(){
        List<Fire> fires = em.createNamedQuery("Fire.findAll", Fire.class).getResultList() ;
        List<Drone> drones = em.createNamedQuery("Drone.findAll", Drone.class).getResultList() ;
        List<Firetrucks> firetrucks = em.createNamedQuery("Firetrucks.findAll", Firetrucks.class).getResultList() ;

        List<Object> report = new ArrayList();
        report.add(fires);
        report.add(drones);
        report.add(firetrucks);

        return report;
    }
}
