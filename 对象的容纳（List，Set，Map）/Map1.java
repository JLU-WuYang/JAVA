
import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class Map1 {
    
     public static void main(String[] args){
    Map<String,Integer> map=new TreeMap<String,Integer>();
    map.put("a", 1);
    map.put("c", 3);
    map.put("b", 2);
//    Collection<Integer> s=map.values();
//    for(Iterator it=s.iterator();it.hasNext();)
//        System.out.println(it.next());

//Set<String> s=map.keySet();
//    for(Iterator it=s.iterator();it.hasNext();)
//        System.out.println(map.get(it.next()));
//    
 Set<Map.Entry<String,Integer>> s=map.entrySet();
     for(Iterator it=s.iterator();it.hasNext();)
     {
     Map.Entry<String,Integer> k=(Map.Entry<String,Integer>)it.next();
     System.out.println(k.getKey()+"    "+k.getValue());
     
     }
  
     }
   
    
}
