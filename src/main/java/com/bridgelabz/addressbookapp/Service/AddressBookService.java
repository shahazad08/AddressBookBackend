package com.bridgelabz.addressbookapp.Service;

import com.bridgelabz.addressbookapp.Dto.AddressBookDto;
import com.bridgelabz.addressbookapp.Model.AddressBookData;
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
    public Optional<AddressBookData> getAddressBookDataById(int empId) {
       return addressBookRepository.findById(empId);
    }

    @Override
    public AddressBookData createAddressBookData(AddressBookDto addressBookDto) {
        AddressBookData addressBookData=null;
        addressBookData=new AddressBookData(addressBookDto);
        return addressBookRepository.save(addressBookData);
    }

    @Override
    public AddressBookData updateAddressBookData(int empId, AddressBookDto addressBookDto) {
        return getAddressBookDataById(empId)
                .map(addressBookData -> {
                    addressBookData.updateAddressBookData(addressBookDto);
                    return addressBookData;
                })
                .map(addressBookRepository::save)
                .orElse(null); // or handle appropriately if data is not found
    }

    @Override
    public void deleteAddressBookData(int empId) {
        getAddressBookDataById(empId).ifPresent(addressBookRepository::delete);
    }
}
