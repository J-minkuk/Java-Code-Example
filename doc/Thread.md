# Thread Pool
* Process: 운영체제에서 하나의 애플리케이션
* Thread: Process 에서 하나의 작업

여러 Thread 를 동시에 만들어 실행(병렬처리)할 수 있다.<br>
Java 의 경우 ```Thread, Runnable```를 이용해야 한다.

## 동시성(Concurrency)와 병렬성(Parallelism)
동시성은 싱글 코어에서 멀티 스레드를 동작시키기 위한 방식으로, 멀티 태스킹을 위해 여러 개의 스레드가 번갈아가면서 실행되는 성질을 말한다.
 동시성을 이용한 싱글 코어의 멀티 태스킹은 각 스레드들이 병렬적으로 실행되는 것처럼 보이지만 사실은 번갈아가면서 조금씩 실행되고 있는 것이다.<br>

병렬성은 멀티 코어에서 멀티 스레드를 동작시키는 방식으로, 1 개 이상의 스레드를 포함하는 각 코어들이 동시에 실행되는 성질을 말한다.
 병렬성은 병렬성(Data Parallelism)과 작업 병렬성(Task Parallelism)으로 구분된다.
 
### 데이터 병렬성
* 전체 데이터를 쪼개 서브 데이터들로 만든 뒤, 서브 데이터들을 병렬 처리하여 작업을 빠르게 수행하는 것을 말한다.
* Java 8에서 지원하는 병렬 스트림이 데이터 병렬성을 구현한 것이다.
* 서브 데이터는 멀티 코어의 수만큼 쪼개어 각각의 데이터들을 분리된 스레드에서 병렬 처리한다.

### 작업 병렬성
* 서로 다른 작업을 병렬 처리하는 것을 말한다.
* 대표적인 예는 웹 서버가 있다. 각각의 브라우저에서 요청한 내용을 개별 스레드에서 병렬로 처리한다.

---

## Thread Pool ? 
* 그렇다고 해서 Thread 를 계속 늘려가는 것은 좋은게 아니다.
* 하드웨어의 제한적인 사항(CPU, Memory 등)이 있기 때문에 관리할 필요가 있다.
* 그래서 Thread Pool 이라는 개념을 이용한다.

Thread Pool 은 작업 처리에 사용되는 스레드를 제한된 개수만큼 정해 놓고,
 작업 큐(Queue)에 들어오는 작업들을 하나씩 스레드가 맡아 처리하는 것을 말한다.<br>
 Java 의 경우, 기본적으로 ```Executors, ExecutorService```를 이용하여 Thread Pool 을 만들 수 있다.
 
### Single Thread Pool
```java
ExecutorService executorService = Executors.newSingleThreadExecutor(); 
```
[SingleThreadApplication](../src/com/study/threadpool/SingleThreadApplication.java)
* 단일 Worker Thread
* 실패 시, 새로운 Thread 를 생성하지 않음

### Fixed Thread Pool
```java
ExecutorService executorService = Executors.newFixedThreadPool(int nThreads);
```
[FixedThreadApplication](../src/com/study/threadpool/FixedThreadApplication.java)
* 고정된 Worker Thread 를 사용하며, 모든 Thread 를 사용 중이라면 Queue 에 쌓여 대기
* 실패 시, 새로운 Thread 를 생성하여 대체

### Cached Thread Pool
```java
ExecutorService executorService = Executors.newCachedThreadPool();
```
[CachedThreadApplication](../src/com/study/threadpool/CachedThreadApplication.java)
* 필요에 따라 새로운 Thread 를 생성하며, 이전에 생성된 Thread 가 존재하면 재사용
* 기본적으로 60초 정도 Thread 가 유지
* 비동기 작업에 사용하는데 합리적

### Scheduler Thread Pool
```java
ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(int corePoolSize);
```
[ScheduledThreadApplication](../src/com/study/threadpool/ScheduledThreadApplication.java)
* 지정된 delay 후에 실행하거나, 주기적으로 실행하도록 명령을 예약

### Work Stealing Thread Pool
```java
ExecutorService executorService = Executors.newWorkStealingPool(int parallelism);
```
[WorkStealingThreadApplication](../src/com/study/threadpool/WorkStealingThreadApplication.java)
* Java 8에서 새로 생긴 Thread Pool
* 지정된 parallelism 을 지원할만큼 충분한 Thread 를 유지하고 여러 Queue 를 사용하여 경합을 줄임
* Thread 를 동적으로 늘리고 줄임
* 작업이 실행되는 순서를 보장하지 않음