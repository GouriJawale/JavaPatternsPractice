class Pattern41 
{
    public static void main(String[] args) 
    {
        int n=5;
        for(int i=n;i>=1;i--)
        {
            for(int j=i;j>=1;j--)
            {
                System.out.print((char)(j+96)+" ");
            }
            System.out.println();

        }
        
    }
    
}

/*
e d c b a 
d c b a 
c b a 
b a 
a
 */