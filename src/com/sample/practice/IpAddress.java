package com.sample.practice;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Enumeration;

public class IpAddress {

	public static void main(String[] args) throws UnknownHostException, SocketException {
		
		//System.out.println(InetAddress.getLocalHost().getHostAddress());
		System.out.println(Inet4Address.getLocalHost().getHostAddress());
		/*Enumeration e = NetworkInterface.getNetworkInterfaces();
		while(e.hasMoreElements())
		{
		    NetworkInterface n = (NetworkInterface) e.nextElement();
		    Enumeration ee = n.getInetAddresses();
		    while (ee.hasMoreElements())
		    {
		        InetAddress i = (InetAddress) ee.nextElement();
		        System.out.println(i.getHostAddress());
		    }
		}*/

	}

}
