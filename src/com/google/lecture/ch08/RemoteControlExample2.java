package com.google.lecture.ch08;

public class RemoteControlExample2 {

	public static void main(String[] args) {
		
		
//		익명구현객체(Anonymouse class)란 말 그래도 이름이 없는 객체이다.
//		일반적으로 인터페이스를 사용하기 위해서는 해당 인터페이스를 구현한 클래스를 만들어야 한다. 
//		예를 들어 하나의 인터페이스를 구현하는 클래스 3개를 만든다면, 3개의 java파일을 미리 만들어야 한다. 
//		하지만 만약 재사용이 불필요한 구현클래스가 필요할땐 어떻게 해야 할까? 한번만 사용할 소스코드를 XXX.java 라는 파일로 만들고 그 것을 파일로 관리 해야만 할까? 
//		프로그래밍에서 관리의 대상이 많아지는 것은 그 만큼 유지보수의 비용이 증가한다는 의미이다.
		
//		이렇게 일회성이며, 재사용할 필요 없고 파일단위의 관리 대상이 아닌 객체를 만들때 이 익명구현객체라는 것을 활용 할 수 있다. 문법 형태는 다음과 같다.
		
//		인터페이스명 변수 = new 인터페이스명(){
//			  //인터페이스에 선언된 추상메소드의 구현 메소드
//			  //해당 인터페이스에 선언된 모든 추상메소드를 구현해야 한다. 없을시 컴파일 에러 발생 
//			  //추가적으로 필드와 메소드를 선언 할 수 있지만, 익명객체 안에서만 사용할수있다. 
//			  //익명구현객체도 컴파일시 클래스파일이 만들어 지긴한다. 인터페이스명$1(순번) 
//			};  //익명 클래스의 선언은 하나의 실행문이므로 끝에 세미콜론(;)이 무조건 붙는다.
		
		RemoteControl rc = new RemoteControl() {
			
			@Override
			public void turnOn() {
				System.out.println("asdfasd");
			}

			@Override
			public void turnOff() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void setVolume(int volume) {
				// TODO Auto-generated method stub
				
			}
			
			
			
		};
		
		rc.turnOn();
	}
}
