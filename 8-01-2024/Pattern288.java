/*

*********
*   *   *
*   *   *
*********
*   *   *
*   *   *
*********

 */

class Pattern288 
{
    public static void main(String[] args) 
    {
        int n = 4;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=(n*2)+1;j++)
            {
                if(i==1||j==1||i==n||j==(n+1)||j==(n*2)+1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

         for(int i=(n-1);i>=1;i--)
        {
            for(int j=1;j<=(n*2)+1;j++)
            {
                if(i==1||j==1||i==n||j==(n+1)||j==(n*2)+1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        
    }
    
}
