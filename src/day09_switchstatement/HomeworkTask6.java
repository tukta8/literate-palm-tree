package day09_switchstatement;

public class HomeworkTask6 {

	public static void main(String[] args) {
/* 
		valid browsers: chrome, firefox, opera, safari, edge, ie
		 string str = "chrome"
		 outPut:CHROME BROWSER IS SELECTED
		 12:35
	*/	

	String browser = "chrome";
	 if (browser == "chrome" ) {
         System.out.println("CHROME BROWSER IS SELECTED");
     
	 } else if (browser == "firefox") {
         System.out.println("FIREFOX BROWSER IS SELECTED");
     
	 } else if (browser== "opera") {
         System.out.println("OPERA BROWSER IS SELECTED");
     
	 } else if (browser == "safari") {
         System.out.println("SAFARI BROWSER IS SELECTED");
     
	 } else if (browser == "edge") {
         System.out.println(" EDGE BROWSER IS SELECTED");
     
	 } else if (browser == "ie") {
         System.out.println("invalid");
     
     }
	
	 switch (browser) {
     case "CHROME":
         System.out.println("Chrome browser selected");
         break;
     case "FIREFOX":
         System.out.println("FIREFOX BROWSER IS SELECTED");
         break;
     case "OPERA":
         System.out.println("OPERA browser selected");
         break;
     case "EDGE":
         System.out.println("EDGE browser selected");
         break;
     case "IE":
         System.out.println("IE browser selected");
         break;
     	default :
             System.out.println("INVALID BROWSER");
     }
	}

}
