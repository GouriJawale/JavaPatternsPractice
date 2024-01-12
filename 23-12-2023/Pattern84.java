class Pattern84 
{
    public static void main(String[] args) 
    {
        int n = 5 ;
        int count = (n*(n+1))/2;
        for(int i=1;i<=n;i++)
        {
            for(int j=i;j>=1;j--)
            {
                System.out.print((char)(count+64)+"\t");
                count--;
            }
            System.out.println();
        }
        
    }
    
}
/*
O
N       M
L       K       J
I       H       G       F        
E       D       C       B       A
 */