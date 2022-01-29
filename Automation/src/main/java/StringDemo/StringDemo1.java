package StringDemo;

public class StringDemo1 {
	
	public static void main(String[] args) {
		
		String str = "Selenium WebDriver";
		
		boolean status = str.startsWith("Selenium");
		
		System.out.println("Status is " + status);
		
		String str1 = "ratnesh pandey Selenium webDriver  ";
		
		boolean status1 =  str1.endsWith("Driver1");
		
		System.out.println("Status1 is " + status1);
		
boolean status2 =  str1.equals(str1);
		
		System.out.println("Status2 is " + status2);
		
boolean status3 =  str1.equalsIgnoreCase(str1);
		
		System.out.println("Status3 is " + status3);
	
	}

}
