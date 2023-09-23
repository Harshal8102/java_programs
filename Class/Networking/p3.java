import java.awt.*;
import java.net.*;
import java.io.*;
class OpenWebSite{

	public static void main(String[] args)throws IOException,URISyntaxException{

		String url = "www.youtube.com";

		URI obj = new URI(url);

		Desktop desk = Desktop.getDesktop();

		desk.browse(obj);
	}
}
