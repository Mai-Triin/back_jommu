package ee.valiit.back_jommu.domain.userrole.user;

import ee.valiit.back_jommu.business.login.UserDto;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface UserMapper {

    @Mapping( source = "id", target  = "userId")
    @Mapping( source = "role.id", target  = "roleId")
    @Mapping( source = "role.type", target  = "roleType")
    UserDto userToUserDto(User user);

}
