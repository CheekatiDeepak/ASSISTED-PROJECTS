import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileReader01 {

	public static void main(String[] args) throws IOException {
		
		// TODO Auto-generated method stub
File file = new File("/Users/Dell/OneDrive/Desktop/deepak.txt");
Scanner scan = new Scanner(file);

String fileContent = "THIS IS A NEW FILE MADE BY ME ";
while (scan.hasNextLine()) {
	 fileContent = fileContent.concat(scan.nextLine() + "\n");
 }
 FileWriter writer = new FileWriter("/Users/Dell/OneDrive/Desktop/newfile.txt");
 writer.write(fileContent);
 writer.close();

	}
}
