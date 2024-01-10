class Pattern24 
{
    public static void main(String[] args) 
    {
        int n = 5;
        for(int i=n;i>=1;i--)
        {
            for(int j=i;j<=n;j++)
            {
                System.out.print((char)(96+i)+" ");
            }
            System.out.println();
        }
        
    }
    
}

/*
e 
d d       
c c c     
b b b b   
a a a a a
 */
