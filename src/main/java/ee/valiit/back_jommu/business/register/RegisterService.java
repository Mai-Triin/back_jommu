package ee.valiit.back_jommu.business.register;

import ee.valiit.back_jommu.domain.profile.ProfileRequest;
import ee.valiit.back_jommu.domain.profile.ProfileService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class RegisterService {

    @Resource
    private ProfileService profileService;

    // täpsusta üle kas siin peaks toimuma mappimine ja entity-d saadetakse domeeni kihti,
    public RegisterResponse registerUser(ProfileRequest request) {
        return profileService.registerUser(request);
    }
}
