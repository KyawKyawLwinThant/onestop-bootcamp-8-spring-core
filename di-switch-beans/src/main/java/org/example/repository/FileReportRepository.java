package org.example.repository;

import org.example.ds.FormattedReport;
import org.springframework.stereotype.Component;

@Component("fileRepository")
public class FileReportRepository implements ReportRepository{
    @Override
    public void save(FormattedReport formattedReport) {
        System.out.println(this.getClass()
                .getSimpleName()+"::save(FormattedReport formattedReport)");
    }
}
