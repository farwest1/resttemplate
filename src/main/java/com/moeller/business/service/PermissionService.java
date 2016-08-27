package com.moeller.business.service;

import com.moeller.business.dao.PermissionRepository;
import com.moeller.rest.dto.Permission;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

/**
 * Created by Bernd on 27.08.2016.
 */
@ApplicationScoped
public class PermissionService {

    @Inject
    PermissionRepository permissionRepository;

    public Permission getPermission(long id){
        return permissionRepository.findPermissionById(id);
    }
}
