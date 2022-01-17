package Records;

public class MDAReport extends RecordData{
    String mdaCode;
    String idNum;
    String idType;
    String firstName;
    String lastName;
    String city;
    String street;
    String buildingNumber;
    String barcode;
    String getDate;
    String takeDate;
    String resultDate;

    public String getMdaCode() {
        return this.mdaCode;
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

    public String getCity() {
        return this.city;
    }

    public String getStreet() {
        return this.street;
    }

    public String getBuildingNumber() {
        return this.buildingNumber;
    }

    public String getBarcode() {
        return this.barcode;
    }

    public String getGetDate() {
        return this.getDate;
    }

    public String getTakeDate() {
        return this.takeDate;
    }

    public String getResultDate() {
        return this.resultDate;
    }
}
