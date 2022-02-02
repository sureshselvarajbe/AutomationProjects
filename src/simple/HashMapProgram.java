package simple;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapProgram {
    public static void main(String[] args){
        Map<String,String> keyValues = new HashMap<String,String>();
        keyValues.put("Suresh","Selvaraj");
        keyValues.put("Sangeetha","Suresh");
        keyValues.put("Vishnu","Suresh");

        for(Map.Entry<String,String> name: keyValues.entrySet()){
            System.out.println("First Name: "+name.getKey()+"<=> Last Name: "+name.getValue());
        }

        TreeMap<String,String> sortedKeys = new TreeMap<String,String>(keyValues);
        for(Map.Entry<String,String> sortedKey : sortedKeys.entrySet()){
            System.out.println("First Name: "+sortedKey.getKey()+"<=> Last Name: "+sortedKey.getValue());
        }
    }
}
