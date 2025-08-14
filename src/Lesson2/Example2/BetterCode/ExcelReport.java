package Lesson2.Example2.BetterCode;

public class ExcelReport implements Report{
    @Override
    public String reportGenerate() {
        return "Generating Excel report.";
    }
}
