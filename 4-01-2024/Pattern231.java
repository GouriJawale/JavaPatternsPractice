/*
555555555
 4444444 
  33333  
   222   
    1    
   222   
  33333  
 4444444 
555555555
 */

class Pattern231 
{
    public static void main(String[] args) 
    {
        int n = 5;
        for(int i=n;i>=1;i--)
        {
            for(int j=i;j<n;j++)
            {
                System.out.print(" ");
            }
            for(int j=(i*2-1);j>=1;j--)
            {
                System.out.print(i);
            }
            System.out.println();

        }
        for(int i=2;i<=n;i++)
        {
            for(int j=i;j<n;j++)
            {
                System.out.print(" ");
            }
            for(int j=(i*2-1);j>=1;j--)
            {
                System.out.print(i);
            }
            System.out.println();

        }
        
    }
    
}
