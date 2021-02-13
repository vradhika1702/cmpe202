public class SoldState implements State {
 
    GumballMachine gumballMachine;
    GumballMachine2 gumballMachine2;
    boolean flag = false;
 
    public SoldState(GumballMachine gumballMachine) {
        flag = false;
        this.gumballMachine = gumballMachine;
    }

    public SoldState(GumballMachine2 gumballMachine2) {
        flag=true;
        this.gumballMachine2 = gumballMachine2;
    }

       
    public void insertQuarter() {
        System.out.println("Please wait, we're already giving you a gumball");
    }
 
    public void ejectQuarter() {
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
        if (flag){
        gumballMachine2.releaseBall();
        if (gumballMachine2.getCount() > 0) {
            gumballMachine2.setState(gumballMachine2.getNoQuarterState());
        } else {
            System.out.println("Oops, out of gumballs!");
            gumballMachine2.setState(gumballMachine2.getSoldOutState());
        }
         }
         else{gumballMachine.releaseBall();
            if (gumballMachine.getCount() > 0) {
                gumballMachine.setState(gumballMachine.getNoQuarterState());
            } else {
                System.out.println("Oops, out of gumballs!");
                gumballMachine.setState(gumballMachine.getSoldOutState());
            }}
    }
 
    public String toString() {
        return "dispensing a gumball";
    }
}


