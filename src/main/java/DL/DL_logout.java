/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DL;

/**
 *
 * @author Oleg.Spozito
 */
class DL_logout extends DL_GUI {
    protected DL_logout(DL_GUI a) {
        DL_UserID = a.DL_UserID;
        DL_UserPW = a.DL_UserPW;
        url = a.url;
        d1 = a.d1;
        loadTimeout = a.loadTimeout;
        LoadTimeOut = a.LoadTimeOut;
        ParentTest = a.ParentTest;
    }
    protected void run() throws InterruptedException, Exception {   
         
    }
}