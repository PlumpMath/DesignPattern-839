package StatePattern;

public class LargeSizeState extends State{

	public LargeSizeState(Screen screen) {
		// TODO Auto-generated constructor stub
		super.screen = screen;
	}
	
	@Override
	public void onClick() {
		// TODO Auto-generated method stub
		System.out.println("This is large size");
		screen.setState(screen.getSmallSizeState());
	}

}
