package com.bbva.wikj.dto.user;

public class DtoOut {
    private String dni;
    private String nuip;
    private String full_name;
    private String phone;
    private String address;

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNuip() {
        return nuip;
    }

    public void setNuip(String nuip) {
        this.nuip = nuip;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
