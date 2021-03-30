/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DL;
import A.TWeb;
import static A.A.*;
import static DL.DL.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTable;
/**
 *
 * @author Oleg.Spozito
 */
public class DL_users {
    public static void run(JTable TBL) throws InterruptedException { 
        String dUser = "";
        String dUserPW = "Compass1"; // ============== ????
        String dMetrics = "";  
        String dTPeriod = "";
        float dValue = 0;
        String [] dLFilters; 
        String [] dIFilters; 
        String Source = ""; // just in case
        for (int i = 0; i < TBL.getRowCount(); i++) {
            dUser = String.valueOf(TBL.getValueAt(TBL.getSelectedRow(), 0));
            dMetrics = String.valueOf(TBL.getValueAt(TBL.getSelectedRow(), 1)); 
            dTPeriod = String.valueOf(TBL.getValueAt(TBL.getSelectedRow(), 2));
            dValue = (float) TBL.getValueAt(TBL.getSelectedRow(), 3);
            dLFilters = String.valueOf(TBL.getValueAt(TBL.getSelectedRow(), 4)).split("\r\n");
            dIFilters = String.valueOf(TBL.getValueAt(TBL.getSelectedRow(), 5)).split("\r\n");
            Source = String.valueOf(TBL.getValueAt(TBL.getSelectedRow(), 6));
            // Check if dUser is actually logged user - if not relogin
            // Check dTPeriod - if selected by default - do nothing, if not - select one from current row
            // to go dMetrics
            // apply location dLFilters (multiple?)
            // apply item dIFilters(multiple?)
            // verify values           

        }
    }  
}
