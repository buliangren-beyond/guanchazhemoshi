package guanchazhe;

public class ConcreteSubjectO2 extends SubjectO {

	public ConcreteSubjectO2() {
		super();
	}
	@Override
	public void notifyObserves() {
		// TODO Auto-generated method stub
		System.out.println("目标2改变了");
		for(Observes obs:observes) {
			obs.response();
		}
	}


}
