/*
EEEEEEEEE
 ddddddd 
  CCCCC  
   bbb   
    A
 */

class Pattern225 
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
            for(int j=i;j>=1;j--)
            {
                if(i%2!=0)
                {
                    System.out.print((char)(64+i));
                }
                else
                {
                    System.out.print((char)(96+i));
                }
            }
            for(int j=2;j<=i;j++)
            {
                if(i%2!=0)
                {
                    System.out.print((char)(64+i));
                }
                else
                {
                    System.out.print((char)(96+i));
                }
            }
            System.out.println();
        }
        
    }
    
}
