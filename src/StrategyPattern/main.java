package StrategyPattern;

public class main {
	public static void main(String[] args) {
		AbstractStrategy strategy;
		strategy = new StrategyOne();
		//strategy = new StrategyTwo();
		strategy.algorithm();
	}
}
