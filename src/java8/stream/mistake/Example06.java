package java8.stream.mistake;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * 필터와 함께 파일 시스템 walking 사용
 */
public class Example06 {
  public static void main(String[] args) throws IOException {
    /**
     * 아래 스트림은 숨겨지지 않은 디렉토리를 순회한다. 즉, 닷(.)으로 시작하지 않는 디렉토리
     *
     * 하지만 walk()로 이미 현재 디렉토리의 전체 서브 디렉토리의 스트림이 생성되었다.
     * 논리적으로 모든 서브 Path 를 포함한다. 필터는 정확히 닷(.)으로 시작하는 이름을 필터링 할 것이다.
     * 예) .git 또는 .idea 같은 것은 결과 스트림에서 제외될 것이다.
     * .\.git/refs
     * .\.idea\libraries 와 같은 Path 까지 의도치 않게 제외될 것이다.
     */
    Files.walk(Paths.get("."))
            .filter(p -> !p.toFile().getName().startsWith("."))
            .forEach(System.out::println);
  }
}
