import java.util.HashMap;
import java.util.Map;

public class Syntax {
    public static void main(String[] args) {
//        <key:datatype, value:datatype>
//        key,value
        Map<String, Integer> map = new HashMap<>();
//        Entry: key value,
//        Adding elements
        map.put("jay", 22);
        map.put("ritika", 21);
        map.put("vedika", 19);
        System.out.println(map);
//        getting value of a key
        System.out.println(map.get("jay"));
        System.out.println(map.get("jai"));        //null
//        Updating value of a key
        map.put("jay", 23);
        System.out.println(map);
//Removing a pair from hashmap
// takes a key and removes if present else return null
// returns the removed value
        System.out.println(map.remove("vedika"));
        System.out.println(map);
//        Adding a new entry ONLY IF new key doesn't exist
        map.putIfAbsent("durga",25);
        map.putIfAbsent("jay",25);
//        Checking if a key exist in a map
        System.out.println(map.containsKey("jay"));
        System.out.println(map.containsKey("ja"));
//        get all keys
        System.out.println(map.keySet());
//        gte all values
        System.out.println(map.values());
//        get key value pair
        System.out.println(map.entrySet());
// Iterating over hashmap
            for(String key: map.keySet())  {
                System.out.printf("Age of %s is %d\n",key,map.get(key));
            }
            for( Map.Entry<String,Integer> e: map.entrySet())
            {
                System.out.printf("Age of %s is %d\n",e.getKey(),e.getValue());
    }

            for(var e : map.entrySet()){
                System.out.printf("Age of %s is %d\n",e.getKey(),e.getValue());
            }
    }

}


