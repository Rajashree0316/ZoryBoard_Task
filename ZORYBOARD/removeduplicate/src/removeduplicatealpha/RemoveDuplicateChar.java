package removeduplicatealpha;

import java.util.Scanner;

public class RemoveDuplicateChar {
	public static void main(String[] args) {
		
      Scanner sc =new Scanner(System.in);
      System.out.println("enter the string");
      String st=sc.nextLine();
      
      /*Given input string to character array */
      char ch[]=st.toCharArray();
      int n=ch.length;
      st="";
      
      /*duplicate character exists, remove it by shifting all the subsequent characters 
       one step left which eventually overwrite the duplicate character*/
      
      for (int i=0;i<n ;i++ )
      {
         st=st+ch[i];
         for (int j=i+1;j<n ;j++ )
         {
            if (ch[i]!=' '&&(ch[i]==ch[j]||ch[i]==ch[j]+32||ch[i]==ch[j]-32))
            {
               for (int k=j;k<n-1 ;k++ )
               {
                  ch[k]=ch[k+1];
               }
               n--;
               j--;
            }
         }
      }
      System.out.println(st);
      sc.close();
   }
}