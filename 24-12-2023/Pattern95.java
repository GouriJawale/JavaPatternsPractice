class Pattern95 
{
    public static void main(String[] args) 
    {
        int n = 5;
        int count = 1;
        for(int i = 1;i<=n;i++)
        {
           
            for(int j=i;j<=n;j++)
            {
                System.out.print((char)(count+64)+"\t");
                count++;
            }
            System.out.println();
        }
        
    }
    
}

/*
A       B       C       D       E
F       G       H       I
J       K       L
M       N
O
 */
