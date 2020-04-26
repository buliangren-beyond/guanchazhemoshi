package guanchazhe;

public class ConcreteObservesA implements Observes {

	@Override
	public void response() {
		// TODO Auto-generated method stub
		System.out.println("观察到目标变化了，A的反应");
	}
}
