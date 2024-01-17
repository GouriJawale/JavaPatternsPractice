class Pattern142 
{
    public static void main(String[] args) 
    {
        int n = 5;
        for(int i = 1;i<=n;i++)
        {
            for(int j = 1;j<=n;j++)
            {
                if(i%2!=0)
                {
                    System.out.print(1);
                }
                else
                {
                    int c = i/2;
                    System.out.print((char)(64+c));
                }
            }
            System.out.println();
        }
        
    }
    
}

/*
11111
AAAAA
11111
BBBBB
11111
 */