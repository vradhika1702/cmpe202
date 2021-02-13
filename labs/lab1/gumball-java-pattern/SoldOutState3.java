public class SoldOutState3 implements State3 {

    GumballMachine3 gumballMachine3;
 
    public SoldOutState3(GumballMachine3 gumballMachine3) {
        this.gumballMachine3 = gumballMachine3;
    }
 
    public void insertCoin() {
        System.out.println("You can't insert a coin, the machine is sold out");
    }
 
    public void ejectCoin() {
        System.out.println("You can't eject, you haven't inserted a coin yet");
    }
 
    public void turnCrank() {
        System.out.println("You turned, but there are no gumballs");
    }

    public void waitForCoin() {
        System.out.println("Don't enter a coin since there is no gumball");
    }

    public void checkCoin() {
        System.out.println("No point since there is no gumball to eject");
    }

    public void returnChange() {
        System.out.println("Anything you enter will be returned since there is no gumball to sell");
    }
 
    public void dispense() {
        System.out.println("No gumball dispensed");
    }
 
    public String toString() {
        return "sold out";
    }
}


