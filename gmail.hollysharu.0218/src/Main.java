
public class Main {

	public static void main(String[] args) {
		Sample obj=new Sample();
		//obj 출력- 클래스 이름과 해시코드가 출력
		System.out.println(obj);
		
		//Static변수- 1개만 만들어서 공유하기 위한 변수
		//클래스 이름, 인스턴스로 접근이 가능 
		obj.name="하루";
		obj.schoolName="고양이";
		
		Sample ins=new Sample();
		ins.name="호두";
		ins.schoolName="강아지";
		
		System.out.println(obj.name);
		System.out.println(ins.name);
		
		System.out.println(obj.schoolName);
		System.out.println(ins.schoolName);
		System.out.println(Sample.schoolName);
		
		final int TEN=10;
		//TEM=20;
		//final이 붙으면수정을 할 수 없음
		//final이 붙은 변수의 이름은 전부 대문자로 해서 구분함
				
		
		
	}
}
