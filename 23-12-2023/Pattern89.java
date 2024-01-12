class Pattern89 
{
    public static void main(String[] args) 
    {
        int n = 5;
        int count = (n*(n+1))/2;
        for(int i=n;i>=1;i--)
        {
            int c = count;
            for(int j=n;j>=i;j--)
            {
                System.out.print((char)(c+96)+"\t");
                c-=(j-1);
            }
            count--;
            System.out.println();
        }
        
    }
    
}

/*
o
n       j
m       i       f
l       h       e       c        
k       g       d       b       a
 */
