import java.util.Arrays;

public class ArraysBasics {
	public static void main(String[] args) {
		double[] a = new double[3];
		a[0] = 5.0;
		//Access length property 
		a[a.length-1]=7.0; 
		a[1]=6.0; 
		//{5.0,6.0,7.0}
		System.out.println(Arrays.toString(a));
	}
}
