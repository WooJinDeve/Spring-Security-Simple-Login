package login.security.controller;

import login.security.dto.JoinFormDto;
import login.security.dto.UserInfoDto;
import login.security.entity.User;
import login.security.repository.LoginRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.stream.Collectors;

@Controller
@RequiredArgsConstructor
@Slf4j
public class LoginController {

    private final LoginRepository loginRepository;
    private final BCryptPasswordEncoder passwordEncoder;

    @GetMapping("/user")
    @ResponseBody
    public String user(){
        return "user";
    }

    @GetMapping("/admin")
    @ResponseBody
    public String admin(){
        return "admin";
    }

    @GetMapping("/manager")
    @ResponseBody
    public String manager(){
        return "manager";
    }

    //스프링 시큐리티 Login 먼저 실행 -> http.csrf().disable();
    @GetMapping("/loginForm")
    public String loginForm(){
        return "loginForm";
    }

    @GetMapping("/join")
    public String join(Model model){
        model.addAttribute("joinForm",new JoinFormDto());
        return "joinForm";
    }

    @PostMapping("/join")
    public String join(JoinFormDto joinFormDto){
        String rawPassword = joinFormDto.getPassword();
        String encPassword = passwordEncoder.encode(rawPassword);
        User user = new User(joinFormDto.getEmail(), encPassword,joinFormDto.getUsername());
        loginRepository.save(user);
        return "redirect:/loginForm";
    }

    @Secured("ROLE_ADMIN")
    @GetMapping("/info")
    public String info(Model model){
        List<UserInfoDto> users = loginRepository.findAll().stream().map(UserInfoDto::new)
                .collect(Collectors.toList());
        model.addAttribute("users", users);
        return "userInfo";
    }

    @PreAuthorize("hasRole('ROLE_MANAGER') or hasRole('ROLE_ADMIN')")
    @GetMapping("/data")
    @ResponseBody
    public String data(Model model){
        return "userData";
    }
}
