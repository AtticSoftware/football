package de.atticsoftware.football.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import reactor.core.publisher.Mono;

@Controller
@RequestMapping("football/api/match")
public class MatchController {

    @PostMapping("/play")
    @ResponseStatus(HttpStatus.OK)
    public Mono<Void> playMatch() {

        System.out.println("Called play match");
        return Mono.empty();
    }
}
