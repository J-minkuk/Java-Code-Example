package design.pattern.decorator;

public class Service implements IService {
  @Override
  public String runSomething() {
    return "서비스";
  }
}
