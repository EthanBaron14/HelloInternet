import java.net.*;
import java.io.*;

public class Client {

	public static void main(String[] args) {

		try (Socket socket = new Socket("54.92.184.126", 8080)) {
			InputStream input = socket.getInputStream();
			InputStreamReader reader = new InputStreamReader(input);

			int character;
			StringBuilder data = new StringBuilder();

			while((character = reader.read()) != -1) {
				data.append((char) character);
			}

			System.out.println(data);

		}
		catch (IOException ex) {
			System.out.println(ex);
		}
	
	}

}
