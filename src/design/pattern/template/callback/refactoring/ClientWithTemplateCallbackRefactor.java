package design.pattern.template.callback.refactoring;

public class ClientWithTemplateCallbackRefactor {
  public static void main(String[] args) {
    Soldier soldier = new Soldier();
    soldier.runContext("탕탕탕");
    soldier.runContext("챙챙챙");
  }
}
