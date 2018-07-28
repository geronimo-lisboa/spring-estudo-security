package don.geronimo.estudo.testeautenticacao2;

import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @GetMapping("/data")
    @ResponseBody
    public String getData(){
        return "{\"loren\":\"ipsun\"}";
    }
    @PostMapping("/login/")
    @ResponseBody
    public String login(@RequestBody User usu){
        return usu.toString();
    }
}
