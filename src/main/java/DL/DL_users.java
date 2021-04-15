package DL;
import A.TWeb;
import static A.A.*;
import static DL.DL.*;
import javax.swing.JTable;
/**
 *
 * @author Oleg.Spozito
 */
public class DL_users {
    private static String tbl_userName;
    public static void run(JTable TBL) throws InterruptedException { 
        String dUser = "";
        String dUserPW = "Compass1"; // ============== ????
        String dMetrics = "";  
        String dTPeriod = "";
        float dValue = 0;
        String [] L_Filters; 
        String [] I_Filters; 
        String L_FilterKey = "";
        String L_FilterValue = "";
        String I_FilterKey = "";
        String I_FilterValue = "";
        String KPI = "";
        String dSource = ""; // just in case
        for (int i = 0; i < TBL.getRowCount(); i++) {
            dUser = String.valueOf(TBL.getValueAt(i, 0));
            dMetrics = String.valueOf(TBL.getValueAt(i, 1)); 
            dTPeriod = String.valueOf(TBL.getValueAt(i, 2));
            dValue = (float) TBL.getValueAt(i, 3);
            L_Filters = String.valueOf(TBL.getValueAt(i, 4)).split(",");
            I_Filters = String.valueOf(TBL.getValueAt(i, 5)).split(",");
            KPI = String.valueOf(TBL.getValueAt(i, 6));
            dSource = String.valueOf(TBL.getValueAt(i, 7));
            
            // Check if dUser is actually logged user (dUser == DL_UserID) - if not > relogin
            // If relogin Save last user (update DL_UserID) to check again
//            String tbl_userName = TBL.getValueAt(TBL.getSelectedRow(), 0).toString();
//            System.out.println(tbl_userName);
//            String DL_UserID= "distilr.test2@place.com";
//            String username= (String) TBL.getModel().getValueAt(i, 0);
            System.out.println(dUser);
   
            if(dUser.equals(DL_UserID) ) {
                 DL_login.run();
            } else {
                _t++; Thread.sleep((long) sleep); TWeb.Navigate_to_URL("Navigate to", url, "no_jira");             
                if (FAIL) { return;}
                //Thread.sleep(10000);
                _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click 'USERNAME' input", "id", "username", "no_jira"); 
                    if (FAIL) { return;}
                _t++; TWeb.Element_By_Path_Text_Enter("Enter Valid User Name", "id", "username", dUser, false, "no_jira"); 
                    if (FAIL) { return;}            
                _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click 'PASSWORD' input", "id", "password", "no_jira"); 
                    if (FAIL) { return;}
                _t++; TWeb.Element_By_Path_Text_Enter("Enter Valid User Password", "id", "password", DL_UserPW, true, "no_jira"); 
                    if (FAIL) { return;}
                _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click 'Sign In'", "name", "login", "no_jira"); 
                    if (FAIL) { return;} 
                Thread.sleep(500);
            }
            
            // Check dTPeriod - if selected by default - do nothing, if not - select one from current row

            // Select dMetrics

            for (String L : L_Filters) {// Location dIFilter(s) loop 
                if(L.contains(":")){
                    L_FilterKey = L.substring(0,L.indexOf(":")).trim();
                    L_FilterValue = L.substring(L.indexOf(":")+1 ).trim();   
                    // ========  Apply Location Filter Key / FilterValue ===============
                    //
                }  
            }                   
            
            for (String I : I_Filters) {// Item dIFilter(s) loop
                if(I.contains(":")){
                    I_FilterKey = I.substring(0,I.indexOf(":")).trim();
                    I_FilterValue = I.substring(I.indexOf(":")+1 ).trim();   
                    // ========  Apply Item Filter Key / FilterValue ===============
                    //
                }                
            }
        }
        
        // Verify dValue from file against FrontEnd   
    }   
}  
