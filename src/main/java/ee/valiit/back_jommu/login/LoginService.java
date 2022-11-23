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

    public UserDto loginAthlete(String username, String password) {
        User user = userService.getValidAthlete(username, password);
        UserDto userDto = userMapper.userToUserDto(user);
        return userDto;
    }
    public UserDto loginTrainer(String username, String password) {
        User user = userService.getValidTrainer(username, password);
        UserDto userDto = userMapper.userToUserDto(user);
        return userDto;
    }


}
