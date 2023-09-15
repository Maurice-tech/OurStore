package org.TeamStore;

public class Staff {

    private  String staffName;
    private  String id;
    private  String email;

    public Staff(String staffName, String id, String email) {
        this.staffName = staffName;
        this.id = id;
        this.email = email;
    }

    public Staff() {
    }

    public boolean getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "staffName='" + staffName + '\'' +
                ", id='" + id + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

