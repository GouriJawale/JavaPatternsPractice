/*
E       E
dd     dd
CCC   CCC
bbbb bbbb
AAAAAAAAA
 */

class Pattern257 
{
    public static void main(String[] args) 
    {
        int n = 5;
        for(int i=n;i>=1;i--)
        {
            if(i==1)
            {
                for(int j=1;j<=n;j++)
                    System.out.print((char)(i+64));
                
                for(int j=2;j<=n;j++)
                    System.out.print((char)(i+64));
            }
            else
            {
                for(int j=i;j<=n;j++)
                {
                    if(i%2!=0)
                        System.out.print((char)(64+i));
                    else
                        System.out.print((char)(96+i));
                }
                for(int j=1;j<=((i-1)*2)-1;j++)
                    System.out.print(" ");
                for(int j=i;j<=n;j++)
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
