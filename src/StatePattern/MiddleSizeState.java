package StatePattern;

public class MiddleSizeState extends State{
	
	public MiddleSizeState(Screen screen) {
		// TODO Auto-generated constructor stub
		super.screen = screen;
	}
	
	@Override
	public void onClick() {
		// TODO Auto-generated method stub
		System.out.println("This is middle size");
		screen.setState(screen.getLargeSizeState());
	}

}
