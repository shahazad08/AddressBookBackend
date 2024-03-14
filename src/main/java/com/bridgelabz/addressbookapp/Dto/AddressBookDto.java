package com.bridgelabz.addressbookapp.Dto;

public class AddressBookDto {
    public String name;
    public long salary;
    public String address;
    public String city;
    public String state;
    public long zipCode;

    public AddressBookDto() {
    }

    public AddressBookDto(String name, long salary, String address, String city, String state, long zipCode) {
        this.name = name;
        this.salary = salary;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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
        state = state;
    }

    public long getZipCode() {
        return zipCode;
    }

    public void setZipCode(long zipCode) {
        this.zipCode = zipCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "AddressBookDto{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", State='" + state + '\'' +
                ", zipCode='" + zipCode + '\'' +
                '}';
    }
}
