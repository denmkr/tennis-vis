package org.kn.tennis.entities;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

/**
 * Created by denis on 2/14/20.
 */

@JsonAutoDetect
public class Ball {

    private final long id;
    private Position position;

    public Ball() {
        this.id = -1;
        this.position = new Position();
    }

    public Ball(long id, Position position) {
        this.id = id;
        this.position = position;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public long getId() {
        return id;
    }
}
