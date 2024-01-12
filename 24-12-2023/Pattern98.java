

public class Pattern98 
{
    public static void main(String[] args) 
    {
        int n = 5;
        int count =((n*(n+1))/2)-n+1;
        for(int i=n;i>=1;i--)
        {
            int c = count;
            for(int j=i;j>=1;j--)
            {
                System.out.print((char)(c+64)+"\t");
                 c++;
            }
            count-=(i-1);
            System.out.println();
        }        
    }
    
}

/*
K       L       M       N       O
G       H       I       J
D       E       F
B       C
A
 */
