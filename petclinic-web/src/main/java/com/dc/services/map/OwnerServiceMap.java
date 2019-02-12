package com.dc.services.map;

import com.dc.model.Owner;
import com.dc.services.OwnerService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class OwnerServiceMap extends AbstractMapService<Owner> implements OwnerService {

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Owner item) {
        super.delete(item);
    }

    @Override
    public Owner save(Owner item) {
        return super.save(item);
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner findyLastName(String lname) {
        return null;
    }
}
