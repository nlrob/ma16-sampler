package fileExtractors;

import Records.RecordData;

import java.util.Set;

public abstract class Extractor {
    protected String srcFile;
    public abstract Set<? extends RecordData> extract();
}
