package Mob_Android;

/**
 *
 * @author oleg.spozito
 */
class Order extends An_GUI {
    protected Order(An_GUI a) {
        BrandID = a.BrandID;
        Mobile_ID = a.Mobile_ID;
        Mobile_PW = a.Mobile_PW;
        ad = a.ad;
        loadTimeout = a.loadTimeout;
        LoadTimeOut = a.LoadTimeOut;
        ParentTest = a.ParentTest;
    }
    protected void Run() throws InterruptedException, Exception {  
        
    }
}
