package org.launchcode.techjobs.oo;

import org.w3c.dom.ls.LSOutput;

import java.util.Objects;

public class  Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Job job)) return false;
        return getId() == job.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
//TODO: Create custom toString

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        String dna = "Data not available";
        if(name == null || name.isEmpty()){
            name = dna;
        }
        if( employer.getValue() == null || employer.getValue().equals("")){
            employer.setValue(dna);
        }
        if(location.getValue() == null || location.getValue() == ""){
            location.setValue(dna);
        }
        if(positionType.getValue() == null || positionType.getValue() == ""){
            positionType.setValue(dna);
        }

            if(coreCompetency.getValue() == null || coreCompetency.getValue()==""){

              coreCompetency.setValue(dna);
          }



        return   newLine +
                "ID: " + getId() + newLine +
                "Name: " + getName() + newLine +
                "Employer: " + getEmployer() + newLine +
                "Location: " + getLocation() + newLine +
                "Position Type: " + getPositionType() + newLine +
                "Core Competency: " + getCoreCompetency() +
                newLine;

    }


    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

    public int getId(){
        return id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }
}
