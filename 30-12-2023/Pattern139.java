class Pattern139 
{
    public static void main(String[] args) 
    {
        int n = 5;
        for(int i=n;i>=1;i--)
        {
            for(int j=1;j<=n;j++)
            {
                if(i%2!=0)
                {
                    System.out.print((char)(64+i));
                }
                else
                {
                    System.out.print((char)(96+i));
                }
            }
            System.out.println();
        }
        
        
    }
    
}


/*
EEEEE
ddddd
CCCCC
bbbbb
AAAAA
 */