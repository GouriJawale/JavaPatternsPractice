class Pattern116 
{
    public static void main(String[] args) 
    {
        int n = 5;
        int count = 1;
        for(int i=5;i>=1;i--)
        {
            int c= count;
            for(int j=i;j>1;j--)
            {
                System.out.print(" ");
            }
            for(int j=i;j<=n;j++)
            {
                System.out.print((char)(c+64));
                c-=j;
            }
            count+=i;
            System.out.println();
        }
        
    }
    
}
/*
    A
   FB
  JGC
 MKHD
ONLIE

                1
            6   2
        10  7   3
    13  11  8   4
15  14  12  9   5
 */     
