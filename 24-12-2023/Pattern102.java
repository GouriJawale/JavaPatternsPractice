

public class Pattern102 
{
    public static void main(String[] args) 
    {
        int n = 5;
        int count = ((n*(n+1))/2)-n+1;
        for(int i=1;i<=n;i++)
        {
            int c = count;
            for(int j=n;j>=i;j--)
            {
                System.out.print((char)(c+64)+" ");
                c-=(j-1);
            }
            count++;
            System.out.println();
        }
        
    }
    
}

/*
K G D B A
L H E C
M I F
N J
O

 */