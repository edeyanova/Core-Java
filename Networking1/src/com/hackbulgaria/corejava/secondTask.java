package com.hackbulgaria.corejava;
import java.io.IOException;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;


public class secondTask {
	
	public void getAllHosts() throws IOException {
		//Inet4Address.getByName("192.168.1").isReachable(50);
		for (int i=1; i<255; i++) {
			InetAddress address = Inet4Address.getByName("192.168.1" + i);
			if (address.isReachable(50) && address instanceof Inet4Address) {
				System.out.println(address);
			}
		}
}
}
