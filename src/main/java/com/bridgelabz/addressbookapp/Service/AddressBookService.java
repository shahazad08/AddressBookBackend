package com.bridgelabz.addressbookapp.Service;

import com.bridgelabz.addressbookapp.Dto.AddressBookDto;
import com.bridgelabz.addressbookapp.Model.AddressBookData;
import com.bridgelabz.addressbookapp.exceptions.AddressBookException;
import com.bridgelabz.addressbookapp.repository.AddressBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AddressBookService implements IAddressBookService{

    @Autowired
    AddressBookRepository addressBookRepository;
    @Override
    public List<AddressBookData> getAddressBookData() {
        return addressBookRepository.findAll();
    }

    @Override
    public AddressBookData getAddressBookDataById(int empId) {

        return addressBookRepository.findById(empId)
                .orElseThrow(() -> new AddressBookException("Id " + empId
                        + " Doesn't Exists...!"));
    }

    @Override
    public AddressBookData createAddressBookData(AddressBookDto addressBookDto) {
        AddressBookData addressBookData=null;
        addressBookData=new AddressBookData(addressBookDto);
        return addressBookRepository.save(addressBookData);
    }

    @Override
    public AddressBookData updateAddressBookData(int empId, AddressBookDto addressBookDto) {
        AddressBookData addressBookData=this.getAddressBookDataById(empId);
        addressBookData.updateAddressBookData(addressBookDto);
        return addressBookRepository.save(addressBookData);
    }

    @Override
    public void deleteAddressBookData(int empId) {
        AddressBookData addressBookData=this.getAddressBookDataById(empId);
        addressBookRepository.delete(addressBookData);
    }
}
