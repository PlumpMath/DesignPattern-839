package ObserverPattern;

public interface Observer {
	//这里把subject传进去，可以实现订阅多个主题的情况。
	public void update(Subject subject);
}
