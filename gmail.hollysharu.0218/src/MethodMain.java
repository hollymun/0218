
public class MethodMain {

	public static void main(String[] args) {
	
	//Method의 Instance 생성 
	Method obj=new Method();
	//메소드 호출
	obj.disp();
	obj.disp();
	System.out.println("===================");
	
	//매개변수가 잇는 메소드를 호출할 때는 
	//매개변수를 대입해서 호출해야 
	obj.argDisp(2);
	obj.twoDisp("랄ㄹㅏ", 3);
	System.out.println("===================");

	//매개변수가 ...으로 되어 있으면 매개변수 개수에 상관 없이 대입 가능함 
	obj.varargsSum(10,30);
	obj.varargsSum(30,40,506,505);
	
/*	
	//Primitive Type과 Reference Type의 저장방법 차이 
	int a=10;
	int[]ar= {100,200,300};
	int b=a;
	int []br=ar;
	b=20;
	br[0]=20;
	System.out.printf("a: %d\n",a);
	System.out.printf("ar[0]: %d\n", ar[0]);
	System.out.println("===================");
*/
	int a=10;
	int[]ar= {100,200,300};
	obj.inc(a);
	obj.inc(ar);
	System.out.printf("a:%d\n", a);
	System.out.printf("ar[0]: %d\n",ar[0]);
	
	System.out.println("===================");
	int []xr= {37,87,29,65,47};
	for (int temp:xr) {
		System.out.printf("%d\t", temp);		
	}
	System.out.printf("\n");

	
	//데이터 정렬 
	obj.selectionSort(xr);
	for(int temp:xr) {
		System.out.printf("%d\t", temp);
	}
	

	}
}
