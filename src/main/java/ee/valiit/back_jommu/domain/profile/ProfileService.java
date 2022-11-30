package ee.valiit.back_jommu.domain.profile;


import ee.valiit.back_jommu.domain.userrole.role.Role;
import ee.valiit.back_jommu.domain.userrole.role.RoleMapper;
import ee.valiit.back_jommu.domain.userrole.role.RoleRepository;
import ee.valiit.back_jommu.domain.userrole.user.User;
import ee.valiit.back_jommu.domain.userrole.user.UserMapper;
import ee.valiit.back_jommu.domain.userrole.user.UserRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ProfileService {

    @Resource
    private ProfileMapper profileMapper;

    @Resource
    private ProfileRepository profileRepository;

    @Resource
    private RoleRepository roleRepository;

    @Resource
    private RoleMapper roleMapper;

    @Resource
    private UserMapper userMapper;

    @Resource
    private UserRepository userRepository;

    public void registerUser(ProfileRequest request) {
        Profile profile = profileMapper.toProfile(request);
        profileRepository.save(profile);

        User user = userMapper.toUser(request);
        Role role = roleRepository.findById(request.getRoleId()).get();
        user.setRole(role);
        user.setProfile(profile);
        userRepository.save(user);

    }
}
