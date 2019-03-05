package ApachePOI;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.testng.annotations.Test;

public class GettingDataLib {
public static void main(String[] args) throws UnknownHostException 
{
	InetAddress myHost = InetAddress.getLocalHost();
    System.out.println(myHost.getHostName().toLowerCase());
}
	 
	  
  }

