package com.employee.datadetails.request;
import jakarta.validation.constraints.*;
public class EmployeeRequest {
    @NotNull
    private long id;
    @NotBlank(message = "First name cannot be empty")
    @Pattern(regexp = "[a-zA-Z]+", message = "First name should contain only characters")
    @Size(max = 10,min = 5)
    private String firstName;
    @NotBlank
    @Pattern(regexp = "[a-zA-Z]+")
    @Size(max = 10, min = 5)
    private String lastName;
    @NotNull
    @Max(9999999)
    private long enrollmentNumber;//it can be null
    @NotBlank(message = "must enter the value either char or int")
    @Size(min = 5, max = 8)
    private String addressLineOne;
    @NotNull(message = "Must enter the value")
    @Max(value=99999)
    private long apt;
    @NotNull(message = "Must enter the value")
    @Size(min = 5,max = 10)
    @Pattern(regexp = "[a-zA-Z]+")
    private String city;
    @NotNull(message = "Must enter the value")
    @Max(value =99999)
    private long zipcode;
//    @NotBlank(message = "Should enter only two characters")
//    @Size(min = 2, max = 10)
//    @Pattern(regexp = "[a-zA-Z]+")
    private String state;
    @NotBlank(message = "Must enter the value")
    @Size( min = 5,max = 10)
    @Pattern(regexp = "[a-zA-Z]+")
    private String country;
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
    public long getZipcode() {
        return zipcode;
    }
    public void setZipcode(long zipcode) {
        this.zipcode = zipcode;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
}