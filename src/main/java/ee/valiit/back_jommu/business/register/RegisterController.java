package ee.valiit.back_jommu.business.register;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class RegisterController {

    @PostMapping("/register")
    public RegisterResponse registerUser(@RequestBody RegisterRequest request) {
        log.info(request.toString());
        return null;
    }
}
