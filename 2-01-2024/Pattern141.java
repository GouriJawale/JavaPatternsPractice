class Pattern141 
{
    public static void main(String[] args) 
    {
        int n = 5;
        for(int i = 1;i<=n;i++)
        {
            for(int j = n;j>=1;j--)
            {
                if(j%2!=0)
                {
                    System.out.print((char)(64+j));
                }
                else
                {
                    System.out.print((char)(96+j));
                }
            }
            System.out.println();
        }
        
    }
    
}

 /*
EdCbA
EdCbA
EdCbA
EdCbA
EdCbA
  */