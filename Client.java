package guanchazhe;
//观察者模式
public class Client {
	public static void main(String args[]) {
	SubjectO sbj = new ConcreteSubjectO1();
	Observes obs1 = new ConcreteObservesA();
	Observes obs2 = new ConcreteObservesB();
	sbj.Add(obs1);
	sbj.Add(obs2);
	sbj.notifyObserves();
	}
}
