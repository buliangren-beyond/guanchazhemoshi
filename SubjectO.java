package guanchazhe;

import java.util.ArrayList;

public abstract class SubjectO {
	protected ArrayList<Observes> observes;
	public SubjectO() {
		observes = new ArrayList<>();
	}
	public void Add(Observes observe) {
		observes.add(observe);
	}
	public void Remove(Observes observe) {
		observes.remove(observe);
	}
	public abstract void notifyObserves();
}
