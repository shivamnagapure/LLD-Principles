package Lesson2.Example2.BetterCode;

public class Main {
    public static void main(String[] args) {
        PDFReport pdfReport = new PDFReport();
        ExcelReport excelReport = new ExcelReport();

        ReportGenerator reportGenerator = new ReportGenerator();
        reportGenerator.generateReport(pdfReport);
        reportGenerator.generateReport(excelReport);
    }
}
