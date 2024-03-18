package com.bridgelabz.addressbookapp.Controller;

import com.bridgelabz.addressbookapp.Dto.AddressBookDto;
import com.bridgelabz.addressbookapp.Dto.ResponseDTO;
import com.bridgelabz.addressbookapp.Model.AddressBookData;
import com.bridgelabz.addressbookapp.Service.IAddressBookService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/addressbookapp")
public class AddressBookController {

    @Autowired
    private IAddressBookService iAddressBookService;


    AddressBookData addressBookData;

    @RequestMapping(value = {"","/","/get"})
    public ResponseEntity<ResponseDTO> getAddressBookData(){
        List<AddressBookData> empDataList=null;
        empDataList=iAddressBookService.getAddressBookData();
        ResponseDTO responseDTO = new ResponseDTO("Get Calls ok Success",empDataList); // Response DTO
        return new ResponseEntity<ResponseDTO>(responseDTO,HttpStatus.OK);
    }

    @GetMapping("/get/{empId}")
    public ResponseEntity<ResponseDTO> getAddressBookDataById(@PathVariable("empId") int empId){
        Optional<AddressBookData> addressBookData=null;
        addressBookData=iAddressBookService.getAddressBookDataById(empId);
        ResponseDTO responseDTO = new ResponseDTO("Get Call for Id Successfull",addressBookData); // Response DTO
        return new ResponseEntity<ResponseDTO>(responseDTO,HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<ResponseDTO> createAddressBookData(@Valid  @RequestBody AddressBookDto addressBookDto){
        AddressBookData addressBookData=null;
        addressBookData=iAddressBookService.createAddressBookData(addressBookDto);
        ResponseDTO responseDTO = new ResponseDTO("Create address Book  for: ", addressBookData);
        return new ResponseEntity<ResponseDTO>(responseDTO,HttpStatus.OK);
    }


    @PutMapping("/update/{empId}")
    public ResponseEntity<ResponseDTO> updateAddressBookData(@PathVariable("empId") int empId, @RequestBody AddressBookDto addressBookDto){
        AddressBookData addressBookData=null;
        addressBookData=iAddressBookService.updateAddressBookData(empId, addressBookDto);
        ResponseDTO responseDTO = new ResponseDTO("Update Employee payroll Data for: ", addressBookData);
        return new ResponseEntity<ResponseDTO>(responseDTO,HttpStatus.OK);
    }
    @DeleteMapping("/delete/{empId}")
    public ResponseEntity<ResponseDTO> deleteAddressBookData(@PathVariable("empId") int empId){
        iAddressBookService.deleteAddressBookData(empId);
        ResponseDTO responseDTO = new ResponseDTO("Delete Call Success for id: ", "employeeId "+empId);
        return new ResponseEntity<ResponseDTO>(responseDTO,HttpStatus.OK);
    }
}
