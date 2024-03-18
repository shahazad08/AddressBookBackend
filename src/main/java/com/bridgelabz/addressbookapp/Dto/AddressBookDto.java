package com.bridgelabz.addressbookapp.Dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.ToString;

public @ToString class AddressBookDto {
    @Pattern(regexp="^[A-Z]{1}[a-zA-Z\\s]{2,}$", message="Employee name Invalid")
    @NotEmpty(message = "Employee Name can't be null")
    public String name;

    public long salary;
    @NotBlank(message = "Address cannot be empty")
    public String address;

    @NotBlank(message = "City cannot be empty")
    public String city;

    @NotBlank(message = "State cannot be empty")
    public String state;
    public long zipCode;

}