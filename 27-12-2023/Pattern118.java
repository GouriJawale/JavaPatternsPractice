class Pattern118 
{
    public static void main(String[] args) 
    {
        int n = 5;
        int count = (n*(n+1))/2;
        for(int i=1;i<=n;i++)
        {
            for(int j=i;j>1;j--)
            {
                System.out.print(" ");
            }
            for(int j=i;j<=n;j++)
            {
                System.out.print((char)(64+count));
                count--;
            }
            System.out.println();
        }
        
    }
    
}
/*
ONMLK
 JIHG
  FED
   CB
    A
 */