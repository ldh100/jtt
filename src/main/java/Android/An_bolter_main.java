/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Android;
/**
 *
 * @author Oleg.Spozito
 */
class An_bolter_main extends An_GUI{
    protected An_bolter_main(An_GUI a) {
       Bolter_ID = a.Bolter_ID;
       Bolter_PW = a.Bolter_PW;
       ad = a.ad;
       loadTimeout = a.loadTimeout;
       LoadTimeOut = a.LoadTimeOut;
       ParentTest = a.ParentTest;
    }

    protected void Run() throws InterruptedException, Exception{         
        Wait_For_Element_By_Path_Presence("Wait for 'Sign In' screen", "id", "button_login", ParentTest, "no_jira");
            if (FAIL) { return;}           
//        Test_EX_Update("Test_EX_Update_Log_01", ParentTest, "no_jira");
//        Test_EX_Update("Test_EX_Update_Log_02", ParentTest, "no_jira");     
    }
}
