class Pattern39 
{
    public static void main(String[] args) 
    {
        int n = 5;
        for(int i=1;i<=n;i++)
        {
            for(int j=i;j<=n;j++)
            {
                System.out.print((char)(j+96)+" ");

            }
            System.out.println();
        }
        
    }
    
}

/*
a b c d e 
b c d e   
c d e     
d e       
e 
 */