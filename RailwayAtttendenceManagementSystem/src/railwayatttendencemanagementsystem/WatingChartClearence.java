
package railwayatttendencemanagementsystem;

import java.sql.SQLException;
import javax.swing.JOptionPane;


public class WatingChartClearence {
    MyDb canceldetail= new MyDb();
    MyDb watingdetail = new MyDb();
    MyDb ob2 = new MyDb();
    MyDb ob3 = new MyDb();
    MyDb ob5 = new MyDb();
    int a = 65,i=1;
    String substring="",watingpnr="";
    char[]arr = new char[26];
    String root;
    String croot="",wroot="",cduply;
    boolean condition=false;
    String cdetail,wldetail,source,destination;
    
     public void WatingChart()
    {
        
        try {
            cdetail = "select * from pa12155";
            wldetail="select * from cp12155 where status= 'WL' ";
            canceldetail.result = canceldetail.st.executeQuery(cdetail);
            watingdetail.result = watingdetail.st.executeQuery(wldetail);
            while(canceldetail.result.next())
            {
                
                
                croot = canceldetail.result.getString("root");
         
                while(watingdetail.result.next())
                {
                    watingpnr = watingdetail.result.getString("pnr");
                    
                    cduply = "";
                    cduply = croot;
                    ob3.result = ob3.st.executeQuery("select root from cpdetail12155 where pnr = '"+watingdetail.result.getString("pnr")+"' ");
                    ob3.result.next();
                    
                    wroot = ob3.result.getString("root");
                    
                    do
                    {
                    if(wroot.equals(cduply))
                    {
                        insertionInWLDatabase(substring,canceldetail.result.getString("pnr"));
                      
                        condition = true;
                        break;
                    }
                    else 
                    {
                    if(substring.equals(wroot))
                    {
                        insertionInWLDatabase(croot,canceldetail.result.getString("pnr"));
                
                        condition = true;
                        break;
                    }
                    }
                substring = croot.substring(croot.length()-i,croot.length());
                cduply = croot.substring(0,(croot.length()-i));
                
                ++i;
                }while(croot.length()!=i);
             
                    if(condition)
                    {
                     break;
                    }
                
                }
                
            }
        } catch (Exception ex) {
            
        JOptionPane.showMessageDialog(null,"no more seats are avilable for clearing wating :"+ ex);
        }
    
    
    
    }
    
void insertionInWLDatabase(String leftroot,String pnr)
{
    
        try {
            MyDb storage = new MyDb();
            MyDb updateroot = new MyDb();
            ob5.result=ob5.st.executeQuery("select * from cpdetail12155 where pnr ='3546576879'");
            ob5.result.next();
            
            storage.st.executeUpdate("INSERT INTO cwaa (wpnr, status, stationfrom, destination, cpnr, cseatno, ccoach,class) VALUES ('"+watingdetail.result.getString("pnr")+"','CMF','"+ob5.result.getString("source")+"','"+ob5.result.getString("destination")+"','"+canceldetail.result.getString("pnr")+"','"+Integer.parseInt(canceldetail.result.getString("seatno"))+"','"+canceldetail.result.getString("coach")+"','"+canceldetail.result.getString("class")+"')");
        
            updateroot.st.executeUpdate("update pa12155 set root='"+leftroot+"' where pnr ='"+pnr+"'");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"there causes an error in clearing your wating list: "+ ex);
        }

}


    public static void main(String ae[])
             
{
WatingChartClearence ob = new WatingChartClearence();
ob.WatingChart();
}
}
