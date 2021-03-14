package controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/api/redressal")
public class RedressalController {

    @PostMapping("/complaints/{id}/assign")
    public void assignComplaintById(){

    }

    @PostMapping("/agents")
    public void registerAgent(){

    }

    @PostMapping("/complaints/{id}/fix")
    public void postFixById(){

    }
}
