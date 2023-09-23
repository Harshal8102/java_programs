import java.net.*;
import java.io.*;
import java.util.*;
class URLConnDemo{

	public static void main(String[] args)throws IOException{

		URL obj = new URL("https://google.com");

		URLConnection conn = obj.openConnection();

		System.out.println("last modified : " + new Date(conn.getLastModified()));
	}
}
