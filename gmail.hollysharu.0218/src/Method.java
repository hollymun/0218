
public class Method {
	//Hello World를 3번 출력하는 메소드 
	void disp() {
	for(int i=0; i<3; i=i+1) {
		System.out.printf("Hello World\n");
		}
	}
	
	//정수 매개변수를 1개 갖는 메소드 
	public void argDisp(int cnt) {
		for(int i=0; i<cnt; i=i+1) {
			System.out.printf("Hello Argument Method\n");
		}
	}
	
	//정수 1개와 문자열을 1개를 가지고 
	//문자열을 정수만큼 출력하는 메소드 
	//위의 메소드와 이름은 같지만 매개변수의 개수가 다름 
	//이런 경우를 Method Overloading이라고 함 
	public void twoDisp(String msg,int cnt) {
		for(int i=0; i<cnt; i=i+1) {
			System.out.printf("%s\n", msg);
		}
	}
	
	//매개변수 개수에 상관없이 정수를 대입 받아서 합계를 출력하는 메소드
	public void varargsSum(int...ar) {
		int sum=0;
		//...이 붙은 매개변수는 배열로 취급 
		//배열의 전체 데이터를 순회하면서 sum에 추가: 합계 구하기 
		for(int data:ar) {
			sum=sum+data;
		}
		System.out.printf("합계: %d\n", sum);
	}
	
	//매개변수의 자료형이 value형인 함수
	public void inc(int n) {
		n=n+1;
	}
	
	
	//매개변수의 자료형이 reference 형인 함수
	public void inc(int []ar) {
		ar[0]=ar[0]+1;
	}
	
	public void selectionSort(int [] ar) {
		//선택정렬
		//첫 번째부터 n-1번째 데이터까지 
		//자신의 뒤에 있는 모든 데이터와 비교해서 정렬 
		int size=ar.length;
		for(int i=0; i<size-1; i=i+1) {
			for(int j=i+1; j<size; j=j+1) {
				if(ar[i]>ar[j]) {
					//앞의 데이터가 클 때 뒤의 데이터와 교체 
					int temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
			}
		}
	}
	
	
}


