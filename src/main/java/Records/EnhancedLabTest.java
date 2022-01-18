package Records;

public class EnhancedLabTest extends LabTest{
    String joinDate;
    String healthCareID;
    String healthCareName;

    public EnhancedLabTest(LabTest labTest){
        super(labTest);
    }

    public void setJoinDate(String joinDate) {
        this.joinDate = joinDate;
    }

    public void setHealthCareID(String healthCareID) {
        this.healthCareID = healthCareID;
    }

    public void setHealthCareName(String healthCareName) {
        this.healthCareName = healthCareName;
    }
}
