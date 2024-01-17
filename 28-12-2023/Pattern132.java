class Pattern132 
{
    public static void main(String[] args) 
    {
        int n = 5;
        int count1 = n;
        int count2 = 1;
        for(int i=n,i1=1;i>=1&&i1<=n;i--,i1++)
        {
            int c1 = count1;
            int c2 = count2;
            for(int j=i,j2=i1;j>=1&&j2<=n;j--,j2++)
            {
                System.out.print((char)(64+c1));
                System.out.print((char)(96+c2));
                System.out.print("\t");
                c2+=j2;
                c1--;
            }
            count1+=(i-1);
            count2+=(i1+1);
            System.out.println();
        }
        
    }
    
}


/*
Ea      Db      Cd      Bg      Ak
Ic      He      Gh      Fl        
Lf      Ki      Jm
Nj      Mn
Oo
 */