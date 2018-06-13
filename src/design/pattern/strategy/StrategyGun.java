package design.pattern.strategy;

public class StrategyGun implements Strategy {
  @Override
  public void runStrategy() {
    System.out.println("탕탕탕");
  }
}
