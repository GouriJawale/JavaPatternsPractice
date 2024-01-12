class Pattern87 
{
    public static void main(String[] args) 
    {
        int n = 5;
        int count = 1;
        for(int i=n;i>=1;i--)
        {
            int c = count;
            for(int j=n;j>=i;j--)
            {
                System.out.print((char)(64+c)+"\t");
                c+=(j-1);
            }
            count++;
            System.out.println();
        }
        
    }
    
}

/*
A
B       F
C       G       J
D       H       K       M        
E       I       L       N       O
 */
