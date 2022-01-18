package fileLoaders;

import Records.EnhancedLabTest;
import Records.LabTest;
import Records.RecordData;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import dataTransformers.LabTestTransformer;

import java.io.File;
import java.util.HashSet;
import java.util.Set;

public class LTLoader extends Loader{
    public LTLoader(String targetFolder, String defaultFileName, Set<LabTest> records){
        this.targetFolder = targetFolder;
        this.defaultFileName = defaultFileName;
        this.fileType = ".xml";
        this.records = records;
    }
    //Loads the data into a file
    public void load() {
        int batchCount = 1;
        LabTestTransformer labTestTransformer = new LabTestTransformer();
        XmlMapper xmlMapper = new XmlMapper();
        xmlMapper.enable(SerializationFeature.INDENT_OUTPUT);
        Set<RecordData> batch = new HashSet<>();
        try{
            for (RecordData report : this.records) {
                EnhancedLabTest enhancedReport = new EnhancedLabTest((LabTest)report);
                labTestTransformer.addHealthCareInfo(enhancedReport);
                batch.add(enhancedReport);
                if (batch.size() == 50000) {
                    String targetFile = this.targetFolder + this.defaultFileName + batchCount + this.fileType;
                    xmlMapper.writeValue(new File(targetFile), batch);
                    batch = new HashSet<>();
                }
            }
            String targetFile = this.targetFolder + this.defaultFileName + batchCount + this.fileType;
            xmlMapper.writeValue(new File(targetFile), batch);
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
