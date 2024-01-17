class Pattern152 
{
    public static void main(String[] args) 
    {
        int n = 9;
        int count = (n*2)-n+1;
        for(int i = 1;i<=n;i++)
        {
            for(int j=i;j>=1;j--)
            {
                if(j%2!=1)
                {
                    System.out.print((char)(count+64));
                    count--;
                }
                else
                {
                    System.out.print(1);
                }
            }
            System.out.println();
        }
        
    }
    
}
