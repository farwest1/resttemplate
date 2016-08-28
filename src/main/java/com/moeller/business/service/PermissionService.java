package com.moeller.business.service;

import com.moeller.business.dao.PermissionRepository;
import com.moeller.common.Service;
import com.moeller.rest.dto.PermissionDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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

    public PermissionDto getPermission(long id){
        LOGGER.info("get PermissionDto by Id");
        return permissionRepository.findPermissionById(id);
    }

    public List<PermissionDto> getAllPermissions(){
        return permissionRepository.findPermissions();
    }
}
