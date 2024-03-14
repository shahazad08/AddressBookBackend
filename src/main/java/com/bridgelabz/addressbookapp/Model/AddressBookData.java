package com.bridgelabz.addressbookapp.Model;

import com.bridgelabz.addressbookapp.Dto.AddressBookDto;
import jakarta.persistence.*;

@Entity
@Table(name="address_book")
public class AddressBookData {


    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "address_id")
    @Id
    private int id;

    private String name;
    private long salary;
    public String address;
    public String city;
    public String state;
    public long zipCode;



    public AddressBookData(AddressBookDto addressBookDto) {
       this.updateAddressBookData(addressBookDto);
    }

    public AddressBookData() {

    }

    public void updateAddressBookData(AddressBookDto addressBookDto) {
        this.name=addressBookDto.name;
        this.salary=addressBookDto.salary;
        this.address=addressBookDto.address;
        this.city=addressBookDto.city;
        this.state=addressBookDto.state;
        this.zipCode=addressBookDto.zipCode;
    }

//    public AddressBookData() {
//    }

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
        this.state = state;
    }

    public long getZipCode() {
        return zipCode;
    }

    public void setZipCode(long zipCode) {
        this.zipCode = zipCode;
    }

    public int getEmployeeId() {
        return id;
    }

    public void setEmployeeId(int employeeId) {
        this.id = id;
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
        return "AddressBookData{" +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zipCode='" + zipCode + '\'' +
                '}';
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
