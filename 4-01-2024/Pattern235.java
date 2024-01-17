/*
AAAAAAAAA
 bbbbbbb
  CCCCC
   ddd
    E
   ddd
  CCCCC
 bbbbbbb
AAAAAAAAA
 */
class Pattern235 
{
    public static void main(String[] args) 
    {
        int n = 5;
        for(int i=n;i>=1;i--)
        {
            for(int j=i;j<n;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=(i*2-1);j++)
            {
                if(i%2==1)
                {
                    System.out.print((char)((n-i+1)+64));
                }
                else
                {
                     System.out.print((char)((n-i+1)+96));
                }
            }
            System.out.println();
        }

        for(int i=2;i<=n;i++)
        {
            for(int j=i;j<n;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=(i*2-1);j++)
            {
                if(i%2==1)
                {
                    System.out.print((char)((n-i+1)+64));
                }
                else
                {
                     System.out.print((char)((n-i+1)+96));
                }
            }
            System.out.println();
        
    }
    
}
}