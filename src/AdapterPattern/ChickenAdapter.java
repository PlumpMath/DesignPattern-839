package AdapterPattern;

public class ChickenAdapter extends Duck{
	Chicken chicken;
	
	public ChickenAdapter(Chicken chicken) {
		// TODO Auto-generated constructor stub
		this.chicken = chicken;
	}

	@Override
	public void say() {
		// TODO Auto-generated method stub
		chicken.gobble();
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		chicken.fly();
	}
}
