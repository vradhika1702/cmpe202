import java.io.*;
import java.awt.*;
import java.util.*;
import java.awt.event.KeyEvent;

public class GumballMachine2 {
    private int num_gumballs;
    private int count;
    private boolean has_quarter;

    public GumballMachine2(int size) {
        // initialise instance variables
        this.num_gumballs = size;
        this.has_quarter = false;
        this.count = 0;
    }

    public void insertQuarter(int coin) {
        //Will intimate to enter the next quarter to eject a gumball if the customer entered only one quarter
        if (coin == 25) {
            this.has_quarter = true;
            this.count++;
            if (this.count == 1) {
                System.out.println("Insert one more quarter !");
            }
        } else {
            this.has_quarter = false;
        }
    }

    public void turnCrank() throws Exception {
        if (this.has_quarter) {
            if (this.count == 1) {
                //Waits for 5 seconds for the customer to enter the second quarter 
                System.out.println("Waiting for another quarter for 5 Seconds !");

                BufferedReader inputInt = new BufferedReader(new InputStreamReader(System.in));
                Robot enterKey = new Robot();
                TimerTask task = new TimerTask() {
                    public void run() {
                        enterKey.keyPress(KeyEvent.VK_ENTER);
                    }
                };

                Timer timer = new Timer();
                timer.schedule(task, 5 * 1000);
                String input = inputInt.readLine();
                // System.out.println(input.getClass().getName());
                timer.cancel();

                // checking if the customer has entered a quarter or any other coin
                if(input.equals("25") )
                {
                    this.count++;
                }
                else if(input.equals(""))
                {
                    System.out.println("You did not insert any coin");
                }
                else
                {
                    System.out.println("Not valid coin. Sorry can't return your coin !");
                    this.count = 0;
                }
            }

            if (this.count == 2) {

                //Ejects a gumball when the customer enters 2 quarters back to back
                if (this.num_gumballs > 0) {
                    this.num_gumballs--;
                    this.has_quarter = false;
                    this.count = 0;
                    System.out.println("Thanks for your quarter.  Gumball Ejected!");
                } else {
                    System.out.println("No More Gumballs!  Sorry, can't return your quarter.");
                }
            }
        }

        else {
            System.out.println("Please insert a quarter");
        }
    }

}