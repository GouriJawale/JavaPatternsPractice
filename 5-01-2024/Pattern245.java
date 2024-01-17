/*
EEEEEEEEE
dddd dddd
CCC   CCC
bb     bb
A       A
 */

class Pattern245 
{
    public static void main(String[] args) 
    {
        int n = 5;
        for(int i=n;i>=1;i--)
        {
            if(i==n)
            {
                for(int j=1;j<=n*2-1;j++)
                    System.out.print((char)(64+i));
            }
            else
            {
                for(int j=i;j>=1;j--)
                {
                    if(i%2!=0)
                        System.out.print((char)(64+i));
                    else
                        System.out.print((char)(96+i));
                }
                for(int j=1;j<=((n-i)*2)-1;j++)
                    System.out.print(" ");
                for(int j=i;j>=1;j--)
                {
                    if(i%2!=0)
                        System.out.print((char)(64+i));
                    else
                        System.out.print((char)(96+i));
                }
            }
            System.out.println();
        }
        
    }
    
}
