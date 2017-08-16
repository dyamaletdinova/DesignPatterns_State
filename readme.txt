Notes:
The implementation of State uses the Strategy Pattern in simple application. 
The application presents a car, which has a set of gears that it uses to drive at various speeds. 
Each gear can only support a specific speed range, and outside of that a gear change is needed. 
The control is via a simple GUI.

Changes in the slider create an event which arrives at the ActionListener of the GUI. 
The actual logic for each state is very simple, basically the series of nested if statements 
represents the various states. 

The basic idea of course is to replace the single complex if statement with polymorphism 
over the set of concrete states. You also need to consider the context object, which manages the states.

Applying the State pattern: 

	- created an Interface State with the methods: 
		handle (int speed)
		setText();
	
	- created the nested clsses for each gear that implements the State interface. 
	- used the Vector to collect all the states into one collection, we thought it is easier that way to manipulate the states.
	- in each concrete state class I override the handle and setText method to provide the logic for setting
		the gear for a particular speed using if/else statements.
		in each concrete class I also returned the next or the previous states;