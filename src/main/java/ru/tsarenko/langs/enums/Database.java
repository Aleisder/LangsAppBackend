package ru.tsarenko.langs.enums;

public enum Database {

    SYLLABUS("syllabus"),
    ENGLISH("english"),
    GERMAN("german");

    private final String value;

    Database(String value) {
        this.value = value;
    }
}
