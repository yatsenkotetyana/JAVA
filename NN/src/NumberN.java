import java.util.Arrays;

import javax.swing.JOptionPane;

public class NumberN {
	
	public static void main(String [] args)	{
		int N=Integer.parseInt(JOptionPane.showInputDialog(null, "Input the number of number"));
		int []number=new int[N];
		
		for(int i=0;i<N;i++) {
			number[i]=Integer.parseInt(JOptionPane.showInputDialog(null, "Input the next number"));
		}
		Arrays.sort(number);
		
		for(int i=0;i<number.length;i++) {
			System.out.print(number[i]+" ");
		}
		System.out.println("\n");
		
		for(int i=number.length-1;i>=0;i--) {
			System.out.print(number[i]+" ");
		}
		System.out.println("\n");
		
	}

}
