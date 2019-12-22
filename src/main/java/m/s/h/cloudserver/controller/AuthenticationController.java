package m.s.h.cloudserver.controller;

import m.s.h.cloudserver.model.Result;
import m.s.h.cloudserver.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthenticationController {

    @Autowired
    LoginService loginService;

    @PostMapping("/auth/v1/login")
    public Result login(String email, String password) {
        return loginService.login(email, password);
    }

    @PostMapping("/auth/v1/join")
    public Result join(String email, String nick_name, String password) {
        return loginService.join(email, nick_name, password);
    }

}
