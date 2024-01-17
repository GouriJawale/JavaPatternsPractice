/*
E       E
dE     Ed
CdE   EdC
bCdE EdCb
AbCdEdCbA
 */
class Pattern261 
{
    public static void main(String[] args) 
    {
        int n = 5;
        for(int i=n;i>=1;i--)
        {
            if(i==1)
            {
                for(int j=i;j<=n;j++)
                {
                    if(j%2!=0)
                        System.out.print((char)(64+j));
                    else
                         System.out.print((char)(96+j));
                }
                for(int j =(n-i);j>=1;j--)
                {
                     if(j%2!=0)
                        System.out.print((char)(64+j));
                    else
                         System.out.print((char)(96+j));
                }
            }
            else
            {
                for(int j=i;j<=n;j++)
                {
                     if(j%2!=0)
                        System.out.print((char)(64+j));
                    else
                         System.out.print((char)(96+j));
                }
                for(int j=1;j<=((i-1)*2)-1;j++)
                    System.out.print(" ");
                for(int j=n;j>=i;j--)
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
