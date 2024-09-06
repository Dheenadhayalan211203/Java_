package Notes.Inheritance;

public class exportdata extends bankdata
  {

    public void exportlocation(String str)
    {
        System.out.println("Exported to "+str);
    }

    public void tax(int amount)
    {
        int taxamount=(amount/100)*15;
        System.out.println("tax amount is "+taxamount);
    }

    public static void main(String[] args) {
        
        exportdata ed = new exportdata();
        ed.exportlocation( "India");
        ed.tax(10000);
        ed.profit(100
            , 0);
            ed.compname("Dheena & Co");
    }
    
}
