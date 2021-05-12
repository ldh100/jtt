package Mob_Android;

class Chrome_C360 extends An_GUI {
    protected Chrome_C360(An_GUI a) {
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
