package design.pattern.template.callback;

public class ClientWithTemplateCallback {
  public static void main(String[] args) {
    Soldier soldier = new Soldier();

    soldier.runContext(new Strategy() {
      @Override
      public void runStrategy() {
        System.out.println("탕탕탕");
      }
    });

    soldier.runContext(new Strategy() {
      @Override
      public void runStrategy() {
        System.out.println("챙챙챙");
      }
    });
  }
}
