package ee.valiit.back_jommu.domain.userrole.role;

import org.mapstruct.*;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface RoleMapper {

    @Mapping(source = "id", target = "roleId")
    @Mapping(source = "type", target = "roleType")
    RoleDto roleToRoleDto(Role role);

    List<RoleDto> rolesToRoleDtos(List<Role> roles);

}
