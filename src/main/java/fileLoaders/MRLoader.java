package fileLoaders;

import Records.MDAReport;
import Records.RecordData;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.File;
import java.util.HashSet;
import java.util.Set;

public class MRLoader extends Loader{
    public MRLoader(String targetFolder, String defaultFileName, Set<MDAReport> records){
        this.targetFolder = targetFolder;
        this.defaultFileName = defaultFileName;
        this.fileType = ".json";
        this.records = records;
    }
    //Loads the data into a file
    public void load() {
        int batchCount = 1;
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        Set<RecordData> batch = new HashSet<>();
        try {
            for (RecordData report : this.records) {
                batch.add(report);
                if (batch.size() == 50000) {
                    String targetFile = this.targetFolder + this.defaultFileName + batchCount + this.fileType;
                    mapper.writeValue(new File(targetFile), batch);
                    batch = new HashSet<>();
                }
            }
            String targetFile = this.targetFolder + this.defaultFileName + batchCount + this.fileType;
            mapper.writeValue(new File(targetFile), batch);
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
