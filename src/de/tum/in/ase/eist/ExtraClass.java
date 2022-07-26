package de.tum.in.ase.eist;

public class ExtraClass {

    private PEV pev;

    private Boolean availability;

    public ExtraClass(PEV pev, Boolean availability) {
        this.pev = pev;
        this.availability = availability;
    }

    public PEV getPev() {
        return pev;
    }

    public void setPev(PEV pev) {
        this.pev = pev;
    }

    public Boolean getAvailability() {
        return availability;
    }

    public void setAvailability(Boolean availability) {
        this.availability = availability;
    }
}
