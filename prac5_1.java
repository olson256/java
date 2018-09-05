import CE_Dept.*;
import IT_Dept.*;

public class prac5_1
{
   public static void main(String args[]) 
   {       
		int pc=10;
      String name ="i5 8th gen";
      
      CE_Dept.Machine_Detail a = new CE_Dept.Machine_Detail();
      a.display(pc,name);
      
      int pc1=11;
      String name1 ="i5 7th gen";
      
      IT_Dept.Machine_Detail ab = new IT_Dept.Machine_Detail();
      ab.display(pc1,name1);
   }
}
