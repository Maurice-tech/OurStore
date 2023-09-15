package org.TeamStore;

public class Manger extends Staff {

    private String leaveApproved;
    private Double salary;

    public Manger(String staffName, String id, String email, String leaveApproved, Double salary) {
        super(staffName, id, email);
        this.leaveApproved = leaveApproved;
        this.salary = salary;
    }

    public String getLeaveApproved() {
        return leaveApproved;
    }

    public void setLeaveApproved(String leaveApproved) {
        this.leaveApproved = leaveApproved;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}
