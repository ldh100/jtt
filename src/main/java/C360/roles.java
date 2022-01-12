package C360;
class roles extends C360_GUI{
    protected roles(C360_GUI a) {
        USER_NAME = a.USER_NAME;
        USER_PW = a.USER_PW;
        url = a.url;
        d1 = a.d1;
        loadTimeout = a.loadTimeout;
        LoadTimeOut = a.LoadTimeOut;
        ParentTest = a.ParentTest;
        _All_data = a._All_data;        
        New_ID = a.New_ID;
    }
    protected void run() {   
    try { 
        EX += " - " + "\t" + " === User Management " + "\t" + " ===== " + "\t" + " == User Management   Begin >>" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
        
        //Element_By_Selector_Click("Open Side Menu", "xpath", "//span[@class='pi pi-bars p-button-icon']", ParentTest, "no_jira");          
        Refresh("Refresh > Open Side Menu", ParentTest, "no_jira");          
        Thread.sleep(1000);
        List_L0("Navigation Nodes", "xpath", "//div[@class='p-treenode-content']", ParentTest, err);
        T_Index = -1;
        for (int i = 0; i < L0.size(); i++) {
            Element_Text("Navigation Node " + (i + 1), L0.get(i), ParentTest, "no_jira");   
            if(t.trim().startsWith("User Management")){ 
                T_Index = i; 
            }
        } 
        Element_Child_Click("Click/Expand 'User Management'", L0.get(T_Index), "xpath", ".//button[@class='p-tree-toggler p-link']",ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_Child_List_L1("'User Management' navigation nodes", L0.get(T_Index), "xpath", ".//span[@class='p-treenode-label']", ParentTest, "no_jira");              
        
        Find_Text("Find Navigation node 'Roles'", "Users", true, ParentTest, "no_jira"); 
        Element_By_Selector_Click("Click > 'User Management > Roles'", "xpath", "//a[@href='/user-management/roles']", ParentTest, "no_jira");    
             if (FAIL) { return;}           
        Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira");                   
             if (FAIL) { return;}
        Element_By_Selector_Click("Close Side Menu", "xpath", "//span[@class='pi pi-bars p-button-icon']", ParentTest, "no_jira");
             if (FAIL) { return;}
        Thread.sleep(500);
        
        
        List_L0("Roles Table Column Titles", "xpath", "//span[@class='p-column-title']", ParentTest, "no_jira");
            for (int i = 0; i < L0.size(); i++) {
                Element_Text("Roles Table Column Title " + (i + 1), L0.get(i), ParentTest, "no_jira");   
            }
        // Pagination    ????
        Element_E1_Find("Find Roles Table body", "tagName", "tbody", ParentTest, "no_jira");
        Element_Child_List_L1("Roles Table Rows", e1, "tagName", "tr", ParentTest, "no_jira");
            for (int i = 0; i < L1.size(); i++) {
                Element_Text("Get Roles Table Row " + (i + 1) + " concatenated text", L1.get(i), ParentTest, "no_jira"); 
                if(!_All_data) { break;}
            }  
            
        Element_By_Selector_Text("Find 'New User' button text", "xpath", "//button[@class='p-button p-component w-full']", ParentTest, "no_jira"); 
        Element_By_Selector_Click("Click 'New User' button", "xpath", "//button[@class='p-button p-component w-full']", ParentTest, "no_jira");
             if (FAIL) { return;}
        Thread.sleep(500);        
        Element_E1_Find("Find 'Header Bar'", "id", "header-bar", ParentTest, "no_jira"); 
             if (FAIL) { return;} // ======================== E1 to be used later ======================
        Element_Child_Text("Find 'Header Bar' Title text", e1, "xpath", ".//h6[@class='ml-3 md:mr-4 md:ml-4']", ParentTest, "no_jira");
        Element_Child_Text("Find 'Header Bar > Discard' text", e1, "xpath", ".//span[text()='Discard']", ParentTest, "no_jira");
        Element_Child_Text("Find 'Header Bar > Save' text", e1, "xpath", ".//span[text()='Save']", ParentTest, "no_jira");
        
        
        Element_Child_Click("Click 'Discard' button", e1, "xpath", ".//span[text()='Discard']/ancestor::button", ParentTest, "no_jira");
             if (FAIL) { return;}
        Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira");                   
             if (FAIL) { return;}   
        Thread.sleep(500);      
        
        EX += " - " + "\t" + " === ^ User Management  " + "\t" + " ===== " + "\t" + " == ^ User Management End" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";  
    } catch (Exception ex){}   // =============================================  
    }
}
