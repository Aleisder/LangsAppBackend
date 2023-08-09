package ru.tsarenko.langs.enums;

public enum Language {
    EN("english"),
    RU("russian"),
    DE("german");

    private final String value;

    Language(String value) {
        this.value = value;
    }

}
