package chapter9;

public class dataTypes {

	public static void main(String[] args) {
		
		double[] list = {1.12,23.4,87.0,88.1};
		
		for (Double value : list) {
			
			System.out.println(value.intValue() + " | ");
			
		}
		
		readWords("My name is Pratik");
		reverseString("I love football");
		
		
		
		
	}
	
	public static void readWords(String data) {
		String read[] = data.split(" ");
		System.out.println("Total words of santance are : " + read.length);
		for (int i=0;i<read.length;i++) {
			System.out.println(read[i]);
		}
		
	}
	
	public static void reverseString(String text) {
		for(int i=text.length()-1; i>=0;	i--) {
			System.out.print(text.charAt(i));
		}
	}
	
	
}
