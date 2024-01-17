/*
AbCdEdCbA
AbCd dCbA
AbC   CbA
Ab     bA
A       A
 */

class Pattern246 
{
    public static void main(String[] args) 
    {
        int n = 5;
        for(int i=n;i>=1;i--)
        {
            if(i==n)
            {
                for(int j=1;j<=i;j++)
                {
                    if(j%2!=0)
                        System.out.print((char)(64+j));
                    else
                        System.out.print((char)(96+j));
                }
                for(int j=n-1;j>=1;j--)
                {
                    if(j%2!=0)
                        System.out.print((char)(64+j));
                    else
                        System.out.print((char)(96+j));
                }
            }
            else
            {
                for(int j=1;j<=i;j++)
                {
                    if(j%2!=0)
                        System.out.print((char)(64+j));
                    else
                        System.out.print((char)(96+j));
                }
                for(int j=1;j<=((n-i)*2)-1;j++)
                    System.out.print(" ");
                for(int j=i;j>=1;j--)
                {
                    if(j%2!=0)
                        System.out.print((char)(64+j));
                    else
                        System.out.print((char)(96+j));
                }
            }
            System.out.println();
        }
        
    }
    
}
