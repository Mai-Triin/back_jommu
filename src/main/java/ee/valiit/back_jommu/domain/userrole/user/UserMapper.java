package ee.valiit.back_jommu.domain.userrole.user;

import ee.valiit.back_jommu.business.login.UserDto;
import ee.valiit.back_jommu.business.register.RegisterResponse;
import ee.valiit.back_jommu.domain.profile.ProfileRequest;
import ee.valiit.back_jommu.domain.workoutplan.WorkoutPlanRequest;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface UserMapper {

    @Mapping( source = "id", target  = "userId")
    @Mapping( source = "role.id", target  = "roleId")
    @Mapping( source = "role.type", target  = "roleType")
    UserDto userToUserDto(User user);

    @Mapping(source = "username", target = "username")
    @Mapping(source = "password", target = "password")
    User toUser(ProfileRequest request);


    @Mapping(source = "id", target = "userId")
    RegisterResponse responseToDto(User user);

//    @Mapping(source = "workoutPlanId", target = "id")
//    User toUserId(WorkoutPlanRequest workoutPlanRequest);

}
