package ee.valiit.back_jommu.business.role;

import ee.valiit.back_jommu.domain.userrole.role.RoleDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class RoleController {

    @Resource
    private RoleService roleService;

    @GetMapping("/role")
    public List<RoleDto> getRoles() {
        List<RoleDto> allRoles = roleService.getAllRoles();
        return allRoles;
    }
}
