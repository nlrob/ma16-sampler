package examples;

import fileExtractors.LTExtractor;
import fileLoaders.LTLoader;

public class LabTestExample {
    public static void main(String[] args) {
        LTExtractor ltExtractor = new LTExtractor("C:\\Test\\LabTests.csv");
        LTLoader ltLoader = new LTLoader("C:\\Test\\LABTESTS\\", "lab_tests", ltExtractor.extract());
        ltLoader.load();
    }
}
