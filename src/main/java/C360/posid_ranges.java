package C360;

import java.util.Date;

class posid_ranges extends C360_GUI{
    protected posid_ranges(C360_GUI a) {
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
        EX += " - " + "\t" + " === POSID Ranges " + "\t" + " ===== " + "\t" + " == POSID Ranges  Begin >>" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";

        //Element_By_Selector_Click("Open Side Menu", "xpath", "//span[@class='pi pi-bars p-button-icon']", ParentTest, "no_jira");          
        Refresh("Refresh > Open Side Menu", ParentTest, "no_jira");          
        Thread.sleep(1000);
        List_L0("Navigation Nodes", "xpath", "//div[@class='p-treenode-content']", ParentTest, "no_jira");
        T_Index = -1;
        for (int i = 0; i < L0.size(); i++) {
            Element_Text("Navigation Node " + (i + 1), L0.get(i), ParentTest, "no_jira");   
            if(t.trim().startsWith("Item Catalog")){ 
                T_Index = i; 
            }
        }          
        Element_Child_Click("Click/Expand 'Item Catalog", L0.get(T_Index), "xpath", ".//button[@class='p-tree-toggler p-link']", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_Child_List_L1("'Item Catalog' navigation nodes", L0.get(T_Index), "xpath", ".//span[@class='p-treenode-label']", ParentTest, "no_jira");              
        Element_By_Selector_Click("Click > 'Item Catalog > POSID Ranges'", "xpath", "//a[@href='/item-catalog/posid-ranges']", ParentTest, "no_jira");    
             if (FAIL) { return;}           
        Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira");                   
             if (FAIL) { return;}                     
        Element_By_Selector_Click("Close Side Menu", "xpath", "//span[@class='pi pi-bars p-button-icon']", ParentTest, "no_jira");     
        Thread.sleep(500);
        

        List_L0("POSID Ranges Table Column Titles", "xpath", "//span[@class='p-column-title']", ParentTest, err);
            for (int i = 0; i < L0.size(); i++) {
                Element_Text("Column Title " + (i + 1), L0.get(i), ParentTest, "no_jira");   
            }
        // Pagination    ????
        Element_E1_Find("Find POSID Ranges Table body", "tagName", "tbody", ParentTest, "no_jira");
             if (FAIL) { return;}                     
        Element_Child_List_L1("POSID Ranges Table Rows", e1, "tagName", "tr", ParentTest, "no_jira");
            for (int i = 0; i < L1.size(); i++) {
                Element_Text("Get POSID Ranges Table Row " + (i + 1) + " concatenated text", L1.get(i), ParentTest, "no_jira");   
                if(!_All_data) { break;}
            }
            
        Element_By_Selector_Text("Find 'New POSID Range' button text", "xpath", "//button[@class='p-button p-component w-full']", ParentTest, "no_jira");
        Element_By_Selector_Click("Click 'New POSID Range' button", "xpath", "//button[@class='p-button p-component w-full']", ParentTest, "no_jira");
             if (FAIL) { return;}
        Thread.sleep(500);  
        Find_Text("Find 'Range info' text", "POSID Range Info", true, ParentTest, "no_jira");
        Find_Text("Find 'Range name' text", "Range Name", true, ParentTest, "no_jira");
        Find_Text("Find 'Concept' text", "Concept", true, ParentTest, "no_jira");   
        Element_By_Selector_Text_Enter("Enter POSID Range Name", "xpath", "//div[@id='posid-name']//input[@class='p-inputtext p-component']", "Range " + New_ID, false, ParentTest, "no_jira");


   
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
        EX += " - " + "\t" + " === ^ POSID Ranges " + "\t" + " ===== " + "\t" + " == ^ POSID Ranges End" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";  
    } catch (Exception ex){ 
        String AAA = ex.getMessage(); _t++; _f++;
        EX += " - " + "\t" + "Run() Exeption:" + "\t" + "Error:" + "\t" + AAA + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\r\n";
        try{
            Log_Html_Result("FAIL", "Error: " + AAA, false, ParentTest.createNode(_t + ". Run() Exeption: " + AAA), new Date());
        }catch(Exception eee) {};
    }   
    }
}
