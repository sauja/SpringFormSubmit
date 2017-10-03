package com.cogentinfo.abc_insurance.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.UUID;

@Entity
public class Address implements Serializable{
    @Id
    private String id;
    @Getter @Setter private String street;
    @Getter @Setter private String aptNo;
    @Getter @Setter private String city;
    @Getter @Setter private String state;
    @Getter @Setter private String zipcode;
    public Address()
    {
        this.id= UUID.randomUUID().toString();
    }
}
