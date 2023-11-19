package ru.tsarenko.analytics.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.tsarenko.analytics.model.Report;
import ru.tsarenko.analytics.service.ReportService;

@RestController
@AllArgsConstructor
@RequestMapping("/langs/analytics/report")
public class ReportController {

    private final ReportService reportService;

    @GetMapping("/ping")
    public String ping() {
        return "Ok";
    }

    @PostMapping("/add")
    public String addReport(@RequestBody Report report) {
        return reportService.addReport(report);
    }
}
