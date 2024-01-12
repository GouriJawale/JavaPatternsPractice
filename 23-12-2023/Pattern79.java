class Pattern79 
{
    public static void main(String[] args) 
    {
        int n = 5;
        int count = 1;
        for(int i=n;i>=1;i--)
        {
            int c = count;
            for(int j=n;j>=i;j--)
            {
                System.out.print(c+"\t");
                c-=(j-1);
            }
            count+=i;
            System.out.println();
        }
        
    }
}

/*
1
6       2
10      6       3
13      9       6       4        
15      11      8       6       5

 */