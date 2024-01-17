/*
A       A
bb     bb
CCC   CCC
dddd dddd
EEEEEEEEE
 */

class Pattern256 
{
    public static void main(String[] args) 
    {
        int n = 5;
        for(int i=1;i<=n;i++)
        {
            if(i==n)
            {
                for(int j=1;j<=i;j++)
                    System.out.print((char)(64+i));
                for(int j=2;j<=i;j++)
                    System.out.print((char)(64+i));

            }
            else
            {
                for(int j=1;j<=i;j++)
                {
                    if(i%2!=0)
                        System.out.print((char)(64+i));
                    else
                        System.out.print((char)(96+i));
                }
                for(int j=1;j<=((n-i)*2)-1;j++)
                    System.out.print(" ");
                for(int j=1;j<=i;j++)
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
