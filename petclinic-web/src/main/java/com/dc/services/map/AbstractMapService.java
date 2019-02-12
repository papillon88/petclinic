package com.dc.services.map;

import com.dc.model.BaseEntity;

import java.util.*;
import java.util.function.Predicate;

public abstract class AbstractMapService<T extends BaseEntity> {

    Map<java.lang.Long, T> map = new HashMap<>();

    Set<T> findAll(){
        return new HashSet<>(map.values());
    }

    T findById(java.lang.Long id){
        return map.get(id);
    }

    T save(T item){
        if (item != null) {
            if(item.getId() == null){
                item.setId(this.setNextItemId());
            }
            map.put(item.getId(),item);
        } else {
            throw new RuntimeException("object cannot be null");
        }
        return item;
    }

    void deleteById(java.lang.Long id){
        map.remove(id);
    }

    void delete(T item){
        Predicate<Map.Entry> testPredicate = entry -> entry.getValue().equals(item);
        map.entrySet().removeIf(testPredicate);
    }

    java.lang.Long setNextItemId(){
        Long nextId = null;
        try{
            nextId = Collections.max(map.keySet()) + 1;
        } catch (NoSuchElementException nse){
            nextId = 1L;
        }
        return nextId;
    }
}
