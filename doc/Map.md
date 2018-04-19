# Map

## Map<K, V> Interface Method
* Set<Map, Entry<K, V> entrySet()
    * 등록된 데이터 항목들의 목록을 Set 컬렉션 타입으로 리턴한다.
    * Key의 타입은 K, Value의 타입은 V
    * 데이터 항목 1개의 타입은 Map.Entry<K, V>
    * 리턴되는 데이터 항목의 타입은 Set<Map.Entry<K, V>> 이다.

* Set keySet()
    * 등록된 Key 목록을 Set 타입으로 리턴

## Objects Class
* equals 메소드와 hashCode 메소드를 재정의할 때 편리하게 사용할 수 있는 메소드가 포함되어 있다.
* 예) Objects.hash(name, age);
* 예) Objects.equals(this.name, p.name);