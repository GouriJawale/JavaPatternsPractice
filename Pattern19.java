class Pattern19 
{
    public static void main(String[] args) 
    {
        int n = 5;
        for(int i=5;i>=1;i--)
        {
            for(int j=i;j<=n;j++)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    
}

/*
5 
4 4       
3 3 3     
2 2 2 2   
1 1 1 1 1 1
 */
