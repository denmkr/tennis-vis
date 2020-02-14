package org.kn.tennis.controllers;

import org.kn.tennis.entities.Ball;
import org.kn.tennis.entities.Position;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by denis on 2/14/20.
 */

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/v1")
public class BallController {

    @RequestMapping(path = "/balls")
    @GetMapping
    public List<Ball> getBalls() {
        Ball ball1 = new Ball(1, new Position(1, 10));
        Ball ball2 = new Ball(2, new Position(22, 5));

        List<Ball> ballList = new ArrayList<>();
        ballList.add(ball1);
        ballList.add(ball2);

        return ballList;
    }
}
