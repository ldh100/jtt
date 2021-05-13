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
        Go_To_URL("Go to " + app_url, app_url, ParentTest, "no_lira");
            if (FAIL) { return;} 
        Get_Current_URL("Get_Current_URL" + app_url, ParentTest, "no_lira");
        //Thread.sleep(5000);
    }
}
