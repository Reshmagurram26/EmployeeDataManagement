package com.employee.datadetails.entity;
import jakarta.persistence.*;
@Entity
@Table(name = "Employee")
public class EmployeeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private long id  ;
    @Column
    private String firstName ;
    @Column
    private String lastName ;
    @Column
    private long enrollmentNumber ;
    @Column
    private String addressLineOne;
    @Column
    private long apt;
    @Column
    private String city ;
    @Column
    private String state ;
    @Column
    private long zipcode;
    @Column
    private String country ;
    public long getId() {
        return id;
    }
    public void setId(long id) {
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
    public long getEnrollmentNumber() {
        return enrollmentNumber;
    }
    public void setEnrollmentNumber(long enrollmentNumber) {
        this.enrollmentNumber = enrollmentNumber;
    }
    public String getAddressLineOne() {
        return addressLineOne;
    }
    public void setAddressLineOne(String addressLineOne) {
        this.addressLineOne = addressLineOne;
    }
    public long getApt() {
        return apt;
    }
    public void setApt(long apt) {
        this.apt = apt;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    public long getZipcode() {
        return zipcode;
    }
    public void setZipcode(long zipcode) {
        this.zipcode = zipcode;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
}


