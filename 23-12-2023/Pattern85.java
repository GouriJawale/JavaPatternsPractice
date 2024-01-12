class Pattern85 
{
    public static void main(String[] args) 
    {
        int n = 5;
        int count = 1;
        for(int i=1;i<=n;i++)
        {
            int c = count;
            for(int j=i;j>=1;j--)
            {
                System.out.print((char)(c+64)+"\t");
                c--;
            }
            count+=(i+1);
            System.out.println();
        }
        
    }
    
}

/*
A
C       B
F       E       D
J       I       H       G        
O       N       M       L       K
 */
