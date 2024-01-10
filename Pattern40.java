class Pattern40 
{
    public static void main(String[] args) 
    {
        int n = 5;
        for(int i=1;i<=n;i++)
        {
            for(int j=n;j>=i;j--)
            {
                System.out.print((char)(j+64)+" ");
            }
            System.out.println();
        }
        
    }
    
}

/*
E D C B A 
E D C B   
E D C     
E D       
E
 */
