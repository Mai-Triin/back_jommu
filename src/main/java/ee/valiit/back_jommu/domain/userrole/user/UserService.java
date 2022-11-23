package ee.valiit.back_jommu.domain.userrole.user;

import ee.valiit.back_jommu.validation.Validation;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Optional;

@Service
public class UserService {

    private static final String ATHLETE = "Treenitav";
    private static final String TRAINER = "Treener";

    @Resource
    private UserRepository userRepository;

    public User getValidAthlete(String username, String password) {
        Optional<User> userOptional = userRepository.findUserByRole(username, password, ATHLETE);
        Validation.validateUserCredentials(userOptional);
        User user = userOptional.get();
        return user;
    }
    public User getValidTrainer(String username, String password) {
        Optional<User> userOptional = userRepository.findUserByRole(username, password, TRAINER);
        Validation.validateUserCredentials(userOptional);
        User user = userOptional.get();
        return user;
    }



}
