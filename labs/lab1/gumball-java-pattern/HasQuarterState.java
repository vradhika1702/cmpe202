public class HasQuarterState implements State {
    GumballMachine gumballMachine;
    GumballMachine2 gumballMachine2;
    boolean flag=false;
 
    public HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
        flag=false;
    }

    public HasQuarterState(GumballMachine2 gumballMachine2) {
        this.gumballMachine2 = gumballMachine2;
        flag=true;
    }
    
  
    public void insertQuarter() {
        System.out.println("You can't insert another quarter");
    }
 
    public void ejectQuarter() {
        System.out.println("Quarter returned");
        if (flag)
        gumballMachine2.setState(gumballMachine2.getNoQuarterState());
        else
        gumballMachine.setState(gumballMachine.getNoQuarterState());

    }
 
    public void turnCrank() {
        System.out.println("You turned...");
        if(flag)
        gumballMachine2.setState(gumballMachine2.getSoldState());
        else
        gumballMachine.setState(gumballMachine.getSoldState());

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

