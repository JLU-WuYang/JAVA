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
public class foreach {
     public static void main(String[] args){
         Set<String> set=new HashSet<String>();
         set.add("a");
         set.add("b");
         for(String s:set){
         
         System.out.println(s);
         }
         int[]a=new int[2];
        Arrays.fill(a, -1);
        for(int i:a){
        System.out.println(i);}
         
     }
     }

