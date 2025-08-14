package Lesson2.Example2.BetterCode;

public class PDFReport implements Report {
    @Override
    public String reportGenerate() {
        return  "Generating PDF report.";
    }
}
