package AdapterPattern;

//注意封装的时候是针对接口封装，有两个接口，一个是Duck，一个是Chicken，Duck是目标接口，Chicken是被封的接口，所以写一个ChickenAdapter.
public class main {
	public static void main(String[] args) {
		Duck duck = DuckFactory.getInstance();
		duck.fly();
		duck.say();
	}
}
