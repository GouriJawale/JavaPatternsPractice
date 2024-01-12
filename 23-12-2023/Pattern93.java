class Pattern93 
{
    public static void main(String[] args) 
    {
        int n = 5;
        int  count = (n*2)+1;
        for(int i=n;i>=1;i--)
        {
            int c = count;
            for(int j=i;j<=n;j++)
            {
                System.out.print((char)(96+c)+"\t");
                c+=(j+1);
            }
            System.out.println();
            count-=(i-1);
        }
        
    }
    
}

/*
k
g       l
d       h       m
b       e       i       n        
a       c       f       j       o
 */