package com.coforge.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;



@Entity
public class Address {
 @Id
 private int aid;
 private String address1;
 private int zipcode;
 private String city;
 private String country;
 
}
