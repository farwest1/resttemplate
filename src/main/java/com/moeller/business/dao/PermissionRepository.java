package com.moeller.business.dao;

import com.moeller.rest.dto.Permission;

import javax.enterprise.context.ApplicationScoped;

/**
 * Created by Bernd on 27.08.2016.
 */
@ApplicationScoped
public class PermissionRepository {
    public Permission findPermissionById(long id){
        Permission permission = new Permission();
        permission.setPermissionId(id);
        permission.setPermissionName("open shift");
        return permission;
    }
}
