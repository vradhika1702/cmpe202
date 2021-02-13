public class HasCoinState implements State3 {

        GumballMachine3 gumballMachine3;
    
        public HasCoinState(GumballMachine3 gumballMachine3) {
            this.gumballMachine3 = gumballMachine3;
        }
        
      
        public void insertCoin() {
            System.out.println("Insert a coin to make the total 50 cents !");
        }
     
        public void ejectCoin() {
            System.out.println("Coin returned");
            gumballMachine3.setState3(gumballMachine3.getNoCoinState());
        }
     
        public void turnCrank() {
            System.out.println("You turned...");
            gumballMachine3.setState3(gumballMachine3.getSoldState3());
        }
    
        public void waitForCoin() {
            System.out.println("Please enter a coin, we are waiting...");
        }
    
        public void checkCoin() {
            System.out.println("We are checking whether the coin you entered is valid !");
        }
    
        public void returnChange() {
            System.out.println("If you entered excess money, the change will be returned along with the gumball");
        }
    
        public void dispense() {
            System.out.println("No gumball dispensed");
        }
     
        public String toString() {
            return "waiting for turn of crank";
        }
    }
