
package DL;


class DL_drilldown extends DL_GUI {
    protected DL_drilldown(DL_GUI a) {
        DL_UserID = a.DL_UserID;
        DL_UserPW = a.DL_UserPW;
        url = a.url;
        d1 = a.d1;
        loadTimeout = a.loadTimeout;
        LoadTimeOut = a.LoadTimeOut;
        ParentTest = a.ParentTest;
    }
    protected void run() throws InterruptedException, Exception { 
        // ====
    }  
}
