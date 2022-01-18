package examples;

import fileExtractors.MRExtractor;
import fileLoaders.MRLoader;

public class MDAReportExample {
    public static void main(String[] args) {
        MRExtractor mrExtractor = new MRExtractor("C:\\Test\\MadaReports.csv");
        MRLoader mrLoader = new MRLoader("C:\\Test\\mada_reports\\", "mada_reports", mrExtractor.extract());
        mrLoader.load();
    }
}
