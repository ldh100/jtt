package C360;
class item_catalog extends C360_GUI{
    protected item_catalog(C360_GUI a) {
        USER_NAME = a.USER_NAME;
        USER_PW = a.USER_PW;
        url = a.url;
        d1 = a.d1;
        loadTimeout = a.loadTimeout;
        LoadTimeOut = a.LoadTimeOut;
        ParentTest = a.ParentTest;
    }
    protected void run() {   
    try { 
        EX += " - " + "\t" + " === Item Catalog " + "\t" + " ===== " + "\t" + " == Item Catalog  Begin >>" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";

        Wait_For_Element_By_Path_Presence("Wait for Menu Tree'", "xpath", "//button[@class='p-tree-toggler p-link']", ParentTest,"no_jira");
            if (FAIL) { return;}
        List_L0("Menu Tree Nodes", "xpath", "//button[@class='p-tree-toggler p-link']", ParentTest, err);
        Element_Click("Click/Expand 'Item Catalog'", L0.get(1), ParentTest, err);
            if (FAIL) { return;}
//        Page_URL("C360 Login page", ParentTest, "no_jira"); 
//        Element_By_Path_Text("Get 'Welcome' text", "xpath", "//h4[contains(text(), 'Welcome to Cafe360')]", ParentTest,"no_jira");
//        Element_By_Path_Text("Get 'Sign in..' text", "xpath", "//p[contains(text(), 'Sign in ')]", ParentTest,"no_jira");
//                         
        Element_By_Path_Click("Close Side Menu", "xpath", "//span[@class='pi pi-bars p-button-icon']", ParentTest, err);     
        
        //     to do 
        
        Element_By_Path_Click("Open Side Menu", "xpath", "//span[@class='pi pi-bars p-button-icon']", ParentTest, err);           
        EX += " - " + "\t" + " === ^ Item Catalog " + "\t" + " ===== " + "\t" + " == ^ Item Catalog End" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";  
    } catch (Exception ex){}   // =============================================  
    }
}