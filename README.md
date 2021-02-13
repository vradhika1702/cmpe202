# CMPE 202 Course Repository

#labs/Lab1

![gumball-machine](gumball-machine.png)


#gumball-java-typical

The following approach was taken to solve the Gumball Machine problem.

1. Made 3 separate java classes for all the 3 gumball machines. 
	- First gumball machine accepts the quarter and ejects 1 gumball upon turning the crank.
	- Cost of 1 gumball is 25 cents (1 quarter).

	- Second gumball machine accepts 2 quarters for each gumball machine.
	- Made use of Timer class to wait for the user to enter the second quarter.
	- Once the user enters the quarters, it gives out 1 gumball machine upon turning the crank.
	- Cost of 1 gumball is 50 cents (2 quarter).

	- Third gumball machine accepts pennies, nickels, dimes, quarters or 50 cents in a single input from the user. 
	- Created conditional statements such that it does not accept any invalid input.
	- The machine also displays a choice for the user, whether to enter more money (with the amount) to get an additional gumball or to receive the extra money back as change.
	- The machine waits for few seconds for the user to input coins in the machine.
	- The gumball is ejected out only after the user turns the crank.
	- Cost of 1 gumball is 50 cents (penny, nickel, dime, quarter, 50cents).


#gumball-java-pattern

The following approach was taken to make the state machine for the gumball machine problem.

	- Created 2 interfaces : State and State3
	- The State interface is implemented by NoQuarterState, HasQuarterState, SoldState, SoldOutState which defines methods for inserting quarter, waiting for quarter, checking the coin, turning the crank and dispensing the gumball.
	- the State interface is used by both the classes, GumballMachine and GumballMachine2 since the methods used are same for both of them, except for the price change of the gumball in the second machine.
	- The State3 interface is implemented by NoCoinState, HasCoinState, SoldState3 and SoldOutState3 which defines the methods for inserting coin, waiting for coin, checking the coin, turning the cranks, dispensing the gumball and returning the change.
	- The State3 interface is used by GumballMachine3 class since there are additional functionalities like accepting penny, nickel, dime, quarter, 50cents instead of just quarters and also displaying the message of remaining money required to get the additional gumball. If no money is inserted by the user in a defined few seconds, the machine will return the remaining amount as change.



