
import java.util.*;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
 class em{
int id;
 public boolean equals(Object e){
     em e1=(em)e;
    return this.id==e1.id;
    }
 public int hashCode(){
 return this.id;
 }
}
public class hash {
   public static void main(String[] args){
   Set<em> set=new HashSet<em>();
   em e=new em();
   e.id=0;
   set.add(e);
   em a=new em();
   a.id=1;
   set.add(a);
    System.out.println(set);
   System.out.print(a.equals(e));
   for(Iterator it=set.iterator();it.hasNext();)
        System.out.println(((em)it.next()).id);
   
   
   }
  
    
    
}
