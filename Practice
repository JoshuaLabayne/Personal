public class App {

    static Scanner scan = new Scanner(System.in);

    // Questions
    public static void main(String[] args) throws Exception {
        System.out.println("Exam 2 practice problems");

    System.out.print("Enter the temperature in Celsius:");
    double tempInCelsius = scan.nextDouble();
    double tempInFahrenheit = toFahrenheit(tempInCelsius);
    System.out.println(tempInCelsius + "C is equal to "+ tempInFahrenheit +"F");
    
    System.out.print("Enter the temperature in Fahrenheit:");
    tempInFahrenheit = scan.nextDouble();
    tempInCelsius = toCelsius(tempInFahrenheit);
    System.out.println(tempInFahrenheit +"F is equal to " + tempInCelsius+ "C");
    
    System.out.print("Enter time in seconds: ");
    double seconds = scan.nextDouble();
    double minutes = secondstoMinutes(seconds);
    System.out.println(seconds +" seconds is equal to "+ minutes + " minutes");
   
    System.out.print("Enter time in hours: ");
    double hours = scan.nextDouble();
    minutes = hourstoMinutes(hours);
    System.out.println(hours + " hours is equal to "+ minutes +  " minutes");
   
    System.out.print("Enter storage value in megabyte: ");
    double megabyte = scan.nextDouble();
    double gigabyte = megabytetoGigabyte(megabyte);
    System.out.println(megabyte + " MB is equal to " + gigabyte + "GB" );
    
    System.out.print("Enter your mobile number: ");
    String mobileNumber = scan.next();
    
    if(mobileNumber.length()==11) {
        System.out.println("Valid");
    }else {
    	System.out.println("Invalid");
    }
    
    System.out.print("Enter your bestfriend's name in UPPERCASE: ");
    String upperName = scan.next();
    
    if(upperName==upperName.toUpperCase()){
    	System.out.println("Valid");
    }else {
    	System.out.println("Invalid");
    }
    System.out.print("Enter the capital of the Philippines: ");
    String capital = scan.next();
    
    if(capital.toLowerCase().equals("manila") || capital.toUpperCase().equals("MANILA")){
        System.out.println("Valid");
    }else {
    	System.out.println("Invalid");
    }
        
    System.out.print("Enter one of the five human senses: ");
    String sense = scan.next();
    
    switch(sense) {
       case "sight":
           System.out.println("Valid");
           break;
       case "smell":
    	   System.out.println("Valid");
    	   break;
       case "touch":
    	   System.out.println("Valid");
    	   break;
       case "taste":
    	   System.out.println("Valid");
    	   break;
       case "hearing":
    	   System.out.println("Valid");
           break;
       default:
    	   System.out.println("Invalid");
           break;    
    }
    scan.nextLine();
    System.out.print("Use the word \"love\" in any sentence: ");
    String loves = scan.nextLine();
    
    if (loves.contains("love")) {
    	System.out.println("Valid");
    }else{
    	System.out.println("Invalid");
    }
    scan.close();
    }
    static double toFahrenheit(double temperature) {
    return (temperature* 9/5)+32;
    }
    static double toCelsius(double temperature) { 
    return (temperature- 32)*5/9;
    }
    static double secondstoMinutes(double time) {
    return (time/60);
    }     
    static double hourstoMinutes(double time) {
    return (time*60);	
    }
    static double megabytetoGigabyte(double storage) {
    return  (storage/1000);
    }

}





 

