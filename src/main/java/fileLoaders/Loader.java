package fileLoaders;

import Records.RecordData;

import java.util.Set;

public abstract class Loader {
    protected String targetFolder;
    protected String defaultFileName;
    protected String fileType;
    protected Set<? extends RecordData> records;
    public abstract void load();
}
