package dataTransformers;

import Records.EnhancedLabTest;
import health_care_provider.HealthCareInfoProvider;
import health_care_provider.errors.InvalidIdException;
import health_care_provider.models.PersonInsured;

public class LabTestTransformer {
    //Adds the required info to labTest
    public void addHealthCareInfo(EnhancedLabTest labTest){
        HealthCareInfoProvider healthCareInfoProvider = new HealthCareInfoProvider();
        try{
            PersonInsured person = healthCareInfoProvider.fetchInfo(Integer.parseInt(labTest.getIdNum()), Integer.parseInt(labTest.getIdType()));
            labTest.setJoinDate(String.valueOf(person.getJoinDate()));
            labTest.setHealthCareID(String.valueOf(person.getHealthCareId()));
            labTest.setHealthCareName(person.getHealthCareName());
        } catch (InvalidIdException e){
            labTest.setJoinDate("n/a");
            labTest.setHealthCareID("n/a");
            labTest.setHealthCareName("n/a");
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}