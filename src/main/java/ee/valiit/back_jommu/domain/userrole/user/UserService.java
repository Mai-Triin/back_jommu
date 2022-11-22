package ee.valiit.back_jommu.domain.userrole.user;

import ee.valiit.back_jommu.validation.Validation;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Optional;

@Service
public class UserService {

    @Resource
    private UserRepository userRepository;

    public User getValidUser(String username, String password) {
        Optional<User> userOptional = userRepository.findUserBy(username, password);
        Validation.validateUserCredentials(userOptional);
        User user = userOptional.get();

        return user;
    }



}
