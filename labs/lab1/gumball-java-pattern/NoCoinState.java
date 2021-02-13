public class NoCoinState implements State3 {
    
    GumballMachine3 gumballMachine3;
 
    public NoCoinState(GumballMachine3 gumballMachine3) {
        this.gumballMachine3 = gumballMachine3;
    }
 
    public void insertCoin() {
        System.out.println("You haven't inserted a coin");
        gumballMachine3.setState3(gumballMachine3.getHasCoinState());
    }
 
    public void ejectCoin() {
        System.out.println("You haven't inserted a valid coin");
    }
 
    public void turnCrank() {
        System.out.println("You turned, but there's no quarter");
    }

    public void waitForCoin() {
        System.out.println("Wait for the user to enter the coin");
    }

    public void checkCoin() {
        System.out.println("Check whether the entered coin is valid");
    }

    public void returnChange() {
        System.out.println("Excess money is returned as change");
    }
 
    public void dispense() {
        System.out.println("You need to pay first");
    } 
 
    public String toString() {
        return "waiting for quarter";
    }
}



