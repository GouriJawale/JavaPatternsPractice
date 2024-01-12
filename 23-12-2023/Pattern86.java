class Pattern86 
{
    public static void main(String[] args) 
    {
        int n = 5;
        int count = (n*(n+1))/2;
        for(int i=1;i<=n;i++)
        {
            int c = count;
            for(int j=i;j>=1;j--)
            {
                System.out.print((char)(c+64)+" \t ");
                c++;
            }
            count-=(i+1);
            System.out.println();
        }
        
    }
    
}

/*
O        
M        N       
J        K       L       
F        G       H       I               
A        B       C       D       E   
 */