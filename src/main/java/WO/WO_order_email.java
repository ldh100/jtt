package WO;

import java.util.Date;

class WO_order_email extends WO_GUI {
    protected WO_order_email(WO_GUI a) {
        url = a.url;
        d1 = a.d1;
        app = a.app;

        SITE = a.SITE;
        _Edit_item = a._Edit_item;

        loadTimeout = a.loadTimeout;
        LoadTimeOut = a.LoadTimeOut;
        ParentTest = a.ParentTest;
    }
    protected void run () { 
    try {
        

    } catch (Exception ex){
        String AAA = ex.getMessage(); _t++; _f++;
        EX += " - " + "\t" + "Run() Exeption:" + "\t" + "Error:" + "\t" + AAA + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\r\n";
        try{
            Log_Html_Result("FAIL", "Error: " + AAA, false, ParentTest.createNode(_t + ". Run() Exeption: " + AAA), new Date());
        }catch(Exception eee) {};
    } 
    }
}
