/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 *
 * @author Administrator
 */
public class Class {
    
    public static void main(String[] args){
        //10000
        //(a.get())Time: 1123
        //a.getFirst()Time:1123
        //1000000
        //(a.get())Time: 37440
        //a.getFirst()Time: 12543
        LinkedList a=new LinkedList();
        for(int i=0;i<100000;i++)
            a.add(i);
        Date b=new Date();
        long begin=b.getTime();
//        for(int i=0;i<a.size();i++){
//        System.out.println(a.get(i));
//        }
        while(!a.isEmpty()){
        System.out.println(a.getFirst());
        a.removeFirst();
        
        }
        b=new Date();
        long end=b.getTime();
        System.out.println("Time: "+(end-begin));
        
        
       
//        for(int i=0;i<100;i++){
//             Date b=new Date();
//        System.out.println(b.getTime());
//        }
        
        
        
        
//    ArrayList a=new ArrayList();
//    a.add("aa");
//    a.add(1);
//    for(int i=0;i<a.size();i++)
//        System.out.println(a.get(i));
//    a.remove(1);
//    for(int i=0;i<a.size();i++)
//        System.out.println(a.get(i));
//    a.add(0, 2);
//     for(int i=0;i<a.size();i++)
//        System.out.println(a.get(i));
  }
}
