package com.example.madcamp1;

public class ContactItem {
    private String name;
    private String phoneNumber;
    private int id;
    private long photo_id = 0, person_id = 0;

    public ContactItem() {
    }

    public long getPhoto_id() {
        return photo_id;
    }

    public long getPerson_id() {
        return person_id;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phoneNumber;
    }

    public int getId() {
        return id;
    }

    public int getPhoto() {
        return R.mipmap.ic_launcher_round;
    }

    public void setPhoto_id(long photo_id) {
        this.photo_id = photo_id;
    }

    public void setPerson_id(long person_id) {
        this.person_id = person_id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return this.phoneNumber;
    }

    @Override
    public int hashCode() {
        return getPhoneNumPart().hashCode();
    }

    public String getPhoneNumPart() {
        return phoneNumber.replace("-", "");
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof ContactItem) {
            return getPhoneNumPart().equals(((ContactItem) o).getPhoneNumPart());
        }
        return false;
    }
}