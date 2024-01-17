
/*
    E
   dd
  CCC
 bbbb
AAAAA
 bbbb
  CCC
   dd
    E
*/
class Pattern184 
{
    public static void main(String[] args) 
    {
        int n = 5;
        for(int i=1;i<=(n*2)-1;i++)
        {
            if(i<=n)
            {
                for(int j=i;j<n;j++)
                {
                    System.out.print(" ");
                }
                for(int j=n;j>=(n-i+1);j--)
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

            }
            else
            {
                for(int j=i;j>n;j--)
                {
                    System.out.print(" ");
                }
                for(int j=(i-n+1);j<=n;j++)
                {
                    if(i%2==1)
                    {
                        System.out.print((char)(64+(i-n+1)));
                    }
                    else
                    {
                        System.out.print((char)(96+(i-n+1)));
                    }

                }

            }
            System.out.println();
        }
        
    }
    
}
