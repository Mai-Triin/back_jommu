package ee.valiit.back_jommu.business.role;

import ee.valiit.back_jommu.domain.userrole.role.Role;
import ee.valiit.back_jommu.domain.userrole.role.RoleDto;
import ee.valiit.back_jommu.domain.userrole.role.RoleMapper;
import ee.valiit.back_jommu.domain.userrole.role.RoleRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class RoleService {

    @Resource
    private RoleMapper roleMapper;

    @Resource
    private RoleRepository roleRepository;

    public List<RoleDto> getAllRoles() {
        List<Role> roles = roleRepository.findAll();
        List<RoleDto> roleDtos = roleMapper.rolesToRoleDtos(roles);
        return roleDtos;
    }
}
