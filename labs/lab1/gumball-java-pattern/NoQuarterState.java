

public class NoQuarterState implements State {
    GumballMachine gumballMachine; 
    GumballMachine2 gumballMachine2;
 
    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public NoQuarterState(GumballMachine2 gumballMachine2) {
        this.gumballMachine2 = gumballMachine2;
    }

    
 
    public void insertQuarter() {
        System.out.println("You inserted a quarter");
        if(this.gumballMachine != null)
        gumballMachine.setState(gumballMachine.getHasQuarterState());
        else
        gumballMachine2.setState(gumballMachine2.getHasQuarterState());
    }
 
    public void ejectQuarter() {
        System.out.println("You haven't inserted a quarter");
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

