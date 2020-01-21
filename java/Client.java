import java.net.*;
import java.io.*;

public class Client {

	public static void main(String[] args) {

		try (Socket socket = new Socket(args[0], Integer.parseInt(args[1]))) {
			BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);
			
			System.out.println("Sending \"Hello in Java\"");
			writer.println("Hello in Java");

			try {
				String s = reader.readLine();
				System.out.println("Received: \"" + s + "\"");
			}
			catch (IOException e) {
				System.out.println("ERROR: " + e.getLocalizedMessage() + "\n");
			}

		}
		catch (IOException ex) {
			System.out.println(ex);
		}
	
	}

}
