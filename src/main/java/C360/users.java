package C360;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.concurrent.TimeUnit;

class users extends C360_GUI{
    protected users(C360_GUI a) {
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
        Element_Child_List_L1("Nodes under 'User Management'", L0.get(T_Index), "xpath", ".//span[@class='p-treenode-label']", ParentTest, "no_jira");              
        Element_By_Selector_Click("Click > 'User Management > Users'", "xpath", "//a[@href='/user-management/users']", ParentTest, "no_jira"); 
            if (FAIL) { return;}           
        Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira");                   
            if (FAIL) { return;}
        Element_By_Selector_Click("Close Side Menu", "xpath", "//span[@class='pi pi-bars p-button-icon']", ParentTest, "no_jira");
            if (FAIL) { return;}
        Thread.sleep(500);

        List_L0("User Table Column Titles", "xpath", "//span[@class='p-column-title']", ParentTest, "no_jira");
            for (int i = 0; i < L0.size(); i++) {
                Element_Text("Column Title " + (i + 1), L0.get(i), ParentTest, "no_jira");   
            }

        // Pagination    ????
        Element_E1_Find("Find User Table body", "tagName", "tbody", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_Child_List_L1("List User Table Rows", e1, "tagName", "tr", ParentTest, "no_jira");
            if (FAIL) { return;}
        int Missing_user_data = 0; 
        for (int i = 0; i < L1.size(); i++) {
            //Element_Text("Get Users Table Row " + (i + 1) + " concatenated text", L1.get(i), ParentTest, "no_jira"); 
            Element_Child_List_L2("List User Table row " + (i + 1) + " data columns", L1.get(i), "tagName", "td", ParentTest, "no_jira");
                if (FAIL) { return;} 
            for (int j = 0; j < L0.size(); j++) {
                Element_Text("User Table row " + (i + 1) + " - Column " + (j + 1) + " text", L2.get(j), ParentTest, "no_jira");
                if(t.trim().isEmpty()){
                    Missing_user_data++;
                }
            }
            if(!_All_data) { 
                break;
            }
        } 
        if(Missing_user_data > 0){
            _i++; _w++; 
            EX += _t + "\t" + "User Table - Empty Data" + "\t" + "Current page" + "\t" + Missing_user_data + " empty cells" + "\t" + "WARN" + "\t" + " - " + "\t" + " - " + "\r\n";    
            Log_Html_Result("WARN", "Current page > " + Missing_user_data + " empty cells", true, ParentTest.createNode(_t + ". " + "User Table - Empty Data"), new Date());
        }
        Element_Click("Open User details pade - 1st in the Users table", L1.get(0), ParentTest, "no_jira");
        Find_Text("Check 'Email' is present", "Email", true, ParentTest, "no_jira");
        Find_Text("Check 'User Info' is present", "User Info", true, ParentTest, "no_jira");
        Find_Text("Check 'Name' is present", "Name", true, ParentTest, "no_jira");
        Find_Text("Check 'Job Title' is present", "Job Title", true, ParentTest, "no_jira");
        Find_Text("Check 'Company' is present", "Company", true, ParentTest, "no_jira");
        Find_Text("Check 'Department' is present", "Department", true, ParentTest, "no_jira");
        Find_Text("Check 'Username' is present", "Username", true, ParentTest, "no_jira");
        Find_Text("Check 'Telephone' is present", "Telephone", true, ParentTest, "no_jira");
        Navigate_Back("Browser > Navigate back", "User Details", "Users Table", ParentTest, "no_jira");
 
        Element_By_Selector_Text("Find 'New User' button text", "xpath", "//button[@class='p-button p-component w-full']", ParentTest, "no_jira"); 
        Element_By_Selector_Click("Click 'New User' button", "xpath", "//button[@class='p-button p-component w-full']", ParentTest, "no_jira");
             if (FAIL) { return;}
        Thread.sleep(500);  
        Element_E1_Find("Find 'Header Bar'", "id", "header-bar", ParentTest, "no_jira"); 
             if (FAIL) { return;} // ======================== e1 to be used later, do not re-define ======================
        Element_Child_Text("Find 'Header Bar' Title text", e1, "xpath", ".//h6[@class='ml-3 md:mr-4 md:ml-4']", ParentTest, "no_jira");
        Element_Child_Text("Find 'Header Bar > Discard' text", e1, "xpath", ".//span[text()='Discard']", ParentTest, "no_jira");
        Element_Child_Text("Find 'Header Bar > Save' text", e1, "xpath", ".//span[text()='Save']", ParentTest, "no_jira");            
        
        Element_By_Selector_Text("Find 'Enter Email Prompt' text", "xpath", "//div[@class='p-card-title']", ParentTest, "no_jira");         
        Element_By_Selector_Text_Enter("Enter Invalid Email", "xpath", "//input[@placeholder='Search Email']", "abc", false, ParentTest, "no_jira"); 
        Click_out_of_Element("Click below the 'Header Bar' - activate email check", e1, "DOWN", 0, 4, ParentTest, "no_jira");
             if (FAIL) { return;}        
        Element_By_Selector_Text("Find 'Enter Email error' text", "xpath", "//span[@class='caption']", ParentTest, "no_jira"); 
        
        Element_By_Selector_Input_Select_Clear("Clear invalid Email", "xpath", "//input[@placeholder='Search Email']", ParentTest, "no_jira"); 
        Element_By_Selector_Text_Enter("Enter Valid Email", "xpath", "//input[@placeholder='Search Email']", "a@b.com", false, ParentTest, "no_jira"); 
        
        Element_Child_Click("Click 'Discard' button", e1, "xpath", ".//span[text()='Discard']/ancestor::button", ParentTest, "no_jira");
             if (FAIL) { return;}
        Element_By_Selector_Text("Find 'Dialog Header' text", "xpath", "//span[@class='p-dialog-title']", ParentTest, "no_jira"); 
        Element_By_Selector_Text("Find 'Dialog Message' text", "xpath", "//span[@class='p-confirm-dialog-message']", ParentTest, "no_jira"); 
        Element_By_Selector_Text("Find 'Dialog Reject' text", "xpath", "//button[@class='p-button p-component p-confirm-dialog-reject p-button-text']", ParentTest, "no_jira"); 
        Element_By_Selector_Text("Find 'Dialog Accept' text", "xpath", "//button[@class='p-button p-component p-confirm-dialog-accept']", ParentTest, "no_jira");  
        Element_By_Selector_Click("Click 'Discard' Confirm button", "xpath", "//button[@class='p-button p-component p-confirm-dialog-accept']", ParentTest, "no_jira");
        Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira");                   
             if (FAIL) { return;}    
        Thread.sleep(500);      
        
        EX += " - " + "\t" + " === ^ User Management  " + "\t" + " ===== " + "\t" + " == ^ User Management End" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";  
    } catch (Exception ex){
        String AAA = ex.getMessage();
        EX += " - " + "\t" + "Run() Exeption:" + "\t" + "Run Exeption:" + "\t" + "Not Found" + "\t" + "FAIL" + "\t" + AAA + "\t" + " - " + "\r\n";
        try{
            Log_Html_Result("FAIL", "Error: " + AAA, false, ParentTest.createNode(_t + ". Run() Exeption: " + AAA), new Date());
        }catch(Exception eee) {};
    }   
    }
}
