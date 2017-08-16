Notes:
The implementation of State uses the Strategy Pattern.
Applying the State pattern: 

	- created an Interface State with the methods: 
		handle (int speed)
		setText();
	
	- created the nested clsses for each gear that implements the State interface. 
	- used the Vector to collect all the states into one collection, we thought it is easier that way to manipulate the states.
	- in each concrete state class I override the handle and setText method to provide the logic for setting
		the gear for a particular speed using if/else statements.
		in each concrete class I also returned the next or the previous states;