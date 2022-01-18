package Records;

public class LabTest extends RecordData{
    String idNum;
    String idType;
    String firstName;
    String lastName;
    String resultDate;
    String birthDate;
    String labCode;
    String stickerNumber;
    String resultTestCorona;
    String variant;
    String testType;

    public LabTest(String idNum, String idType, String firstName, String lastName, String resultDate, String birthDate, String labCode,
                   String stickerNumber, String resultTestCorona, String variant, String testType){
        this.idNum = idNum;
        this.idType = idType;
        this.firstName = firstName;
        this.lastName = lastName;
        this.resultDate = resultDate;
        this.birthDate = birthDate;
        this.labCode = labCode;
        this.stickerNumber = stickerNumber;
        this.resultTestCorona = resultTestCorona;
        this.variant = variant;
        this.testType = testType;
    }

    public String getIdNum() {
        return this.idNum;
    }

    public String getIdType() {
        return this.idType;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getResultDate() {
        return this.resultDate;
    }

    public String getBirthDate() {
        return this.birthDate;
    }

    public String getLabCode() {
        return this.labCode;
    }

    public String getStickerNumber() {
        return this.stickerNumber;
    }

    public String getResultTestCorona() {
        return this.resultTestCorona;
    }

    public String getVariant() {
        return this.variant;
    }

    public String getTestType() {
        return this.testType;
    }
}
