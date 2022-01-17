package fileExtractors;

import Records.MDAReport;
import com.opencsv.CSVReader;

import java.io.FileReader;
import java.util.HashSet;
import java.util.Set;

public class MRExtractor extends Extractor{
    public MRExtractor(String srcFile){
        this.srcFile = srcFile;
    }
    //Loads records from CSV file
    public Set<MDAReport> extract() {
        HashSet<MDAReport> reports = new HashSet<>();
        try{
            CSVReader csvReader = new CSVReader(new FileReader(this.srcFile));
            for(String[] record: csvReader){
                reports.add(reportFromRecord(record));
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        return reports;
    }
    //Creates a MDAReport from a given record
    private MDAReport reportFromRecord(String[] record){
        String mdaCode = record[0];
        String idNum = record[1];
        String idType = record[2];
        String firstName = record[3];
        String lastName = record[4];
        String city = record[5];
        String street = record[6];
        String buildingNumber = record[7];
        String barcode = record[8];
        String getDate = record[9];
        String takeDate = record[10];
        String resultDate = record[11];
        return new MDAReport(mdaCode, idNum, idType, firstName, lastName, city, street, buildingNumber, barcode, getDate, takeDate, resultDate);
    }
}
