    public class GumballMachine3  
    {
        State3 soldOutState3;
        State3 noCoinState;
        State3 hasCoinState;
        State3 soldState3;
     
        State3 state3 = soldOutState3;
        int count = 0;
     
        public GumballMachine3(int numberGumballs) {
            soldOutState3 = new SoldOutState3(this);
            noCoinState = new NoCoinState(this);
            hasCoinState = new HasCoinState(this);
            soldState3 = new SoldState3(this);
    
            this.count = numberGumballs;
             if (numberGumballs > 0) {
                state3 = noCoinState;
            } 
        }
     
        public void insertCoin() {
            state3.insertCoin();
        }
     
        public void ejectCoin() {
            state3.ejectCoin();
        }
     
        public void turnCrank() {
            state3.turnCrank();
            state3.dispense();
        }

        public void waitForCoin() {
            state3.waitForCoin();
        }

        public void checkCoin() {
            state3.checkCoin();
        }

        public void returnChange() {
            state3.returnChange();
        }
    
        void setState3(State3 state3) {
            this.state3 = state3;
        }
     
        void releaseBall() {
            System.out.println("A gumball comes rolling out the slot...");
            if (count != 0) {
                count = count - 1;
            }
        }
     
        int getCount() {
            return count;
        }
     
        void refill(int count) {
            this.count = count;
            state3 = noCoinState;
        }
    
        public State3 getState3() {
            return state3;
        }
    
        public State3 getSoldOutState3() {
            return soldOutState3;
        }
    
        public State3 getNoCoinState() {
            return noCoinState;
        }
    
        public State3 getHasCoinState() {
            return hasCoinState;
        }
    
        public State3 getSoldState3() {
            return soldState3;
        }
     
        public String toString() {
            StringBuffer result = new StringBuffer();
            result.append("\nMighty Gumball, Inc.");
            result.append("\nJava-enabled Standing Gumball Model #2004");
            result.append("\nInventory: " + count + " gumball");
            if (count != 1) {
                result.append("s");
            }
            result.append("\n");
            result.append("Machine is " + state3 + "\n");
            return result.toString();
        }
    }

