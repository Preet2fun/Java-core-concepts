package chapter13;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExeptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//createNewFile();
		numberExceptionalHandling();
		
		
	}
	
	public static void createNewFile() {
		
		File file = new File("Abc/abc.txt");
		try {
			file.createNewFile();
		} catch (IOException e) {
			System.out.println("Provided path is not avialable");
			e.printStackTrace();
		}
		
	}
	
	public static void numberExceptionalHandling() {
		
		File file = new File("C:/Users/Dhurvi/Desktop/xyz.txt");
		
		try {
			
			Scanner FileReader = new Scanner(file);
			while(FileReader.hasNext()) {
				double num = FileReader.nextDouble();
				System.out.println(num);
			}
			FileReader.close();
		} catch (FileNotFoundException | InputMismatchException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
