package ee.valiit.back_jommu.login;

import io.swagger.v3.oas.annotations.Operation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@Slf4j
@RestController
public class LoginController {

    @Resource
    private LoginService loginService;

    @GetMapping("/login")
    @Operation(summary = "Logib teenusesse sisse ja vea korral kuvab errori")
    public UserDto loginUsers(@RequestParam String username,
                              @RequestParam String password,
                              @RequestParam String roleType) {
        UserDto login = loginService.loginUser(username, password, roleType);
        return login;
    }

    @PostMapping("/register")
    public RegisterResponse registerUser(@RequestBody RegisterRequest request) {
        log.info(request.toString());
        return null;
    }
}
