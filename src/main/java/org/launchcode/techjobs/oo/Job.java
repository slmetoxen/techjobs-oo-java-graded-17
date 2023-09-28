package org.launchcode.techjobs.oo;

import org.w3c.dom.ls.LSOutput;

import java.util.Objects;


public class Job {

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
        this();//The second constructor should also call the first in order to initialize the 'id' field.
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }
// TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields match.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public Location getLocation() {
        return location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

   // private static final String fieldIsEmpty = "Data not available";

    @Override
    public String toString() {
        String result;
        String newline = System.lineSeparator();
        String fieldIsEmpty = "Data not available";
        if (name.isEmpty()) {
            return "Data not available";
        } else if (employer == null) {
            return "Data not available";
        } else if (getLocation().getValue() == null) {
            return "Data not available";
        } else if (getPositionType().getValue() == null) {
            return "Data not available";
        } else if (getCoreCompetency().getValue() == null) {
            return "Data not available";
        } else {
            return newline +
                    "ID: " + id + newline +
                    "Name: " + name + newline +
                    "Employer: " + employer + newline +
                    "Location: " + location + newline +
                    "Position Type: " + positionType + newline +
                    "Core Competency: " + coreCompetency + newline;

        }

    }
}


