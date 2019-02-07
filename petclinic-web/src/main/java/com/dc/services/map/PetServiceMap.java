package com.dc.services.map;

import com.dc.model.Pet;
import com.dc.services.PetService;

import java.util.Set;

public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService {

    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Pet item) {
        super.delete(item);
    }

    @Override
    public Pet save(Pet item) {
        return super.save(item.getId(),item);
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }
}
