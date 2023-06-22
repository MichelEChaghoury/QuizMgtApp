package io.ultims.quizmgtapp.question.model;

import lombok.Getter;

@Getter
public enum Category {
    PROGRAMING("P"),
    MATH("M"),
    PHYSICS("PH"),
    BIOLOGY("BIO"),
    GEOGRAPHY("G"),
    PHILOSOPHY("PL"),
    GENERAL("GEN"),
    OTHERS("OTH");

    private final String code;

    private Category(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return code;
    }
}
