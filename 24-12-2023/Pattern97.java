

class Pattern97 
{
    public static void main(String[] args) 
    {
        int n = 5;
        int count = n;
        for(int i=n;i>=1;i--)
        {
            int c = count;
            for(int j=i;j>=1;j--)
            {
                System.out.print((char)(c+64)+"\t");
                c--;
            }
            count+=(i-1);
            System.out.println();
        }
        
    }
    
}

/*
E       D       C       B       A
I       H       G       F
L       K       J
N       M
O
 */
