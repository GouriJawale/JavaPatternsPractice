class Pattern92 
{
    public static void main(String[] args) 
    {
        int n = 5 ;
        int count = n;
        for(int i=n;i>=1;i--)
        {
            int c = count;
            for(int j=i;j<=n;j++)
            {
                System.out.print((char)(c+96)+"\t");
                c-=(j+1);
            }
            count+=(i-1);
            System.out.println();
        }
        
    }
    
}

/*
e
i       d
l       h       c
n       k       g       b        
o       m       j       f       a
 */