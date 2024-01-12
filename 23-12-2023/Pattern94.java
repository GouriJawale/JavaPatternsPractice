class Pattern94 
{
    public static void main(String[] args) 
    {
        int n = 5;
        int count = (n*(n+1))/2;
        for(int i = n;i>=1;i--)
        {
            int c = count;
            for(int j=i;j<=n;j++)
            {
                System.out.print((char)(96+c)+"\t");
                c+=j;

            }
            count-=i;
            System.out.println();
        }

        
    }
    
}
/*
o
j       n
f       i       m
c       e       h       l        
a       b       d       g       k
 */
