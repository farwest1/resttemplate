package com.moeller.business.dao;

import com.moeller.business.domain.Permission;
import com.moeller.rest.dto.PermissionDto;

import javax.enterprise.context.ApplicationScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Bernd on 27.08.2016.
 */
@ApplicationScoped
public class PermissionRepository {

    @PersistenceContext(unitName = "primary")
    EntityManager entityManager;

    public PermissionDto findPermissionById(long id){
        PermissionDto permissionDto = new PermissionDto();
        permissionDto.setPermissionId(id);
        permissionDto.setPermissionName("open shift");
        TypedQuery<Permission> query =
                    entityManager.createQuery("select p from Permission  p where p.id = :id", Permission.class);
        query.setParameter("id", id);
        query.getSingleResult();
        return permissionDto;
    }

    public List<PermissionDto> findPermissions(){
        List<PermissionDto> permissionDtoList = new ArrayList<PermissionDto>();
        permissionDtoList.add(new PermissionDto(1,"Perm1"));
        permissionDtoList.add(new PermissionDto(2,"Perm2"));

        return permissionDtoList;
    }
}
