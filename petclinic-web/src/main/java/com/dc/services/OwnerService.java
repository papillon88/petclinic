package com.dc.services;

import com.dc.model.Owner;

import java.util.Set;

public interface OwnerService {

    Owner findyLastName(String lname);
    Owner findById(Long id);
    Owner save(Owner owner);
    Set<Owner> findAll();

}
