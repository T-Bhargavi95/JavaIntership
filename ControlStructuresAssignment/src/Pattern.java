
public class Pattern {
	public void Shape(int n) {
		for(int index=1;index<=n;index++) {
			for(int space=1;space<=n-index;space++) {
				System.out.print(" ");
			}
			for(int i=1;i<=index;i++) {
				System.out.print(index);
			}
			System.out.println();
		}
	}
}
