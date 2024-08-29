# JAVA_dokhak

### 0822 
- 기초 문법 완료!

### 0823
- 클래스와 객체(1)
  - 생성자는 인스턴스를 초기화할 때 명령어 집합이다
  - 생성자의 이름은 클래스 이름과 같다
  - 생성자는 메서드가 아니고, 상속되지 않고, 리턴값이 없다
  - 생성자를 사용하는 이유는 객체의 속성을 초기화하기 위해서이다(객체 생성시 속성에 원하는 값을 넣어준다는 말)
  - 디폴트 생성자를 사용하게 되면 각 속성에 기본값(int = 0, String = null)이 들어가게 되므로, 초기화가 불가능하다
  - 하나의 파일 안에 public class는 하나만 존재한다(파일명과 같음)
  - 접근 제어자 private은 해당 제어자가 적용된 요소를 클래스 내부에서만 쓰일 수 있게 한다. 보통 private으로 해놓고 public 메서드로 값에 접근하여 수정하는 등 한다.
  - this는 자신의 메모리를 가리키며, 생성자에서 다른 생성자를 호출한다. 또 자기 자신의 주소를 반환한다.
  - 멤버 변수(member variable)란 클래스 내부에 선언된 변수로, 해당 클래스의 객체가 가지는 속성을 나타낸다.

### 0828
- 다시 시작!
- 클래스와 객체(2)
  - 클래스 간 협업
  - 각각의 클래스 내부의 메서드는 다른 클래스에서 불러와서 사용할 수 있다
  - 물론 public class일 때만 가능
  - 메서드가 클래스의 객체를 인자로 받아 오는 방식으로 상호작용을 구현 (public void takeBus(Bus bus))
  - 메서드 호출이 꼬리에 꼬리를 무는 형식,,,? (아직 추상적이다)

### 0829
- 클래스와 객체(3)
  - 여러 개의 인스턴스들이 공유하는 변수를 선언할 때 -> static (정적 변수)
  - 스태틱 변수는 데이터 영역(스태틱 영역)에 생성됨
  - 인스턴스의 생성과 관계 없이 클래스 이름으로 직접 참조하므로, 클래스 변수라고도 함
  - 인스턴스로 참조하면 밑줄 뜬다~~
  - 스태틱 메서드에서는 인스턴스 변수를 쓸 수 없다:
  - 인스턴스 변수의 경우 인스턴스 생성 이후에만 접근 가능한데, 스태틱 메서드는 클래스 자체에 접근할 수 있기 때문!!!


- 클래스와 객체(4)
- singleton 패턴: 전 시스템에 단 하나의 인스턴스만이 존재하도록 구현하는 방식
  - 클래스 구현 시, 유일 인스턴스를 하나 생성하고, private 선언을 하여 외부에서 생성 못하게 함
  - 그 후 클래스 내부에 인스턴스를 반환하는 메서드를 생성, 외부에서 이 메서드를 실행하여 인스턴스를 반환받게 한다!!!
- 배열과 ArrayList
  - 배열을 쓰는 이유: 동일한 자료형의 변수를 한꺼번에, 순차적으로 관리할 수 있어서
  - 메모리 상에서도 순차적으로 공간을 차지한다 (물리적으로도, 논리적으로도 연속되어 있음)
  - 모든 배열은 0부터 시작
  - 배열 선언 시 길이를 정해줘야 함, 한번 정해진 길이는 변경될 수 없음
  - 숫자 뿐만 아니라 문자도 배열을 만들 수 있음
- 객체 배열 사용하기
  - 객체 배열은 객체를 각각 생성해서 배열의 인덱스를 지정해서 직접 넣어줘야 한다
  - 얕은 복사: 배열 요소의 주소만 복사 -> 배열 요소가 변경되면 복사된 배열 요소도 변경됨
  - 참조하는 인스턴스(메모리 주소)가 동일하기 때문에 생기는 현상
  - 깊은 복사: 서로 다른 인스턴스의 메모리를 요소로 가지게 되는 것
  - enhanced for 문: 간단하게 for문을 돌리는 방법
  - python의 for문 문법 (for apple in apples:) 와 비슷하다!!!
  - 대신 읽기 전용으로, 특정 인덱스 값에 접근하려면 일반 for문이나 iterator를 써야 함
- 다차원 배열
  - 평면이나 공간을 구현할 때 많이 사용
  - 행렬과 비슷
  - ArrayList 클래스
  - 여러 메서드와 속성 등을 사용하여 객체 배열을 편리하게 관리할 수 있음
- 상속과 다형성
  - 이미 구현된 클래스를 '상속' 받아서 속성이나 기능이 확장되는 클래스를 구현
  - protected 접근 제어자 -> private으로 선언된 변수를 상속 관계에서만 public으로 바꿔줌
  - 접근 제어자를 따로 설정해주지 않으면 default -> 같은 패키지 내에서는 볼 수 있지만, 다른 패키지로 갈 경우 가시성이 사라짐(오류 발생)
  - public - protected - default - private 순으로 가시성이 높음

### 0830
- 상속과 다형성 (2)
  - 하위 클래스가 생성이 될 때는 항상 상위 클래스가 먼저 생성됨
  - super() -> 부모 클래스의 생성자를 호출할 때, 부모의 메서드나 필드에 접근할 때 사용
  - super()는 디폴트 생성자를 호출한다
  - 디폴트 생성자가 없고 인자를 받는 커스텀 생성자가 있는 경우는 super(인자) 이런 식으로 명시적으로 표시
  - 업캐스팅: 상속 받은 클래스는 상위 클래스의 타입을 내포하고 있음