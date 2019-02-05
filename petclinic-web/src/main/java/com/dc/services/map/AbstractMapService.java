package com.dc.services.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;

public abstract class AbstractMapService<T, I> {

    Map<I, T> map = new HashMap<>();

    Set<T> findAll(){
        return new HashSet<>(map.values());
    }

    T findById(I id){
        return map.get(id);
    }

    T save(I id, T item){
        return map.put(id,item);
    }

    void deleteById(I id){
        map.remove(id);
    }

    void delete(T item){
        Predicate<Map.Entry> testPredicate = entry -> entry.getValue().equals(item);
        map.entrySet().removeIf(testPredicate);
    }
}
