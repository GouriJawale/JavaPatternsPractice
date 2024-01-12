class Pattern90 
{
    public static void main(String[] args) 
    {
        int n=5;
        int count = (n*2)+1;
        for(int i=n;i>=1;i--)
        {
            int c = count;
            for(int j=n;j>=i;j--)
            {
                System.out.print((char)(c+96) + "\t");
                c-=j;

            }
            count++;
            System.out.println();
        }
        
    }
    
}

/*
k
l       g
m       h       d
n       i       e       b        
o       j       f       c       a
 */
