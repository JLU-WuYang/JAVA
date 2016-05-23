
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
public class UseToolClass {
    public static void main(String[] args){
//    List<Integer> list=new ArrayList<Integer>();
//    list.add(1);
//    list.add(3);
//    list.add(2);
//    for(Iterator it=list.listIterator();it.hasNext();)
//        System.out.println(it.next());
//    Collections.sort(list);
//     for(Iterator it=list.listIterator();it.hasNext();)
//        System.out.println(it.next());
//     Collections.reverse(list);
//    Collections.fill(list, 4);
//       for(Iterator it=list.listIterator();it.hasNext();)
//        System.out.println(it.next());
       Set<String> set=new HashSet<String>();
       set.add("f");
       set.add("b");
       set.add("a");
       set.add("c");
     System.out.print(Collections.max(set));
        for(Iterator it=set.iterator();it.hasNext();)
        System.out.println(it.next());
    }
    
    
}
