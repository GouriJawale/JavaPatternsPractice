class Pattern130 
{
    public static void main(String[] args) 
    {
        int n = 5;
        int count1 = n;
        int count2 = (n*(n+1))/2;
        for(int i=n;i>=1;i--)
        {
            int c1 = count1;
            int c2 = count2;
            for(int j=i;j>1;j--)
            {
                System.out.print("\t");
            }
            for(int j=i,j1=n;j<=n&&j1>=i;j++,j1--)
            {
                System.out.print((char)(c1+64));
                System.out.print((char)(c2+64));
                System.out.print("\t");
                c1-=j+1;
                c2+=j;
            }
            count1+=(i-1);
            count2-=i;
            System.out.println();
        }
        
    }
    
}

/*
                                EO
                        IJ      DN
                LF      HI      CM
        NC      KE      GH      BL
OA      MB      JD      FG      AK


                5
            9   4
        12  8   3
    14  11  7   2
15  13  10  6   1

                15
            10  14
        6   9   13
    3   5   8   12
1   2   4   7   11

 */
