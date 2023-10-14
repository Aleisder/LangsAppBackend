package ru.tsarenko.langs.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@Getter
public class Unit {
    private String type;
    private String text;
    private String audio;
    private String image;
}
