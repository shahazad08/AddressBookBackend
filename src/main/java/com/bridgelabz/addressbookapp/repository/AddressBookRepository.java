package com.bridgelabz.addressbookapp.repository;

import com.bridgelabz.addressbookapp.Model.AddressBookData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressBookRepository extends JpaRepository<AddressBookData, Integer> {
}
