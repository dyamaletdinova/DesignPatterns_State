import java.util.Vector;

/**
 * 
 */

/**
 *
 * @author Diana Yamaletdinova Jan 26, 2017
 */
public class CarContext {

	private int state;
	private Vector<State> stateVector = new Vector<>();

	public CarContext() {
		stateVector.addElement(new ParkState());
		stateVector.addElement(new Gear1());
		stateVector.addElement(new Gear2());
		stateVector.addElement(new Gear3());
		stateVector.addElement(new Gear4());
		stateVector.addElement(new Gear5());

		this.state = 0;
	}

	public String changeSpeed(int speed) {
		this.state = this.stateVector.elementAt(this.state).handle(speed);
		return this.stateVector.elementAt(this.state).getText();
	}

	class ParkState implements State {
		public int handle(int speed) {
			if (speed <= 0) {
				return 0;
			} else
				return stateVector.elementAt(1).handle(speed);
		}

		public String getText() {
			return "Park";
		}
	}

	class Gear1 implements State {
		public int handle(int speed) {
			if (speed <= 10 && speed > 0) {
				return 1;
			} else if (speed <= 0) {
				return stateVector.elementAt(0).handle(speed);
			} else
				return stateVector.elementAt(2).handle(speed);
		}

		public String getText() {
			return "Gear 1";
		}
	}

	class Gear2 implements State {
		public int handle(int speed) {
			if (speed <= 20 && speed > 10) {
				return 2;
			} else if (speed <= 10) {
				return stateVector.elementAt(1).handle(speed);
			} else
				return stateVector.elementAt(3).handle(speed);
		}

		public String getText() {
			return "Gear 2";
		}
	}

	class Gear3 implements State {
		public int handle(int speed) {
			if (speed <= 40 && speed > 20) {
				return 3;
			} else if (speed <= 20) {
				return stateVector.elementAt(2).handle(speed);
			} else
				return stateVector.elementAt(4).handle(speed);
		}

		public String getText() {
			return "Gear 3";
		}
	}

	class Gear4 implements State {
		public int handle(int speed) {
			if (speed <= 60 && speed > 40) {
				return 4;
			} else if (speed <= 40) {
				return stateVector.elementAt(3).handle(speed);
			} else
				return stateVector.elementAt(5).handle(speed);
		}

		public String getText() {
			return "Gear 4";
		}
	}

	class Gear5 implements State {
		public int handle(int speed) {
			if (speed > 60) {
				return 5;
			} else
				return stateVector.elementAt(4).handle(speed);
		}

		public String getText() {
			return "Gear 5";
		}
	}
}
