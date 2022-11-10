public class App {
    public static void main(String[] args) throws Exception {



        //FOR LOOP
        for (int firstNameCount = 5; firstNameCount != 0; firstNameCount--){
        
        
         if (firstNameCount == 3) {
                System.out.println("Wait! Timeout! I need to go to the bathroom!");
                break;
            }
          System.out.println("joshua");
        }
         
    
               
        //WHILE
        int nickNameCount = 5;

        while (nickNameCount != 0) {
             nickNameCount--;
                if (nickNameCount == 3) {
                System.out.println("Go ahead i will skip this third loop. i will ride on the next loop!");
                continue;
            }    
        System.out.println("pogi");
       
            }
                
        //DO WHILE
        int lastNameCount = 5;

        do {
            System.out.println("Labayne");
            lastNameCount--;
        } while (lastNameCount != 0);
    

        

    }
}
