public class Pattern100 
{
    public static void main(String[] args) 
    {
        int n = 5;
        int count = n;
        for(int i = 1; i<=n;i++)
        {
            int c = count;
            for(int j=n;j>=i;j--)
            {
                System.out.print((char)(c+64)+" ");
                c+=(j-1);
            }
            count--;
            System.out.println();
        }
        
    }
    
}

/*
E I L N O
D H K M
C G J
B F
A
 */
