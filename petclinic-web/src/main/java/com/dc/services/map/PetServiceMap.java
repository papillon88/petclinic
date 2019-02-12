package com.dc.services.map;

import com.dc.model.Pet;
import com.dc.services.PetService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class PetServiceMap extends AbstractMapService<Pet> implements PetService {

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
        return super.save(item);
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }
}
