/*

*********
**     **
* *   * *
*  * *  *
*   *   *
*  * *  *
* *   * *
**     **

 */

class Pattern285 
{
    public static void main(String[] args) 
    {
        int n = 7;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=(n*2)-1;j++)
            {   
                //for reverse diagonal we need to print the star where the addition of i and j is equal to n*2.
                int m = i+j;
                if(j==1||j==i||j==(n*2)-1||m==n*2||i==1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

         for(int i=(n-1);i>=1;i--)
        {
            for(int j=1;j<=(n*2)-1;j++)
            {
                int m = i+j;
                if(j==1||j==i||j==(n*2)-1||m==n*2||i==1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        
    }
    
}
