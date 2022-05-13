package Homework_10;

import lombok.Getter;

@Getter
public enum Position {
    DIRECTOR(1.5),
    WORKER(1);

    private final double ratio;

    Position(double ratio) {
        this.ratio = ratio;
    }
    
    
}
    
