
import java.io.*;
import java.net.*;
class URLDemo{

	public static void main(String[] args)throws MalformedURLException{

		URL obj = new URL("https://www.core2web.com:80/home.html");

		System.out.println(obj.getProtocol());

		System.out.println(obj.getPort());

		System.out.println(obj.getFile());

		System.out.println(obj.getQuery());
		
		System.out.println(obj.getHost());
	
		System.out.println(obj.getPath());
	
		System.out.println(obj.getUserInfo());

		System.out.println(obj.getAuthority());
	
	}
}
