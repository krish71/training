import java.io.IOException;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CopyFile {
	
//	static CopyOption[] ss = replace_existing ;
	public static void main(String[] args) {
		Path source = Paths.get("D:/VSCodeSetup-x64-1.19.3.exe");
		Path destination = Paths.get("D:/a/vsc4.exe");
		try {
			long startTime = System.currentTimeMillis();
			Files.copy(source, destination);
			System.out.println("Time: "+ (System.currentTimeMillis() - startTime));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}