import javax.swing.text.html.parser.Entity;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.HashSet;

class mapUsingHash{      // simple but not optimized

    Entity[] entities;
    mapUsingHash(){
        entities = new Entity[100];
    }

    public void put(String key, String value){
        int hash = Math.abs(key.hashCode() % entities.length);
        entities[hash] = new Entity(key, value);
    }

    public String get(String key){
        int hash = Math.abs(key.hashCode() % entities.length);
        if(entities[hash] != null && entities[hash].key.equals(key)){
            return entities[hash].value;
        }
        return null;
    }

    public String remove(String key){
        int hash = Math.abs(key.hashCode() % entities.length);
        if(entities[hash] != null && entities[hash].key.equals(key)){
           entities[hash] = null;
        }
        return null;
    }


    private class Entity{
         String key;
         String value;

         Entity(String key, String value){
             this.key = key;
             this.value = value;
         }

    }


}


public class Main {
    public static void main(String[] args) {

        //default hash fn-----------------

//        HashMap<String, Integer> map = new HashMap<>();
//        TreeMap<String, Integer> map = new TreeMap<>();  ----its same as hashMap
//        map.put("jatin", 65);
//        map.put("mohit", 75);
//        map.put("rahul", 98);
//
//        System.out.println(map.get("mohit"));
//
//        HashSet<Integer> set = new HashSet<>();
//        set.add(34);
//        set.add(65);
//        set.add(23);
//        set.add(34);
//        set.add(86);
//        set.add(12);

//        System.out.println(set);


        // custom hashmap

//        mapUsingHash map = new mapUsingHash();
//        map.put("apple" , "red ans sweet");
//        map.put("mango", "yellow and sweet");
//        map.put("banana", "my favourite");
//
//        System.out.println(map.get("mango"));



        // optimized way of custom hashmap

        HashMapFinal<String, String> map = new HashMapFinal<>();
        map.put("apple" , "red ans sweet");
        map.put("mango", "yellow and sweet");
        map.put("banana", "my favourite");

//        System.out.println(map.get("apple"));

        System.out.println(map);

    }
}