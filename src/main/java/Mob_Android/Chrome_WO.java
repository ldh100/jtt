package Mob_Android;
/**
 *
 * @author Oleg.Spozito
 */
class Chrome_WO extends An_GUI{
    protected Chrome_WO(An_GUI a) {
       Bolter_ID = a.Bolter_ID;
       Bolter_PW = a.Bolter_PW;
       ad = a.ad;
       app_url = a.app_url;
       loadTimeout = a.loadTimeout;
       LoadTimeOut = a.LoadTimeOut;
       ParentTest = a.ParentTest;
    }

    protected void Run() throws InterruptedException, Exception{   
        ad.get(app_url);
        Thread.sleep(5000);
    }
}

