package com.karthik.learnings;

public class ThreadTest {
    private static void say(String s){
        System.out.println(s);
    } 
    public static void main(String[] args) {
        Thread d=new Thread(){
          public void run(){
              say("1");say("2");say("3");
          }  
        };
         Thread d2=new Thread(){
          public void run(){
              say("a");say("b");say("c");
          }  
        };
        d.start();
        d2.start();
      }
}
