class Pattern23 
{
    public static void main(String[] args) 
    {
        int n = 5;
        for(int i=1;i<=n;i++)
        {
            for(int j=i;j>=1;j--)
            {
                System.out.print((char)(i+64)+" ");
            }
            System.out.println();
        }
        
    }
    
}

/*
A 
B B       
C C C     
D D D D   
E E E E E 
 */