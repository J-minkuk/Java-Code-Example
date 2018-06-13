package design.pattern.decorator;

public class Decorator implements IService {
  IService service;

  @Override
  public String runSomething() {
    service = new Service();
    return "장식" + service.runSomething();
  }
}
