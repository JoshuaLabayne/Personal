import java.util.Scanner;

public class Exam {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
  

        // Long exam 2
        // Total points possible (100 pts)
        // Methods and Conditions

        // Part I
        // 1. Create a method.
        // 2. Call the method.
        // 3. Print result of the method.

        // ==============================================================================
        // 1. Create a method and think of a formula to get the last 6 digits of your
        // student number. (10 pts)
        
        System.out.println("1. Last six digits");
        System.out.print("Enter your ten digit student number: ");
        int studentNumber = scan.nextInt();
        int lastDigit = studentNumber%1000000;
        System.out.println("The last six Digit of the Number is "+lastDigit);
        
         
        // ==============================================================================

        // 2. Create a method that will:
        // print "ODD" if the last two digits of your student number is an odd number
        // print "EVEN" if the last two digits of your student number is an even number.
        // (10 pts)
      
        System.out.println("2. ODD or EVEN numbers");
        System.out.print("Enter the last two digits of your student number: ");
        int lastTwoDigits = scan.nextInt();


        if(lastTwoDigits % 2 == 0)
            System.out.println(lastTwoDigits + " EVEN");
        else
            System.out.println(lastTwoDigits + " ODD");

        // ==============================================================================

        // 3. Create a method that will return the total character length of your
        // firstname and your surname. (10 pts)
        System.out.println("3. Length of your fullname");
        System.out.print("Enter your firstname: ");
        String firstName = scan.next();
        System.out.print("Enter your surname: ");
        String surName = scan.next();
		int len1=firstName.length();
        int len=surName.length();	
        int answer = len + len1;
        System.out.println(answer);
        // ==============================================================================

        // 4. Create a method to that will return true if your firstname in BOTH
        // UPPERCASE and lowercase are EQUAL.
        // Otherwise, return false.
        System.out.println("4. Check your first name in LOWERCASE and UPPERCASE");
        System.out.print("Enter your first name in lowercase: ");
        String firstNameInLowerCase = scan.next();
        System.out.print("Enter your first name in UPPERCASE: ");
        String firstNameInUpperCase = scan.next();
        if(firstNameInLowerCase.equals("joshua") && firstNameInUpperCase.equals("JOSHUA")){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
        // ==============================================================================

        // 5. Create a method that will return true if your name starts with
        // a vowel 'A','E','I','O','U'.
        // Otherwise, return false.
        System.out.println("5. Vowel or Consonant");
        System.out.print("Enter the first character of your first name: ");
        char firstChar = scan.next().charAt(0);
        char ch = firstChar;

   

        switch (ch) {

            case 'a':

            case 'e':

            case 'i':

            case 'o':

            case 'u':

                System.out.println("true");

                break;

            default:

                System.out.println("false");
        // =========================================================================================================================
        }
        // Part II
        // Print "valid" if the result is true.
        // Print "invalid" if the result is false.

        // ==============================================================================
        // 6. Create a condition to check if the entered student number is your student
        // number. (10 pts)
        System.out.println("6. Student number validation");
        System.out.print("Enter your ten digit student number: ");
        studentNumber = scan.nextInt();
        
        if(studentNumber==2022102019) {
           System.out.println("Valid");
        }else {
     	System.out.println("Invalid");
              }

        // ==============================================================================

        // 7. Create a condition to check if your firstname is in UPPERCASE and your
        // lastname is in lowercase. (10 pts)
        System.out.println("7. Case sensitivity check");
        System.out.print("Enter your firstname in UPPERCASE: ");
        firstName = scan.next();
        System.out.print("Enter your surname in lowercase: ");
        surName = scan.next();
        
        if(firstName.equals("JOSHUA") && surName.equals("labayne")){
            System.out.println("Valid");
        }else {
            System.out.println("Invalid");
        }
       

        // ==============================================================================

        // 8. Create a nested condition that will ask the specialization of the student
        // is taking
        // depending if the student is a BSIT or BSCS student.

        // Condition 1
        // if the student is BSIT, ask again if the student is taking MWAA or MAA.

        // Condition 2
        // if the student is BSCS, ask again if the student is taking ML or DF.
      

        System.out.println("Enter your enrolled course (BSIT or BSCS): ");

        String choice =scan.next();



         switch (choice){

                case "BSIT":

                System.out.println("you picked BSIT");  

                System.out.print("Enter your specialization (MWA or MAA): ");

                String Choice = scan.next();

                switch (Choice){

                    case "MWA":

                    System.out.println("you are taking MWA ");

                    break;

   

                    case "MAA":

                     System.out.println("You are taking MAA");

                     break;

                   

                }

                break;
                
                case "BSCS":

                System.out.println("you picked BSCS");  

                System.out.print("Enter your specialization (DF or ML): ");

                String Choices = scan.next();

                switch (Choices){

                   case "DF":

                    System.out.println("you are taking DF ");

                    break;



                case "ML":

                System.out.println("You are taking ML ");

                break;

            }
        }
        // ==============================================================================

        // 9. Create a condition to check if the answer belongs to one of the possible
        // answers. (10 pts)

        // STEM
        // ICT
        // ABM
        // HUMSS
        // HOME ECONOMICS
        // ARTS AND DESIGN
        // TVL MARITIME

    System.out.println("9. Selection");
        System.out.print("Enter your SHS strand: ");
        String strand = scan.next();
        
        switch (strand) {
          case "STEM":        
            System.out.println("VALID");
             break;
          case "ICT" : 
        System.out.println("VALID");
             break;
          case "HUMMS":   
        System.out.println("VALID");
             break;
          case "HOME ECONOMICS":
        System.out.println("VALID");
             break;
             case "ABM":    
        System.out.println("VALID");
             break;
          case "ARTS AND DESIGN":
        System.out.println("VALID");
             break; 
          case "TVL MARITIME":
        System.out.println("VALID");
             break;
          default:
        System.out.println("INVALID");
             break;       
        

        }

        // ==============================================================================

        // 10. Create a condition to check if your student email address contains your
        // surname. (10 pts)
        System.out.println("10. Validate student email address ");
        System.out.print("Enter your student email address: ");
        String studentEmailAddress = scan.next();
        if (studentEmailAddress.contains("labayne")) {
            System.out.println("Valid");
        }else{
            System.out.println("Invalid");
        }

        // ==============================================================================
        // Programming competition/Job interview level question (20 points)

        // 11. Think like an ATM.

        // You have an N amount of pesos in your savings account and you have decided
        // that you want to withdraw all of your money in the ATM.

        // The denomination of peso bills that the ATM could dispense are 20, 50, 100,
        // 200, 500, 1000.

        // Create a method that will return the minimum number of peso bills that the
        // ATM will dispense after withdrawing all of your money.

        // Example:
        // Elizer has 150 pesos in his bank account. If elizer withdraws 150 pesos in
        // the ATM, the ATM will dispense two peso bills (100 peso bill and 50 peso
        // bill). (Answer is 2)

        //System.out.println("11. Think like an ATM");
        //System.out.print("Enter the total amount of money in your bank account: ");
        //int amount = scan.nextInt();

        // Close scanner
        //scan.close();
 
    
    
    
    
    
}
}     


