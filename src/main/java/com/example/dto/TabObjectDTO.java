package com.example.dto;

/**
 * Created by DHbol on 5/9/2017.
 */
public class TabObjectDTO {

    private boolean assigned;
    private boolean unAssigned;
    private boolean team;
    private boolean closed;

    public TabObjectDTO(boolean assigned, boolean unAssigned, boolean team, boolean closed){
        this.assigned = assigned;
        this.unAssigned = unAssigned;
        this.team = team;
        this.closed = closed;
    }

    public boolean isClosed() {
        return closed;
    }

    public void setClosed(boolean closed) {
        this.closed = closed;
    }

    public boolean isTeam() {
        return team;
    }

    public void setTeam(boolean team) {
        this.team = team;
    }

    public boolean isUnAssigned() {
        return unAssigned;
    }

    public void setUnAssigned(boolean unAssigned) {
        this.unAssigned = unAssigned;
    }

    public boolean isAssigned() {
        return assigned;
    }

    public void setAssigned(boolean assigned) {
        this.assigned = assigned;
    }
}
