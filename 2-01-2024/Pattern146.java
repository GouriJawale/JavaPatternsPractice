class Pattern146 
{
    public static void main(String[] args) 
    {
        int n = 5;
        for(int i=1;i<=n;i++)
        {
            for(int j=n;j>=1;j--)
            {
                if(i>j)
                {
                    System.out.print(j);
                }
                else
                {
                    System.out.print(i);
                }
            }
            System.out.println();
        }
        
    }
    
}
/*
11111
22221
33321
44321
54321
 */