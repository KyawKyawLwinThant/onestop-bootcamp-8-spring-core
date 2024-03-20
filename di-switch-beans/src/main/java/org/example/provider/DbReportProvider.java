package org.example.provider;

import org.example.ds.Report;
import org.springframework.stereotype.Component;

@Component("dbProvider")
public class DbReportProvider implements ReportProvider{
    @Override
    public Report getReport() {
        System.out.println(getClass().getSimpleName()
                + "::getReport()");
        return new Report();
    }
}
