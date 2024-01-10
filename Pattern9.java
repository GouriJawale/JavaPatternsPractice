public class Pattern9 
{
    public static void main(String[] args) 
    {
        for(int i=1;i<=5;i++)
        {
            for(int j=5;j>=1;j--)
            {
                System.out.print((char)(96+j)+" ");
            }
            System.out.println();
        }
        
    }
    
}
