package kata_4.model;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Histogram<T> {
    
    private final HashMap<T, Integer> map;
    
    public Histogram(){
        this.map = new HashMap<T, Integer>();
    }
    
    public int get (Object o){
        return map.get(o);
    }
    
    public Set<T> keySet(){
        return map.keySet();
    }
    
    public void increment(T key){
        map.put(key, map.containsKey(key) ? map.get(key) + 1: 1);
    }
    
}
