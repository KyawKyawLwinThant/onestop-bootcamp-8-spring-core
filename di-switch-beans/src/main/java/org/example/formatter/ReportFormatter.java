package org.example.formatter;

import org.example.ds.FormattedReport;
import org.example.ds.Report;

public interface ReportFormatter {
    FormattedReport format(Report report);
}
