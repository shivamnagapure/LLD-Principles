package Lesson2.Example2.ProblamaticCode;

public class ReportGenerator {
    public String generateReport(String reportType) {
        if (reportType.equals("PDF")) {
            return "Generating PDF report.";
        } else if (reportType.equals("Word")) {
            return "Generating Word report.";
        }
        return "Report type not supported.";
    }
}
