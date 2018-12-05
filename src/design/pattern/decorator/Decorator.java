package design.pattern.decorator;

public class Decorator implements IService {

  IService service = new Service();

  @Override
  public String runSomething() {
    return "장식" + service.runSomething();
  }

}
