import javax.swing.JOptionPane;

public class Number3 {
	
	public static void main(String [] args)
	{
		  int a=Integer.parseInt(JOptionPane.showInputDialog(null, "Input the first number"));
		  int b=Integer.parseInt(JOptionPane.showInputDialog(null, "Input the second number"));
		  int c=Integer.parseInt(JOptionPane.showInputDialog(null, "Input the third number"));
		  
		  System.out.println("Sort");
		  if (a<b) {
			  if(a<c) {
				 System.out.print(a+"   ");
				 if(b<c) {
					 System.out.print(b+"  "+c);
				 }
				 else {
					 System.out.print(c+"  "+b);
				 }
			  }
			  else {
				  System.out.print(c+"  "+a+"   "+b);
			  }
		  }
		  else {
			  if(b<c) {
				  System.out.print(b+"  ");
				  if(a<c) {
					  System.out.print(a+"  "+c);
				  }
				  else {
					  System.out.print(c+"  "+a);
				  }
			  }
			  else {
				  System.out.print(c+"  "+b+"   "+a);
			  }
		  }
		 System.out.println("\n");
		  
	     System.out.println("Reverse order");
		 if (a>b) {
			  if(a>c) {
				 System.out.print(a+"   ");
				 if(b>c) {
					 System.out.print(b+"  "+c);
				 }
				 else {
					 System.out.print(c+"  "+b);
				 }
			  }
			  else {
				  System.out.print(c+"  "+a+"   "+b);
			  }
		  }
		  else {
			  if(b>c) {
				  System.out.print(b+"  ");
				  if(a>c) {
					  System.out.print(a+"  "+c);
				  }
				  else {
					  System.out.print(c+"  "+a);
				  }
			  }
			  else {
				  System.out.print(c+"  "+b+"   "+a);
			  }
		  }
		  
	}

}
