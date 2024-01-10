class Pattern12
{
    public static void main(String[] args) 
    {
        int n=5;
        for(int i=1;i<=n;i++)
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

5 4 3 2 1 
4 3 2 1   
3 2 1     
2 1       
1 
 */