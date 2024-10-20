class A{
	int i ;
	int j;
	A(int i ,int j){
		this.i = i;
		this.j = j;
		
	}
}
public class Constructor {
	public static void main(String[] args) {
		A a1 = new A(10,20);
		System.out.println(a1.i);
		System.out.println(a1.j);
	}
	

}
