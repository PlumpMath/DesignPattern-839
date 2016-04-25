package StatePattern;

//注意：Sreen相当于是context类，里面维持一个所有状态的实例，然后在各种state里面设置Screen的state.
public class Screen {
	State state;
	SmallSizeState smallSizeState;
	MiddleSizeState middleSizeState;
	LargeSizeState largeSizeState;
	
	public Screen() {
		smallSizeState = new SmallSizeState(this);
		middleSizeState = new MiddleSizeState(this);
		largeSizeState = new LargeSizeState(this);
		state = smallSizeState;
	}
	
	public void setState(State state) {
		this.state = state;
	}
	
	public void onClick() {
		state.onClick();
	}

	public SmallSizeState getSmallSizeState() {
		return smallSizeState;
	}

	public MiddleSizeState getMiddleSizeState() {
		return middleSizeState;
	}

	public LargeSizeState getLargeSizeState() {
		return largeSizeState;
	}

}
