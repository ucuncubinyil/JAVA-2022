package com.company.entity;

import java.util.Date;

public class Customer {

    private Long id;
    private String firstName;
    private String lastName;
    private String cellNumber;
    private Date birthDate;
    private Boolean isSingle;
    private String address;


    public Customer() {
    }

    public Customer(Long id, String firstName, String lastName, String cellNumber, Date birthDate, Boolean isSingle, String address) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.cellNumber = cellNumber;
        this.birthDate = birthDate;
        this.isSingle = isSingle;
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCellNumber() {
        return cellNumber;
    }

    public void setCellNumber(String cellNumber) {
        this.cellNumber = cellNumber;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Boolean getSingle() {
        return isSingle;
    }

    public void setSingle(Boolean single) {
        isSingle = single;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", cellNumber='" + cellNumber + '\'' +
                ", birthDate=" + birthDate +
                ", isSingle=" + isSingle +
                ", address='" + address + '\'' +
                '}';
    }
}
