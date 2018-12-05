package design.pattern.proxy;

public class Proxy implements IService {

  private IService service = new Service();

  @Override
  public String runSomething() {
    return service.runSomething();
  }

}
