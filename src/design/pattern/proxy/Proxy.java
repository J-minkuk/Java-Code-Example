package design.pattern.proxy;

public class Proxy implements IService {
  IService service;

  @Override
  public String runSomething() {
    service = new Service();
    return service.runSomething();
  }
}
