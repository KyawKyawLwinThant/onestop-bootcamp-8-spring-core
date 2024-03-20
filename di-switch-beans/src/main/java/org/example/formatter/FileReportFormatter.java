package org.example.formatter;

import org.example.ds.FormattedReport;
import org.example.ds.Report;
import org.springframework.stereotype.Component;

@Component("fileFormatter")
public class FileReportFormatter implements ReportFormatter{
    @Override
    public FormattedReport format(Report report) {
        System.out.println(this.getClass().getSimpleName()+
                "::format(Report report) invoked.");
        return new FormattedReport(report);
    }
}
