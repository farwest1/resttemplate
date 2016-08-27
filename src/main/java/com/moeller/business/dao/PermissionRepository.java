package com.moeller.business.dao;

import com.moeller.rest.dto.Permission;

import javax.enterprise.context.ApplicationScoped;
import java.util.ArrayList;
import java.util.List;

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

    public List<Permission> findPermissions(){
        List<Permission> permissionList = new ArrayList<Permission>();
        permissionList.add(new Permission(1,"Perm1"));
        permissionList.add(new Permission(2,"Perm2"));

        return permissionList;
    }
}
