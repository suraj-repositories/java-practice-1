package Start_Advance;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class Ad_13_Networking {

	public static void main(String[] args) throws UnknownHostException {

	String url = "www.youtube.com";	
	InetAddress inetAddress = Inet4Address.getByName(url);
	
	System.out.println("Address : " + Arrays.toString(inetAddress.getAddress()));

	System.out.println("Host Address : " + inetAddress.getHostAddress());
	
	System.out.println("isAnyLocalAddress : " + inetAddress.isAnyLocalAddress());
	
	System.out.println("isMulticastAddress : " + inetAddress.isMulticastAddress());
	
	System.out.println("isLinkLocalAddress : " + inetAddress.isLinkLocalAddress());
	
	System.out.println("isLoopbackAddress : " + inetAddress.isLoopbackAddress());
	
	System.out.println("isSiteLocalAddress : " + inetAddress.isSiteLocalAddress());
	
	System.out.println("hashCode : " + inetAddress.hashCode());
	
	
	}

}
