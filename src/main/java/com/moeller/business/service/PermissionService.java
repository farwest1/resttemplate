package com.moeller.business.service;

import com.moeller.business.dao.PermissionRepository;
import com.moeller.common.Service;
import com.moeller.rest.dto.Permission;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.List;

/**
 * Created by Bernd on 27.08.2016.
 */
@Service
public class PermissionService {

    private static final Logger LOGGER = LoggerFactory.getLogger(PermissionService.class);
    @Inject
    PermissionRepository permissionRepository;

    public Permission getPermission(long id){
        LOGGER.info("get Permission by Id");
        return permissionRepository.findPermissionById(id);
    }

    public List<Permission> getAllPermissions(){
        return permissionRepository.findPermissions();
    }
}
