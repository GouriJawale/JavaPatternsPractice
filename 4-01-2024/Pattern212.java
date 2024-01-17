/*
    E    
   EdE   
  EdCdE  
 EdCbCdE 
EdCbAbCdE
 */

class Pattern212 
{
    public static void main(String[] args) 
    {
        int n = 5;
        for(int i=n;i>=1;i--)
        {
            for(int j=i;j>1;j--)
            {
                System.out.print(" ");
            }
            for(int j=n;j>=i;j--)
            {
                if(j%2!=0)
                {
                    System.out.print((char)(64+j));
                }
                else
                {
                    System.out.print((char)(96+j));
                }
            }
            for(int j=(i+1);j<=n;j++)
            {
                if(j%2!=0)
                {
                    System.out.print((char)(64+j));
                }
                else
                {
                    System.out.print((char)(96+j));
                }
            }
            System.out.println();
        }

        
    }
    
}
