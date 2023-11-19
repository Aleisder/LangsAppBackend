package ru.tsarenko.analytics.service;

import org.springframework.stereotype.Service;
import ru.tsarenko.analytics.model.Report;

@Service
public class ReportService {

    public String addReport(Report report) {
        return report.getDescription();
    }
}
