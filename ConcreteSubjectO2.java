package guanchazhe;

public class ConcreteSubjectO2 extends SubjectO {

	public ConcreteSubjectO2() {
		super();
	}
	@Override
	public void notifyObserves() {
		// TODO Auto-generated method stub
		System.out.println("Ŀ��2�ı���");
		for(Observes obs:observes) {
			obs.response();
		}
	}


}
