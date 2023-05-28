Map Class:

java

import java.util.HashMap;

public class Map<K, V> {
    private HashMap<K, V> map;

    public Map() {
        map = new HashMap<>();
    }

    public void put(K key, V value) {
        map.put(key, value);
    }

    public V get(K key) {
        return map.get(key);
    }

    public void remove(K key) {
        map.remove(key);
    }

    public boolean containsKey(K key) {
        return map.containsKey(key);
    }

    public boolean containsValue(V value) {
        return map.containsValue(value);
    }

    public int size() {
        return map.size();
    }

    public void clear() {
        map.clear();
    }
}