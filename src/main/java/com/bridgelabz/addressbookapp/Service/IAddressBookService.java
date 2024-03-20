package com.bridgelabz.addressbookapp.Service;

import com.bridgelabz.addressbookapp.Dto.AddressBookDto;
import com.bridgelabz.addressbookapp.Model.AddressBookData;
import java.util.List;
import java.util.Optional;

public interface IAddressBookService {
    List<AddressBookData> getAddressBookData();
    AddressBookData getAddressBookDataById(int empId);

    AddressBookData createAddressBookData(AddressBookDto addressBookDto);

    AddressBookData updateAddressBookData(int empId, AddressBookDto addressBookDto);

    void deleteAddressBookData(int empId);






}
