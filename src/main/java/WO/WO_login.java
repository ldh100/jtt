/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WO;
import A.T;
import static A.A.*;

import static WO.WO.*;

/**
 *
 * @author Oleg.Spozito
 */
public class WO_login {
    public static void run() throws InterruptedException {     
        _t++; Thread.sleep((long) sleep); T.Navigate_to_URL("Navigate to", url,"no_jira");             
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); T.Page_URL("Login page", "no_jira");             
            if (FAIL) { return;}
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> eb1c55aa8c6dfaf56b6ab36781ef708d40bb55eb
            
    
//
//        String URL = "https://api.compassdigital.org/dev/config/eW0gy25y3BFaYvgPlYgmf5X3mJ9qZKulk9Q5jya2c2gw4W4JZZC126B0q82EsA81Mw0MoNURYeq?nocache=1";
//        String token = "eyJhbGciOiJLTVMiLCJ0eXAiOiJKV1QifQ.eyJzdWIiOiJxNFhBTmdYNTBESUJKakRZTEVBT2ZvREttNzNLNVFJQWdHN1FOME9nSU5HakIxUlBKWnRxUUVPRW93UVBoOThSN1gwUnFOSVlYd0xHV3pEZ1RNb29vZEtLOSIsInNjb3BlcyI6Iio6KiIsImlhdCI6MTYxMDA0MjY0NywiZXhwIjoxNjE3ODE4NjQ4fQ.AQICAHg3B+yaImOx8iePCmKXjUT1mJ+gyTV+zezNpAJjOkZbFgHuyPYtfRmCUpemQkSDZPKuAAABUTCCAU0GCSqGSIb3DQEHBqCCAT4wggE6AgEAMIIBMwYJKoZIhvcNAQcBMB4GCWCGSAFlAwQBLjARBAz0IDjTCq2Y1MTDNfsCARCAggEEBuQmA4MZgFyxT4ESzFWpD8vHnZl/TCsCRQVEaHjOzN1q3tmKA6rLj0/qItaz4P9KJkssf/D6JfQjbAmGTYQ6kK21LxDkSiYnPfBk2CYXIruFyzpXtTlZF04bCEN7MLtnT7dTqnC0upg4dGnQDWG90RcGATYIJzexk7Jr11V7wCQCEvUWiZEPcwbyObOSW7+pPIfIZAnnUBhLoo6nKB+z24jl1sKX6IYrlPp0b54Jg7Rc6njh0dlNXpvWXx7OZhaBAM+JUzePBwWwWLYxQ+83QzXyzGUw8vr/P2MgZ7/Iudv5GHzziwYWYc3i2zku8CLH/h8tFXtLQr8aicGGaM1pahsZMMs=";     
//        CloseableHttpClient httpclient = HttpClients.createDefault();
//
//        HttpGet httpGet = new HttpGet(URL);
//        CloseableHttpResponse response = null;
//
//        httpGet.setHeader(HttpHeaders.CONTENT_TYPE, "application/json");
//        httpGet.setHeader(HttpHeaders.AUTHORIZATION, "Bearer " + token);
//
//        try {
//            response = httpclient.execute(httpGet);
//            if (response.getStatusLine().getStatusCode() == 200) {
//                //请求体内容
//                String content = EntityUtils.toString(response.getEntity(), "UTF-8");
//                //内容写入文件
//
//                System.out.println("内容长度：" + content.length());
//                System.out.println(content);
//                response.close(); 
//                    httpclient.close();
//            }
//        }
//        
//        catch (IOException ex) {
//            Logger.getLogger(WO_login.class.getName()).log(Level.SEVERE, null, ex);
//        }
    


            
<<<<<<< HEAD
=======
=======
>>>>>>> master
>>>>>>> eb1c55aa8c6dfaf56b6ab36781ef708d40bb55eb
        _t++; T.Element_By_Path_Attribute("Thrive Image URL", "xpath", "//div[@class='v-image__image v-image__image--cover']", "style", "no_jira");
            //if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text("Find 'card-header' text", "xpath", "//p[@class='card-header']", "no_jira"); 
            //if (FAIL) { return;}            
        _t++; Thread.sleep((long) sleep); T.Find_Text("Find 'Enter Location' text", "Enter Your Thrive Location", true,"no_jira"); 
            //if (FAIL) { return;}            
        _t++; Thread.sleep((long) sleep); T.Find_Text("Find 'Login' text", "Login", true,"no_jira"); 
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Click 'Login'", "xpath", "//*[text()='Login']", "no_jira"); 
            if (FAIL) { return;}             
        Thread.sleep(500);   
        _t++; T.Element_E1_Find("Find 'Login' dialog", "xpath", "//div[@class='v-dialog v-dialog--active']", "no_jira");
            if (FAIL) { return;} 
        _t++; T.Element_Child_Text("Find 'Login' dialog Title", e1, "xpath", ".//div[@class='v-card__title form-title']", "no_jira");               
        _t++; T.Element_Child_Text("Find 'Login' dialog Text", e1, "xpath", ".//div[@class='v-card__text']", "no_jira"); 
        _t++; T.Find_Text("Find 'Need ..?' text", "Need an account?", true,"no_jira");                
        _t++; T.Element_By_Path_Text("Find 'switch-form-text > Sign-in' text", "xpath", "//p[@class='switch-form-text']", "no_jira"); 
        _t++; T.Find_Text("Find 'Forgot password..' text", "Forgot you password?", true, "no_jira"); 

        _t++; T.Element_Child_List_L1("Login Text Slot(s) Count", e1,"xpath", ".//div[@class='v-text-field__slot']", "no_jira");             
            if (FAIL) { return;}          
        _t++; T.Element_Child_Text("Input 'Email' label", L1.get(0), "tagName" , "label", "no_jira"); 
            //if (FAIL) { return;}
        _t++; T.Element_Child_Text("Input 'Pssword' label", L1.get(1), "tagName" , "label", "no_jira"); 
            //if (FAIL) { return;}

        if(NEW_USER) {
            
<<<<<<< HEAD
// Larry's code goes here
    //test Create new user
=======
<<<<<<< HEAD
// Larry's code goes here
    //test Create new user
=======
            // Larry's code goes here
             //test Create new user
>>>>>>> master
>>>>>>> eb1c55aa8c6dfaf56b6ab36781ef708d40bb55eb
    //  Open modal        
        // _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Click 'Login'", "xpath", "//*[text()='Login']", "no_jira"); 
        //    if (FAIL) { return;}             
        // _t++; T.Element_E1_Find("Find 'Login' dialog", "xpath", "//html/body/div/div/div[3]/div/div/div", "no_jira");
        //   if (FAIL) { return;} 
        //  Thread.sleep(500);      
        _t++; T.Element_By_Path_Text("Find 'switch-form-text > Sign-in' text", "xpath", "//p[@class='switch-form-text']", "no_jira");
        
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Sign up btn click  ", "xpath", "//p[text()='Sign Up']", "no_jira");
            if (FAIL) { return;}
        _t++; T.Element_E1_Find("Find 'sign up' dialog", "xpath", "(//div[contains(@class,'pa-5 v-card')])[2]", "no_jira");
            if (FAIL) { return;} 
    //  verify modal 
        _t++; T.Element_Child_Text("Find 'Sign Up ' dialog Title", e1, "xpath", ".//div[@class='v-card__title form-title']", "no_jira");               
        _t++; T.Element_Child_Text("Find 'Sign UP ' dialog Sub Title Text", e1, "xpath", ".//div[@class='v-card__text']", "no_jira"); 
        _t++; T.Find_Text("Find 'Subscription '  Title ", "Get the most", true, "no_jira"); 
        _t++; T.Find_Text("Find 'Subscription '  Text  ", "We're like that friend who ", true, "no_jira");
        _t++; T.Find_Text("Find 'Already have.....' text","Already have a", true, "no_jira");//div[contains(@class,'row mt-8')]//p
        _t++; T.Element_By_Path_Text("Find 'switch-form-text > Sign-in' text", "xpath", "//p[@class='mt-1 switch-form-text']", "no_jira");
    //  Verify input Label 
        _t++; T.Element_Child_List_L1("Login Text Slot(s) Count", e1,"xpath", ".//div[@class='v-text-field__slot']", "no_jira");             
            if (FAIL) { return;}  
        _t++; T.Element_Child_Text("Input 'First Name' label", L1.get(0), "tagName" , "label", "no_jira");          
        _t++; T.Element_Child_Text("Input 'Last Name ' label", L1.get(1), "tagName" , "label", "no_jira"); 
        _t++; T.Element_Child_Text("Input 'Email' label", L1.get(2), "tagName" , "label", "no_jira");          
        _t++; T.Element_Child_Text("Input 'Phone Number' label", L1.get(3), "tagName" , "label", "no_jira"); 
        _t++; T.Element_Child_Text("Input 'Password' label", L1.get(4), "tagName" , "label", "no_jira");   
    //  Verify all input field
        _t++; T.Element_Child_Click("Click 'First Name' input", L1.get(0), "id" , "input-94", "no_jira"); 
        _t++; T.Element_Child_Text_Enter("Enter Valid First Name", L1.get(0), "id" , "input-94", "WebTest", false, "no_jira");
            if (FAIL) { return;} 
        _t++; T.Element_Child_Click("Click 'Last Name' input", L1.get(1), "id" , "input-97", "no_jira"); 
        _t++; T.Element_Child_Text_Enter("Enter Valid Last Name", L1.get(1), "id" , "input-97", "Automation", false, "no_jira");
            if (FAIL) { return;} 
        _t++; T.Element_Child_Click("Click 'Email' input", L1.get(2), "id" , "input-100", "no_jira"); 
        String emailAassembly = "W.A."+New_ID+"@mailsac.com"; 
        _t++; T.Element_Child_Text_Enter("Enter Valid Email", L1.get(2), "id" , "input-100", emailAassembly, false, "no_jira");
            if (FAIL) { return;}     
        _t++; T.Element_Child_Click("Click 'Phone Number' input", L1.get(3), "id" , "input-103", "no_jira"); 
        _t++; T.Element_Child_Text_Enter("Enter Valid Phone Number", L1.get(3), "id" , "input-103", "6470009999", false, "no_jira");
            if (FAIL) { return;} 
        _t++; T.Element_Child_Click("Click 'Passsword' input", L1.get(4), "id" , "input-106", "no_jira"); 
        String password = "Abcd1234";
        _t++; T.Element_Child_Text_Enter("Enter Valid Password", L1.get(4), "id" , "input-106", password, true, "no_jira");
            if (FAIL) { return;} 
            
        _t++; T.Clickable_Element_By_Path_Click("Click BTN 'Create Account'", "xpath", "(//button[@type='button'])[11]", "No Jira");
             if (FAIL) { return;} 
        _t++; Thread.sleep((long) sleep); T.Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", "no_jira");                                                                                     
            if (FAIL) { return;}
        Thread.sleep(500);         
           CredentialResposistory crt = new CredentialResposistory();
           crt.insertRows(emailAassembly,password); 
           
//Larry's code complete
            
        }else{
            _t++; T.Element_Child_Click("Click 'Email' input", L1.get(0), "tagName" , "input", "no_jira"); 
                if (FAIL) { return;}  
            // Add Invalid Email/PW testing flow   // =================================
            _t++; T.Element_Child_Text_Enter("Enter Valid Email", L1.get(0), "tagName" , "input", USER_ID, false, "no_jira"); 
                if (FAIL) { return;}            
            _t++; T.Element_Child_Click("Click 'Pssword' input", L1.get(1), "tagName" , "input", "no_jira"); 
                if (FAIL) { return;}  
            _t++; T.Element_Child_Text_Enter("Enter Valid Pssword", L1.get(1), "tagName" , "input",USER_PW, true,"no_jira"); 
                if (FAIL) { return;} 
            Thread.sleep(500); 
            _t++; Thread.sleep((long) sleep); T.Clickable_Element_By_Path_Click("Click 'Un-hide Password'", "css", "[aria-label='append icon']", "no_jira"); 
                if (FAIL) { return;}        

    //        _t++; Thread.sleep((long) sleep); T.Element_Child_Click("Click LOGIN", e1,"xpath", ".//button[@class='v-btn v-btn--contained theme--light v-size--default turquoise']", "no_jira");             
    //            if (FAIL) { return;} // =========================    Staging Blue ^^^^^
            _t++; Thread.sleep((long) sleep); T.Element_Child_Click("Click 'LOGIN'", e1,"xpath", ".//button[contains(@class, 'v-btn v-btn--contained theme--light v-size--default')]", "no_jira");             
                if (FAIL) { return;} // =========================    Development Red ^^^^^
        }
            
        Thread.sleep(500); 
        _t++; Thread.sleep((long) sleep); T.Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", "no_jira");                                                                                     
            if (FAIL) { return;}     
        _t++; Thread.sleep((long) sleep); T.Element_E1_Find("Find Toolbar element", "xpath", "//div[@class='v-toolbar__content']", "no_jira");
            if (FAIL) { return;}           
        _t++; Thread.sleep((long) sleep); T.Element_Child_Click("Click 'Account' Button", e1, "xpath", ".//i[@class='v-icon notranslate mdi mdi-account-circle theme--light']", "no_jira");                                     
            if (FAIL) { return;} 
            
            
            
            
            
        _t++; Thread.sleep((long) sleep); T.Clickable_Element_By_Path_Click("Click 'Account Settings'", "xpath", ".//*[text()='Account Settings']", "no_jira");                                     
            if (FAIL) { return;}   
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text("Title text", "xpath", ".//h1[@class='header']", "no_jira");
            if (FAIL) { return;}  
        //try to get User Email   
        
        
        
        
        _t++; Thread.sleep((long) sleep); T.Navigate_Back("Navigate Back", SITE + "Account Settings","Previous page (???)", "no_jira");
            if (FAIL) { return;}              
            
    }
}
