package com.coforge.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coforge.demo.model.Address;

public interface AddressRepo extends JpaRepository<Address, Integer>{

}
