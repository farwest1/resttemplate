package com.moeller.rest.api;

import com.moeller.rest.dto.Permission;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * Created by Bernd on 25.08.2016.
 *
 * The Controller for the Permission Ressource
 */
@Path(value = "permission")
public class PermissionController {
    private static final Logger LOGGER = LoggerFactory.getLogger(PermissionController.class);

    @GET
    @Produces("application/json")
    public Permission getPerm(){
        LOGGER.debug("provide Permission");
        Permission permission = new Permission();
        permission.setPermissionId(1);
        permission.setPermissionName("Open Shift");

        return permission;
    }
}
