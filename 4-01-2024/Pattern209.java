/*
    E    
   ddd   
  CCCCC  
 bbbbbbb 
AAAAAAAAA
 */
class Pattern209 
{
    public static void main(String[] args) 
    {
        int n = 5;
        for(int i=1;i<=n;i++)
        {
            for(int j=i;j<n;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=(i*2-1);j++)
            {
                if(i%2==1)
                {
                    System.out.print((char)(64+(n-i+1)));
                }
                else
                {
                    System.out.print((char)(96+(n-i+1)));
                }
            }
            System.out.println();
        }
        
    }
    
}
