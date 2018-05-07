package com.ifarm.console.mapper;

import com.ifarm.console.shared.domain.po.PermissionPO;
import com.ifarm.console.shared.domain.po.ResourcePO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 *
 **/
@Repository
public interface ResourceMapper {

    List<Map<String, String>> findMenuSelectStore();

    List<ResourcePO> findByParentCode(@Param("parentCode") String parentCode);

    List<ResourcePO> findMenuByUserAndParent(@Param("userName") String userName, @Param("parentCode") String parentCode);

    List<ResourcePO> findMenuResources(String userName);

    List<ResourcePO> findByParam(ResourcePO resourcePO);

    long totalCount(ResourcePO resourcePO);

    ResourcePO findByCode(@Param("resourceCode") String resourceCode);

    ResourcePO findByById(Integer id);

    int updateActiveByIds(@Param("ids") List<Integer> ids, @Param("active") String active);

    int update(ResourcePO resourcePO);

    int insert(ResourcePO resourcePO);

    int insertPermission(PermissionPO permissionPO);

    int updatePermission(PermissionPO permissionPO);

    int deletePermission(List<Integer> tid);

}
