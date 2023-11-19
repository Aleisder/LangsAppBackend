package ru.tsarenko.analytics.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Report {
    private String description;
    private String type;
}
