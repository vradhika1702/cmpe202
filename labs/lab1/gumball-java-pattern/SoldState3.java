public class SoldState3 implements State3 {
 
        GumballMachine3 gumballMachine3;
    
        public SoldState3(GumballMachine3 gumballMachine3) {
            this.gumballMachine3 = gumballMachine3;
        }
           
        public void insertCoin() {
            System.out.println("Please wait, we're already giving you a gumball");
        }
     
        public void ejectCoin() {
            System.out.println("Sorry, you already turned the crank");
        }
     
        public void turnCrank() {
            System.out.println("Turning twice doesn't get you another gumball!");
        }
    
        public void waitForCoin() {
            System.out.println("Waiting for you to enter the coin...");
        }
    
        public void checkCoin() {
            System.out.println("You already got a gumball worth your money input!");
        }
    
        public void returnChange() {
            System.out.println("The remaining change will be returned to you after the gumball is dispensed :)");
        }
     
        public void dispense() {
            gumballMachine3.releaseBall();
            if (gumballMachine3.getCount() > 0) {
                gumballMachine3.setState3(gumballMachine3.getNoCoinState());
            } else {
                System.out.println("Oops, out of gumballs!");
                gumballMachine3.setState3(gumballMachine3.getSoldOutState3());
            }
        }
     
        public String toString() {
            return "dispensing a gumball";
        }
    }
