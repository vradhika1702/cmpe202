import java.io.*;
import java.awt.*;
import java.util.*;
import java.awt.event.KeyEvent;

//nickel = 5 ; dime = 10 ; quarter = 25
public class GumballMachine3 
{
    private int num_gumballs;
    private int count;
    private int total;
    private boolean has_coin;

    public GumballMachine3(int size) {
        // initialise instance variables
        this.num_gumballs = size;
        this.has_coin = false;
        this.count = 0;
        this.total = 0;
        
    }

   
    public void insertCoin(int coin) {
        int n = (int)(this.total / 50); //Number of gumballs ejected

        if(coin == 1 || coin == 5 || coin == 10 || coin == 25 || coin == 50) {
            this.has_coin = true;
            this.total = this.total + coin; //Total money in the gumball machine entered by each customer

            if (this.total < (n+1)*50) {
                //The machine tells you the remaining amount you can enter in order to get an additional gumball
                System.out.printf("Please Insert %d cent for %d Gumball !%n",(((n+1)*50)-this.total),n+1);
            }

        } else {
            System.out.println("Invalid Input !");
            this.has_coin = false;
        }
    }

    public void turnCrank() throws Exception{
        int numberOfHalfCents = (int)(this.total / 50);
        int change = this.total % 50;
        int input = 0;
        String str = "0";
        if (this.has_coin) {

            for(int i=0;i<numberOfHalfCents;i++)
            {
                System.out.println("Thanks for your coins.  Gumball Ejected!");      

            }
            
            if( change < 50 && change > 0)
            {
                int extra = change;
                
                //returning change if the customer does not want to add more money to get additional gumball

                while(extra < 50)
                {
                    //Waiting for the customer to enter more coins to get an additional gumball
                    System.out.printf("If you want another Gumball, please insert %d cent coins in 10 Seconds \n",(50-(this.total % 50)));

                    BufferedReader inputInt = new BufferedReader(new InputStreamReader(System.in));
                    Robot enterKey = new Robot();
                    TimerTask task = new TimerTask() {
                        public void run() {
                            enterKey.keyPress(KeyEvent.VK_ENTER);
                        }
                    };

                    Timer timer = new Timer();
                    timer.schedule(task, 10 * 1000);
                    str = inputInt.readLine();
                    if(!str.equals(""))
                    {
                        input = Integer.parseInt(str);
                    }
                    
                    timer.cancel();

                    if(input == 1 || input == 5 || input == 10 || input == 25 || input == 50 )
                    {
                        extra = extra + input;
                        this.total = this.total + input;
                    }
                    else if(input == 0)
                    {
                        System.out.println("You did not insert any coin");
                        break;
                        
                    }
                    else
                    {
                        System.out.println("Invalid Input !");
                        break;
            
                    }
                   
                }
                if(extra > 50)
                {
                    System.out.println("Thanks for your coins.  Gumball Ejected!");      

                }

            }

            change = this.total % 50;
            if(change > 0)
            {
                //change returned to the customer
                System.out.println("Your Change returned: " + change);
            }
            this.count = 0;
            this.total = 0;
            this.has_coin = false;
        }

        else {
            System.out.println("Please insert a quarter");
        }
    }

}    


