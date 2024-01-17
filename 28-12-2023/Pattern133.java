class Pattern133 
{
    public static void main(String[] args) 
    {
        int n = 5;
        int count1 = n;
        int count2 = n;
        for(int i=n,i2=1;i>=1&&i2<=n;i--,i2++)
        {
            int c1 = count1;
            int c2 = count2;
            for(int j=i,j2=n;j>=1&&j2>=i2;j--,j2--)
            {
                System.out.print((char)(64+c1));
                 System.out.print((char)(64+c2));
                 System.out.print("\t");
                c1--;
                c2+=(j2-1);
            }
            count1+=(i-1);
            count2--;
            System.out.println();
        }
        
    }
    
}
/*
EE      DI      CL      BN      AO
ID      HH      GK      FM
LC      KG      JJ
NB      MF
OA
 */