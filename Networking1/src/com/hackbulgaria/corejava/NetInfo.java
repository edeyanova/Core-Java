package com.hackbulgaria.corejava;

public class NetInfo {
	public static void main(String[] args) {
        new NetInfo().say();
        }
 
     public void say() {
       try {
       java.net.InetAddress i = java.net.InetAddress.getLocalHost();   
       System.out.println(i.getHostAddress()); 
       }
       catch(Exception e){e.printStackTrace();}
     }


}
