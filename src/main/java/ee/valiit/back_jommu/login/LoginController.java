package ee.valiit.back_jommu.login;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/jommu")
public class LoginController {

    @Resource
    private LoginService loginService;

    @GetMapping("/login")
    @Operation(summary = "Logib teenusesse sisse ja vea korral kuvab errori")
    public UserDto login(@RequestParam String username, @RequestParam String password) {
        UserDto login = loginService.login(username, password);
        return login;
    }
}
