package com.dc.services.map;

import com.dc.model.Owner;
import com.dc.services.CrudService;

import java.util.Set;

public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements CrudService<Owner, Long> {

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
        return super.save(item.getId(),item);
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }
}
