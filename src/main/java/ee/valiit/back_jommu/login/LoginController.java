package ee.valiit.back_jommu.login;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class LoginController {

    @Resource
    private LoginService loginService;

    @GetMapping("/login")
    @Operation(summary = "Logib teenusesse sisse ja vea korral kuvab errori")
    public UserDto loginAthlete(@RequestParam String username,
                                @RequestParam String password,
                                @RequestParam String roleType) {
        UserDto login = loginService.loginUser(username, password, roleType);
        return login;
    }
}
