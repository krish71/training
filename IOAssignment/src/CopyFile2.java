import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CopyFile2 {
	

	private static void copyFileUsingChannel(File source, File dest) throws IOException {
	    FileChannel sourceChannel = null;
	    FileChannel destChannel = null;
	    try {
	        sourceChannel = new FileInputStream(source).getChannel();
	        destChannel = new FileOutputStream(dest).getChannel();
	        destChannel.transferFrom(sourceChannel, 0, sourceChannel.size());
	       }finally{
	           sourceChannel.close();
	           destChannel.close();
	       }
	}
	public static void main(String[] args) {
		File source = new File("D:/VSCodeSetup-x64-1.19.3.exe");
		File destination = new File("D:/a/vsc7.exe");
		
		try {
			long startTime = System.currentTimeMillis();
			copyFileUsingChannel( source,destination);
			System.out.println("Time: "+ (System.currentTimeMillis() - startTime));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
