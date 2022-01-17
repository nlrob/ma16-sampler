package fileLoaders;

import Records.RecordData;

import java.util.Set;

public abstract class Loader {
    String targetFolder;
    String defaultFileName;
    String fileType;
    Set<? extends RecordData> records;
    public abstract void load();
}
