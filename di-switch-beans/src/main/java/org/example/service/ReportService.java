package org.example.service;

import org.example.ds.FormattedReport;
import org.example.ds.Report;
import org.example.formatter.ReportFormatter;
import org.example.provider.ReportProvider;
import org.example.repository.ReportRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

//i18n internationalization
@Service
public class ReportService {

    private final ReportFormatter reportFormatter;
    private final ReportProvider reportProvider;
    private final ReportRepository reportRepository;

    public ReportService(@Qualifier("fileFormatter") ReportFormatter reportFormatter,
                         @Qualifier("fileProvider") ReportProvider reportProvider,
                         @Qualifier("fileRepository") ReportRepository reportRepository) {
        this.reportFormatter = reportFormatter;
        this.reportProvider = reportProvider;
        this.reportRepository = reportRepository;
    }

    public void doAction(){
        Report report =reportProvider.getReport();
        FormattedReport formattedReport =reportFormatter
                .format(report);
        reportRepository.save(formattedReport);
    }
}
