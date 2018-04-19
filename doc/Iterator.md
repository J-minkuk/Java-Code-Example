# Iterator
Iterator 객체는 Collection 객체를 탐색하기 위한 객체이다. 즉, Iterator Interface에는 Collection 객체를 탐색하기 위한 메소드가 포함되어 있다.

## Iterator Interface Method
* Iterator iterator()
    * 현재 Collection 객체를 탐색하기 위한 Iterator 객체가 생성되어 리턴된다.
    * 리턴된 Iterator 객체의 현재 위치는 아무것도 가리키고 있지 않는 상태다.
    * Iterator 객체를 생성한 후 next() 메소드를 호출하여 목록에서 첫 데이터 항목을 가리키게 한다.