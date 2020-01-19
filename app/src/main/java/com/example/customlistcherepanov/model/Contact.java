package com.example.customlistcherepanov.model;

public class Contact implements Comparable<Contact> {
    private String contactName;
    private String contactNumber;
    private boolean checked;

    public Contact(String contactName, String contactNumber, boolean checked) {
        this.contactName = contactName;
        this.contactNumber = contactNumber;
        this.checked = checked;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }

    @Override
    public int compareTo(Contact o) {
        if(o == null) {
            return 1;
        }
        if(this.getContactName().compareTo(o.getContactName()) == 1) {
            return 1;
        } else if(this.getContactName().compareTo(o.getContactName()) == -1) {
            return -1;
        }
        return 0;
    }
}
