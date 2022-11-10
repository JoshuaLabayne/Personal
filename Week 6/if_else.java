public class App {
    public static void main(String[] args) throws Exception {

        // Conditional Structure
        boolean ihaveNoMoney = false;
        boolean holiday = true;

        if (ihaveNoMoney) {
            System.out.println("Ask your parents to drive you to NU");
        }
        else if (holiday) {
            System.out.println("Spend time with my family");
       
        } else {
            // Step 1
            walkLRT();

            // Step 2
            rideLRT();

            // Step 3
            walk();
        }

    }

    static void walkLRT() {
        System.out.println("Walk from home to LRT station");
        System.out.println("");
    }



    static void rideLRT() {
        System.out.println("Ride at Cubao station");
        System.out.println("Exit at Legarda station");
    }


    static void walk() {
        System.out.println("Walk for 5 mins");
    }
}
