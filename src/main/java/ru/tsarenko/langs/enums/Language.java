package ru.tsarenko.langs.enums;

import lombok.Getter;
import ru.tsarenko.langs.exception.UnknownLanguageCode;

import static ru.tsarenko.langs.enums.ErrorMessage.UNKNOWN_LANGUAGE_CODE_MESSAGE;

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
                    String.format(UNKNOWN_LANGUAGE_CODE_MESSAGE, language)
            );
        };
    }

}
