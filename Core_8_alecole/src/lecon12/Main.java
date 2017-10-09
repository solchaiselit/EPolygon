package lecon12;

import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

//		File file = new File("E:\\Learning_JP\\OOP\\Core_8_alecole\\test.txt");
		
		File file = new File("test-2");
		
		file.createNewFile();
//		
//		System.out.println(file.getAbsolutePath());
		
//		file.mkdirs();
//		
//		FileOutputStream fileOutputStream = new FileOutputStream(file, true);
//		
//		for(int i = 0; i<1000; i++){
//			
//			fileOutputStream.write(i);
//			
//		}
		
//		fileOutputStream.write("some text\n".getBytes()); //converts String into Bytes
//		
//		fileOutputStream.close();
		
		
//		FileInputStream fileInputStream = new FileInputStream(file);
//		
		
//		System.out.println(fileInputStream.read());
		
//		int tmp;
//		while((tmp = fileInputStream.read()) != -1){
//			System.out.print(Character.toChars(tmp));
//		}
		
		
//		File fileFrom = new File("from.txt");
//		
//		fileFrom.createNewFile();
//		
//		File fileTo = new File("to.txt");
//		
//		fileTo.createNewFile();
//		
//		FileOutputStream fileOutputStream = new FileOutputStream(fileTo, false);
//		
//		FileInputStream fileInputStream = new FileInputStream(fileFrom);
//		
//		int tmp;
//		
//		while((tmp = fileInputStream.read()) != -1){
////			System.out.print(Character.toChars(tmp));
//			
//			fileOutputStream.write((tmp));
//		}
//		
//		fileOutputStream.close();
//		fileInputStream.close();
		
		FileWriter fileWriter = new FileWriter(file);
		
		fileWriter.write("KVA");
//		
		fileWriter.flush();
		fileWriter.close();
		
//		FileReader fileReader = new FileReader(file);
//		
//		BufferedReader bufferedReader = new BufferedReader(fileReader);
//		
//		String tmp;
//		while(tmp = bufferedReader.readLine()!==null){
//		
//		System.out.println(tmp); }
		
		
//		String url = "http://www.berry.edu/uploadedImages/Website/Business_Finance/Sustainability/Eagles/_Assets/Images/Gallery/Eagle_gallery5.jpg";
//		
//		String fileName = "picture.png";
//		
//		BufferedImage img = ImageIO.read(new URL(url));
//		
//		File pic = new File(fileName);
//		
//		pic.createNewFile();
//		
//		ImageIO.write(img, "png", pic);
		
		}
	}


