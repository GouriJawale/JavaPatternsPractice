class Pattern110 
{
    public static void main(String[] args) 
    {
        int n = 5;
        int count = (n*(n+1))/2;
        for(int i = 1;i<=n;i++)
        {
            int c = count;
            for(int j=i;j<n;j++)
            {
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--)
            
            {
                System.out.print((char)(64+c));
                c++;

            }
            count-=(i+1);
            System.out.println();
        }
        
    }
    
}

/*
    O
   MN
  JKL
 FGHI
ABCDE

                15
            13  14
        10  11  12
    6   7   8   9
1   2   3   4   5
 */