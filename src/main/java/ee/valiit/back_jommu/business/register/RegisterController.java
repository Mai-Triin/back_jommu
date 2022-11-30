package ee.valiit.back_jommu.business.register;

import ee.valiit.back_jommu.domain.profile.ProfileRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@Slf4j
@RestController
public class RegisterController {

    @Resource
    private RegisterService registerService;

    @PostMapping("/register")
    public void registerUser(@RequestBody ProfileRequest request) {
        registerService.registerUser(request);

        log.info(request.toString());
    }
}
