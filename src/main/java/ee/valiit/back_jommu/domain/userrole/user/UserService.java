package ee.valiit.back_jommu.domain.userrole.user;

import ee.valiit.back_jommu.validation.Validation;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Optional;

@Service
public class UserService {

    @Resource
    private UserRepository userRepository;

    public User getValidUser(String username, String password, String roleType) {
        Optional<User> userOptional = userRepository.findUserByRole(username, password, roleType);
        Validation.validateUserCredentials(userOptional);
        User user = userOptional.get();
        return user;
    }
}
