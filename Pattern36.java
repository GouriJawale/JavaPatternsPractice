class Pattern36 
{
    public static void main(String[] args) 
    {
        int n = 5;
        for(int i=1;i<=n;i++)
        {
            for(int j=n;j>=i;j--)
            {
                System.out.print((char)(i+64)+" ");
            }
            System.out.println();

        }
        
    }
    
}

/*
A A A A A 
B B B B   
C C C     
D D       
E
 */