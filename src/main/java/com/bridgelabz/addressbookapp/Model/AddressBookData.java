package com.bridgelabz.addressbookapp.Model;

import com.bridgelabz.addressbookapp.Dto.AddressBookDto;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Entity
@Table(name="address_book")
public @Data class AddressBookData {


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
        this.name = addressBookDto.name;
        this.salary = addressBookDto.salary;
        this.address = addressBookDto.address;
        this.city = addressBookDto.city;
        this.state = addressBookDto.state;
        this.zipCode = addressBookDto.zipCode;
    }

//    public AddressBookData() {
//    }
}