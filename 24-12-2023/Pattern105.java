public class Pattern105 
{
    public static void main(String[] args) 
    {
        int n = 5 ;
        int count = (n*(n+1))/2;
        for(int i=1;i<=n;i++)
        {
            int c = count;
            for(int j=i;j<=n;j++)
            {
                System.out.print((char)(64+c)+" ");
                c-=(j+1);
            }
            count-=i;
            System.out.println();
        }

        
    }
    
}

/*
O M J F A 
N K G B
L H C
I D
E



15  13  10  6   1
14  11  7   2
12   8  3
9   4
5




 */
