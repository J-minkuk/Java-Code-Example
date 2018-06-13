package design.pattern.strategy;

public class ClientWithStrategy {
  public static void main(String[] args) {
    Strategy strategy = null;
    Soldier soldier = new Soldier();

    strategy = new StrategyGun();
    soldier.runContext(strategy);

    strategy = new StrategySword();
    soldier.runContext(strategy);
  }
}
