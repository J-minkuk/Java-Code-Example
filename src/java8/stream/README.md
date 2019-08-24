# Stream 활용
* 스트림이란 데이터 처리 연산을 지원하도록 소스에서 추출된 연속된 요소
* 중간연산
* 최종연산

---

## 필터링과 슬라이싱
### filter
* .filter(Language::isJava)
* .filter(i -> i % 2 == 0)

### distinct (고유 요소 필터링)
* .distinct()

### limit (스트림 축소)
* .limit(10)

### skip (건너뛰기)
* .skip(5)

---

## 맵핑
### map (스트림 각 요소에 함수 적용)
* .map(Person::getAge)
* .map(String::length)
* .map(x -> x * 2)

### flatMap (스트림 평면화)
* 스트림의 각 요소를 다른 스트림으로 만든 후, 모든 스트림을 하나의 스트림으로 연결
* .flatMap(Arrays::stream)

---

## 검색과 매칭
### anyMatch (적어도 하나와 일치하는지 체크) - 최종연산
* .anyMatch(Language::isJava)

### allMatch (모든 요소와 일치하는지 체크) - 최종연산
* .allMatch(p -> p.getAge() < 30)

### noneMatch (일치 요소가 없는지 체크) - 최종연산
* .noneMatch(p -> p.getAge() < 30)

### 쇼트 서킷 (자바의 &&, || 같은 연산)
* 하나라도 거짓이면 나머지 표현식은 체크하지 않고 결과를 반환하는 상황을 뜻하는 말
* ```anyMatch, allMatch, noneMatch, limit``` 등은 쇼트 서킷

### findAny (임의의 요소를 반환, 랜덤) - 최종연산
* .findAny()
* 아무 요소도 반환하지 않을 수 있으므로, null 대신 ```Optional<T>```을 반환

### findFirst (첫번째 요소 찾기)
* Optional<T> 반환
* .findFirst()

### Optional
* null 대신 사용

메소드 | 설명
-----|------
isPresent() | 값이 있는지 체크
ifPresent(Consumer<T> block) | 값이 있으면 주어진 블록 실행
T get() | 값이 있으면 반환, 없으면 ```NoSuchElementException```발생
T orElse(T other) | 값이 있으면 반환, 없으면 기본값 반환

---

## 리듀싱
* 모든 스트림 요소를 처리하여 값 도출

### 합 구하기
```java
int sum1 = numbers.stream().reduce(0, (a, b) -> a + b);

// 초기값이 없는 경우
Optional<Integer> sum2 = numbers.stream().reduce((a, b) -> a + b);
```

### 최대값 구하기
```java
Optional<Integer> max = numbers.stream().reduce(Integer::max);
```

---

## 숫자 스트림 (TODO)

---

## Stream API 를 사용할 때 발생 가능한 실수
* [재사용 스트림 문제](mistake/ReUseStream01.java)
* ["무한" 스트림 생성 문제](mistake/UnlimitedStream01.java)
* [의도치 않게 생성된 무한 스트림](mistake/UnlimitedStream02.java)
* [의도치 않게 생성된 무한 병렬 스트림](mistake/UnlimitedParallelStream01.java)
* [연산자 숫서 섞기](mistake/OperationOrder01.java)
* [필터와 함께 파일 시스템 walking 사용](mistake/Example06.java)



