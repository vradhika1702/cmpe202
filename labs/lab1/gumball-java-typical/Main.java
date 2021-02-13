
public class Main {

	public static void main(String[] args) throws Exception {

        
		GumballMachine gumballMachine = new GumballMachine(5);

		System.out.println(gumballMachine);

		gumballMachine.insertQuarter( 25 );
		gumballMachine.turnCrank();

		System.out.println(gumballMachine);

		gumballMachine.insertQuarter( 25 );
		gumballMachine.turnCrank();
		gumballMachine.insertQuarter( 25 );
		gumballMachine.turnCrank();

		System.out.println(gumballMachine);


        GumballMachine2 gumballMachine2 = new GumballMachine2(1);

		System.out.println(gumballMachine2);

		gumballMachine2.insertQuarter( 25 );
		gumballMachine2.turnCrank();

		System.out.println(gumballMachine2);

		gumballMachine2.insertQuarter( 25 );
		// gumballMachine2.turnCrank();
		gumballMachine2.insertQuarter( 25 );
		gumballMachine2.turnCrank();

		System.out.println(gumballMachine2);


        GumballMachine3 gumballMachine3 = new GumballMachine3(1);

		// System.out.println(gumballMachine3);

		gumballMachine3.insertCoin( 50 );
        gumballMachine3.insertCoin( 25 );
        
		gumballMachine3.turnCrank();

		// System.out.println(gumballMachine3);

		gumballMachine3.insertCoin( 25 );
		// gumballMachine3.turnCrank();
		gumballMachine3.insertCoin( 25 );
		gumballMachine3.turnCrank();

		// System.out.println(gumballMachine3);





	}
}