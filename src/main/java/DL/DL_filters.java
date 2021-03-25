package DL;
import A.TWeb;
import static A.A.*;
import static DL.DL.*;
import static DL.DL_metric_data.get_Text;
import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;
/**
 *
 * @author Oleg.Spozito
 */
public class DL_filters {
    public static void run() throws InterruptedException {     
       Thread.sleep(10000);
           for (int i = 1; i < 9; i++) {
           _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Select checkbox whose index is set to - "+i, "xpath", "(//div[@class='MuiListItemIcon-root']/span/span/input)[position()="+i+"]", "no_jira"); 
            if (FAIL) { return;} 
            Thread.sleep(6000);
           _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text("get the 'Total Spend' amount ", "xpath", "(//div[starts-with(@class,'MuiCardContent-root jss')]/div[2]/div[1]/p)[position()="+i+"]", "no_jira");
            if (FAIL) { return;}
           _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text("get the 'Dollar' amount ", "xpath", "(//div[starts-with(@class,'MuiCardContent-root jss')]/div[2]/div[2]/p)[position()="+i+"]", "no_jira");
           if (FAIL) { return;}
		}

        //verify whether 9th check box is disabled or not by selecting it
        _t++; TWeb.Element_By_Path_Attribute("Checkbox should be disabled when metric exceeds 8", "xpath", "(//div[@class='MuiListItemIcon-root']/span/span/input)[position()=9]", "disabled","no_jira");
        	if (FAIL) { return;}
        
        Configure();
        
        for (int i = 1; i < 9; i++) {
        	_t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text("get the 'Total Spend' amount ", "xpath", "(//div[starts-with(@class,'MuiCardContent-root jss')]/div[2]/div[1]/p)[position()="+i+"]", "no_jira");
           	if (FAIL) { return;}
                System.out.println(get_Text(t));
           	_t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text("get the 'Dollar' amount ", "xpath", "(//div[starts-with(@class,'MuiCardContent-root jss')]/div[2]/div[2]/p)[position()="+i+"]", "no_jira");
           	if (FAIL) { return;}
           	System.out.println(get_Text(t));
        }
        
      }
    
    public static void Configure() throws InterruptedException {
		_t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Cick on configure filters", "xpath", "//button[contains(.,' Configure Filters')]", "no_jira"); 
        if (FAIL) { return;}
        
        Thread.sleep(6000);
        //*****************Division*****************
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Cick on first dropdown menu", "xpath", "(//div[contains(@class,'indicatorContainer')])[position()=3]", "no_jira"); 
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("choose 'Division Name' from the dropdown box", "xpath", "//*[contains(text(), 'Division')]", "no_jira"); 
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Select 1st item from the list box", "xpath", "//div[@role='dialog']//div[starts-with(@class,'jss')]/div/div[1]/div[1]", "no_jira"); 
       if (FAIL) { return;}
        //****************Sector***********************
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Cick on first dropdown menu", "xpath", "(//div[contains(@class,'indicatorContainer')])[position()=3]", "no_jira"); 
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("choose 'Sector Name' from the dropdown box", "xpath", "//*[contains(text(), 'Sector')]", "no_jira"); 
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Select 1st item from the list box", "xpath", "//div[@role='dialog']//div[starts-with(@class,'jss')]/div/div[1]/div[1]", "no_jira"); 
        if (FAIL) { return;}
        //*********************District***********************
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Cick on first dropdown menu", "xpath", "(//div[contains(@class,'indicatorContainer')])[position()=3]", "no_jira"); 
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("choose 'District Name' from the dropdown box", "xpath", "//*[contains(text(), 'District')]", "no_jira"); 
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Select 2nd item from the list box", "xpath", "//div[@role='dialog']//div[starts-with(@class,'jss')]/div/div[2]/div[1]", "no_jira"); 
        if (FAIL) { return;}
        //***********************Region**************************************
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Cick on first dropdown menu", "xpath", "(//div[contains(@class,'indicatorContainer')])[position()=3]", "no_jira"); 
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("choose 'Region Name' from the dropdown box", "xpath", "//*[contains(text(), 'Region')]", "no_jira"); 
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Select 1st item from the list box", "xpath", "//div[@role='dialog']//div[starts-with(@class,'jss')]/div/div[1]/div[1]", "no_jira"); 
        if (FAIL) { return;}
        Thread.sleep(6000);
        //***********************Products/Item Categories***************************
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Cick on Products/Item Categories tab", "xpath", "//span[contains(text(),'Products/Item Categories')]", "no_jira"); 
        if (FAIL) { return;}
        Thread.sleep(6000);
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click on dropdown menu", "xpath", "(//div[contains(@class,'indicatorContainer')]/*[name()='svg'])[position()=2]", "no_jira"); 
        if (FAIL) { return;}
        Thread.sleep(2000);
        _t++; Thread.sleep((long) sleep); TWeb.Scroll_to_WebElement("Scroll to apply dropdown",  "xpath", "//span[contains(.,'Apply')]", "no_jira");
   	if (FAIL) { return;}
   	_t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Cick on Apply button", "xpath", "//span[contains(.,'Apply')]", "no_jira"); 
        if (FAIL) { return;}
        Thread.sleep(10000);
    }
    
    public static String get_Text(String str) {
    	for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '$') str = str.replace(String.valueOf(str.charAt(i)), "");
            if (str.charAt(i) == ',') str = str.replace(String.valueOf(str.charAt(i)), "");
            if (str.charAt(i) == '(') str = str.replace(String.valueOf(str.charAt(i)), "");
            if (str.charAt(i) == ')') str = str.replace(String.valueOf(str.charAt(i)), "");
            if (str.charAt(i) == '%') str = str.replace(String.valueOf(str.charAt(i)), "");
	}
    	//System.out.println("final str "+str);
    	return str;
    }
    
    
           }
