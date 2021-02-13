

public class Main {

    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(5);

        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);

        GumballMachine2 gumballMachine2 = new GumballMachine2(5);
        System.out.println(gumballMachine2);


        gumballMachine2.insertQuarter( );
        gumballMachine2.turnCrank();

        System.out.println(gumballMachine2);

        gumballMachine2.insertQuarter( );
        // gumballMachine2.turnCrank();
        gumballMachine2.insertQuarter(  );
        gumballMachine2.turnCrank();

        System.out.println(gumballMachine2);


        GumballMachine3 gumballMachine3 = new GumballMachine3(4);

        // System.out.println(gumballMachine3);

        gumballMachine3.insertCoin(  );
        gumballMachine3.insertCoin(  );
        
        gumballMachine3.turnCrank();

        // System.out.println(gumballMachine3);

        gumballMachine3.insertCoin(  );
        // gumballMachine3.turnCrank();
        gumballMachine3.insertCoin(  );
        gumballMachine3.turnCrank();


    }
}
