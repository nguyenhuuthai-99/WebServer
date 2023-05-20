/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.newwebserver.service;

import java.util.Set;
import javax.ws.rs.core.Application;

/**
 *
 * @author thainguyen
 */
@javax.ws.rs.ApplicationPath("webresources")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }

    /**
     * Do not modify addRestResourceClasses() method.
     * It is automatically populated with
     * all resources defined in the project.
     * If required, comment out calling this method in getClasses().
     */
    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(com.mycompany.newwebserver.service.DroneFacadeREST.class);
        resources.add(com.mycompany.newwebserver.service.FireFacadeREST.class);
        resources.add(com.mycompany.newwebserver.service.FiretrucksFacadeREST.class);
        resources.add(com.mycompany.newwebserver.service.GenericResource.class);
    }
    
}
