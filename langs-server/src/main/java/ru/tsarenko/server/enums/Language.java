package ru.tsarenko.server.enums;

import lombok.Getter;
import ru.tsarenko.server.exception.UnknownLanguageCode;

public enum Language {
    EN("english"),
    RU("russian"),
    DE("german");

    @Getter
    private final String value;

    Language(String value) {
        this.value = value;
    }

    public static Language convert(String language) {
        return switch (language) {
            case "en" -> Language.EN;
            case "ru" -> Language.RU;
            case "de" -> Language.DE;
            default -> throw new UnknownLanguageCode(
                    String.format(ErrorMessage.UNKNOWN_LANGUAGE_CODE_MESSAGE, language)
            );
        };
    }

}
