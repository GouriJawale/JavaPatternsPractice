/*
AAAAAAAAA
bbbb bbbb
CCC   CCC
dd     dd
E       E
 */

class Pattern244 
{
    public static void main(String[] args) 
    {
        int n = 5;
        for(int i=1;i<=n;i++)
        {
            if(i==1)
            {
                for(int j=i;j<=n;j++)
                    System.out.print((char)(i+64));
                for(int j=(i+1);j<=n;j++)
                    System.out.print((char)(i+64));
            }
            else
            {
                for(int j=i;j<=n;j++)
                {
                    if(i%2!=0)
                        System.out.print((char)(64+i));
                    else
                        System.out.print((char)(i+96));
                }
                for(int j=1;j<=((i-1)*2)-1;j++)
                {
                    System.out.print(" ");
                }
                for(int j=i;j<=n;j++)
                {
                    if(i%2!=0)
                        System.out.print((char)(64+i));
                    else
                        System.out.print((char)(i+96));
                }
            }
            System.out.println();
        }
        
    }
    
}
