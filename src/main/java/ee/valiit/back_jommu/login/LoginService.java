package ee.valiit.back_jommu.login;

import ee.valiit.back_jommu.domain.userrole.user.User;
import ee.valiit.back_jommu.domain.userrole.user.UserMapper;
import ee.valiit.back_jommu.domain.userrole.user.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class LoginService {

    @Resource
    private UserService userService;

    @Resource
    private UserMapper userMapper;

    public UserDto loginUser(String username, String password, String roleType) {
        User user = userService.getValidUser(username, password, roleType);
        UserDto userDto = userMapper.userToUserDto(user);
        return userDto;
    }
}
