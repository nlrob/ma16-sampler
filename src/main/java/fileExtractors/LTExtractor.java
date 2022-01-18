package fileExtractors;

import Records.LabTest;
import com.opencsv.CSVReader;

import java.io.FileReader;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class LTExtractor extends Extractor {
    public LTExtractor(String srcFile){
        this.srcFile = srcFile;
    }
    //Loads records from CSV file
    public Set<LabTest> extract() {
        HashSet<LabTest> reports = new HashSet<>();
        try{
            CSVReader csvReader = new CSVReader(new FileReader(this.srcFile));
            for(String[] record: csvReader){
                if(!Objects.equals(record[0], "IDNum")) {
                    reports.add(reportFromRecord(record));
                }
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        return reports;
    }
    //Creates a LabTest from a given record
    private LabTest reportFromRecord(String[] record){
        String idNum = record[0];
        String idType = record[1];
        String firstName = record[2];
        String lastName = record[3];
        String resultDate = record[4];
        String birthDate = record[5];
        String labCode = record[6];
        String stickerNumber = record[7];
        String resultTestCorona = record[8];
        String variant = record[9];
        String testType = record[10];
        return new LabTest(idNum, idType, firstName, lastName, resultDate, birthDate, labCode, stickerNumber, resultTestCorona, variant, testType);
    }
}
