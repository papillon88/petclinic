package com.dc.services.map;

import com.dc.model.Vet;
import com.dc.services.VetService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class VetServiceMap extends AbstractMapService<Vet> implements VetService {

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Vet item) {
        super.delete(item);
    }

    @Override
    public Vet save(Vet item) {
        return super.save(item);
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }
}
