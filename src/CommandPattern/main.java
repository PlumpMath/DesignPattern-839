package CommandPattern;

//注：命令模式就是把命令请求者和执行者分开，将命令封装成一个类。
public class main {
	public static void main(String[] args) {
		Command command1 = new LightOnCommand(new WindowLight());
		Command command2 = new LightOnCommand(new RoomLight());
		
		//这种模式是命令队列，线程池就是这样做的。
		CommandQueue commandQueue = new CommandQueue();
		commandQueue.addCommand(command1);
		commandQueue.addCommand(command2);
		commandQueue.execute();
	}
}
