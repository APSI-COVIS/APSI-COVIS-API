package com.covis.api;

import org.springframework.web.bind.annotation.GetMapping;

public interface HelloWorldResource {

    @GetMapping("/helloworld")
    public String helloWorldEndPoint();
}
