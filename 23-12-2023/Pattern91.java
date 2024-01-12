class Pattern91 
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
                System.out.print((char)(96+c)+"\t");
                c-=(j-1);
            }
            count+=i;
            System.out.println();
        }
        
    }
    
}

/*
a
f       b
j       f       c
m       i       f       d        
o       k       h       f       e
 */