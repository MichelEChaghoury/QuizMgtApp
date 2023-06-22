package io.ultims.quizmgtapp.question.model;

import lombok.Getter;

@Getter
public enum Difficulty {
    EASY("E"),
    MEDIUM("M"),
    HARD("H"),
    VERY_HARD("V");

    private String code;

    private Difficulty(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return code;
    }
}
