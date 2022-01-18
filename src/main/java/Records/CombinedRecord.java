package Records;

public class CombinedRecord {
    String idNum;
    String idType;
    String firstName;
    String lastName;
    String city;
    String street;
    String buildingNumber;
    String barcode;
    String birthDate;
    String labCode;
    String resultDate;
    String takeDate;
    String stickerNumber;
    String resultTestCorona;
    String variant;
    String testType;

    public CombinedRecord(String idNum, String idType, String firstName, String lastName, String city, String street, String buildingNumber, String barcode,
                          String birthDate, String labCode, String resultDate, String takeDate, String stickerNumber, String resultTestCorona, String variant,
                          String testType){
        this.idNum = idNum;
        this.idType = idType;
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.street = street;
        this.buildingNumber = buildingNumber;
        this.barcode = barcode;
        this.birthDate = birthDate;
        this.labCode = labCode;
        this.resultDate = resultDate;
        this.takeDate = takeDate;
        this.stickerNumber = stickerNumber;
        this.resultTestCorona = resultTestCorona;
        this.variant = variant;
        this.testType = testType;
    }
}
