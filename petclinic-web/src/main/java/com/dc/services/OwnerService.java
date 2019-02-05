package com.dc.services;

import com.dc.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findyLastName(String lname);

}
