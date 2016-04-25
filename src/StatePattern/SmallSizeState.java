package StatePattern;

public class SmallSizeState extends State{

	public SmallSizeState(Screen screen) {
		// TODO Auto-generated constructor stub
		super.screen = screen;
	}

	@Override
	public void onClick() {
		// TODO Auto-generated method stub
		System.out.println("This is small size");
		screen.setState(screen.getMiddleSizeState());
	}

}
