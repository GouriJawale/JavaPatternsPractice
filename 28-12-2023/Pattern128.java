class Pattern128 
{
    public static void main(String[] args) 
    {
        int n = 5;
        int count1 = 1;
        int count2 = (n*(n+1))/2;
        for(int i =1;i<=n;i++)
        {
            int c1 = count1;
            int c2= count2;
            for(int j=i;j>1;j--)
            {
                System.out.print("\t");
            }
            for(int j=n, j1=i;j>=i&&j1<=n;j--,j1++)
            {
                System.out.print((char)(64+c1));
                System.out.print((char)(64+c2));

                System.out.print("\t");
                c1+=j;
                c2-=j1+1;
            }
            count1++;
            count2-=i;
            System.out.println();

        }
        
    }
    
}

/*
AO      FM      JJ      MF      OA
        BN      GK      KG      NB
                CL      HH      LC
                        DI      ID
                                EE



1   6   10   13  15
    2   7   11  14
        3   8   12
            4   9
                5

15  13  10  6   1
    14  11  7   2
        12  8   3
            9   4
                5
 */
