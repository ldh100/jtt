/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DL;

/**
 *
 * @author prathyusha.deshpande
 */
 class DL_Accountmanager extends DL_GUI {
    protected DL_Accountmanager(DL_GUI a) {
        DL_UserID = a.DL_UserID;
        DL_UserPW = a.DL_UserPW;
        url = a.url;
        d1 = a.d1;
        loadTimeout = a.loadTimeout;
        LoadTimeOut = a.LoadTimeOut;
        ParentTest = a.ParentTest;
    }
    protected void run() throws InterruptedException, Exception { 
        System.out.println("Account Manager");
        Navigate_to_URL("Navigate to", url, ParentTest, "no_jira");                                 
        Wait_For_Element_By_Path_Presence("Wait 'USERNAME' input", "id", "username", ParentTest, "no_jira"); 
            if (FAIL) { return;} 
        Page_URL("Foodbuy Login page URL", ParentTest, "no_jira");     
        
    }  
}
