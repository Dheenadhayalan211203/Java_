public class ZeroOneTriangle2 {

    public static void main(String[] args) {
        
        int n=4;
        int start[]={1,0};
        int startnum=1;
        for(int row=1;row<=n;row++)
        {
            for(int col=1;col<=row;col++)
            {
                if(( row%2==0&&col%2==0))
                {
                     System.out.print(0+" ");
                }
                else{

                    System.out.print(1+" ");

                }
            }

            System.out.println();
             
        }
    }
    
}
