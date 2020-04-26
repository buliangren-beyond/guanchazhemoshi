package guanchazhe;

public class ConcreteSubjectO1 extends SubjectO {
	public ConcreteSubjectO1() {
		super();
	}
	@Override
	public void notifyObserves() {
		// TODO Auto-generated method stub
		System.out.println("目标1改变了");
		for(Observes obs:observes) {
			obs.response();
		}
	}

}
