package CommandPattern;

import java.util.ArrayList;

public class CommandQueue implements Command{
	ArrayList<Command> commandQueue;
	
	public CommandQueue() {
		commandQueue = new ArrayList<>(); 
	}
	
	public void addCommand(Command command) {
		commandQueue.add(command);
	}
	
	public void deleteCommand(Command command) {
		commandQueue.remove(command);
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		if (commandQueue != null) {
			for(Command command:commandQueue) {
				command.execute();
			}
		}

	}
}
