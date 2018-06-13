package design.pattern.singleton;

public class ClientWithSingleton {
  public static void main(String[] args) {
    Singleton s1 = Singleton.getSingletonObject();
    Singleton s2 = Singleton.getSingletonObject();
    Singleton s3 = Singleton.getSingletonObject();

    System.out.println(s1);
    System.out.println(s2);
    System.out.println(s3);

    s1 = null;
    s2 = null;
    s3 = null;
  }
}
