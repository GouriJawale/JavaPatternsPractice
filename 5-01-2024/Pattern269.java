
/*
AbCdEdCbA
bCdE EdCb
CdE   EdC
dE     Ed
E       E
dE     Ed
CdE   EdC
bCdE EdCb
AbCdEdCbA
 */

class Pattern269 
{
    public static void main(String[] args) 
    {
        int n = 5;
        for(int i=1;i<=n;i++)
        {
            if(i==1)
            {
                for(int j=i;j<=n;j++)
                {
                    if(j%2!=0)
                    System.out.print((char)(j+64));
                     else
                    System.out.print((char)(j+96));
                }
                for(int j=n-1;j>=i;j--)
                {
                    if(j%2!=0)
                    System.out.print((char)(j+64));
                    else
                    System.out.print((char)(j+96));
                }
            }
            else
            {
                for(int j=i;j<=n;j++)
                {
                    if(j%2!=0)
                    System.out.print((char)(j+64));
                     else
                    System.out.print((char)(j+96));
                }
                for(int j=1;j<=((i-1)*2)-1;j++)
                {
                    System.out.print(" ");
                }
                for(int j=n;j>=i;j--)
                {
                    if(j%2!=0)
                    System.out.print((char)(j+64));
                     else
                    System.out.print((char)(j+96));
                }
            }
            System.out.println();
        }

        for(int i=(n-1);i>=1;i--)
        {
            if(i==1)
            {
                for(int j=i;j<=n;j++)
                {
                    if(j%2!=0)
                    System.out.print((char)(j+64));
                     else
                    System.out.print((char)(j+96));
                }
                for(int j=n-1;j>=i;j--)
                {
                    if(j%2!=0)
                    System.out.print((char)(j+64));
                    else
                    System.out.print((char)(j+96));
                }
            }
            else
            {
                for(int j=i;j<=n;j++)
                {
                    if(j%2!=0)
                    System.out.print((char)(j+64));
                     else
                    System.out.print((char)(j+96));
                }
                for(int j=1;j<=((i-1)*2)-1;j++)
                {
                    System.out.print(" ");
                }
                for(int j=n;j>=i;j--)
                {
                    if(j%2!=0)
                    System.out.print((char)(j+64));
                     else
                    System.out.print((char)(j+96));
                }
            }
            System.out.println();
        }
        
    }
    
}
