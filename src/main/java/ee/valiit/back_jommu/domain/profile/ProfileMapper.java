package ee.valiit.back_jommu.domain.profile;

import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface ProfileMapper {


    @Mapping(source = "profileId", target = "id")
    @Mapping(source = "firstName", target = "firstName")
    @Mapping(source = "lastName", target = "lastName")
    @Mapping(source = "dateOfBirth", target = "dateOfBirth")
    Profile toProfile(ProfileRequest profileRequest);



}
