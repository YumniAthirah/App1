package lesson8.GenericClasses.A7GenericMap;

import java.util.HashMap;
import java.util.Map;

public class GenericMap<K,V> {
    private Map<K, V> map;  

    //add key-value pair to the map
    public GenericMap(){
        this.map= new HashMap<>();
    }
    
    //add key-value pair to the map
    public void add(K key, V value){
        map.put(key, value);
    }

    //retrieve value based on key
    public V get(K key){
        return map.get(key);
    }

    //check if key exists in the map
    public boolean containsKey(K key){
        return map.containsKey(key);
    }

    //remove key-value pair from the map
    public void remove(K key){
        map.remove(key);
    }
    
}
