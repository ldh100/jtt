/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DL;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
import org.openqa.selenium.Keys;

/**
 *
 * @author prathyusha.deshpande
 */
public class DL_Timegraph extends DL_GUI {
// To validate the Timegraph for Primary Metrics
    protected DL_Timegraph(DL_GUI a) {
        url = a.url;
        d1 = a.d1;
        BaseAPI = a.BaseAPI;
        METRIC = a.METRIC;
        System.out.println("METRIC" + METRIC);
        DATE_RANGE = a.DATE_RANGE;
        System.out.println("BaseAPI" + BaseAPI);
        loadTimeout = a.loadTimeout;
        LoadTimeOut = a.LoadTimeOut;
        ParentTest = a.ParentTest;
    }
    double ref_val = 0;
    double cur_val = 0;
    long DA = 0L;

    public void getTimegraphdata(String id, String reference_point, String time_window) throws IOException {
        String Auth = "AT-58988-k2Kzu5SKjvYPixrNFbZn7cLevQxRSbIV";
                       

        JSONObject BODY = new JSONObject();
        BODY.put("id", id);
        BODY.put("type", "graph");
        BODY.put("reference_point", reference_point);
        
        BODY.put("time_window", time_window);
        System.out.println(BODY.toString());
        JOB_Api_Call("Timegraph Post Method ", "POST", BaseAPI + "/metrics", Auth, BODY.toString(), 200, ParentTest, "no_jira");
        System.out.println("Result" + json);
        System.out.println("Result" + json.get("body-json"));
//     System.out.println("Result" +json.get("body"));
        try {
            Map<String, Object> Response = new ObjectMapper().readValue(json.get("body-json").toString().replaceAll("\r", "").replaceAll("\n", ""), new TypeReference<Map<String, Object>>() {
            });
            //  System.out.println("Result" +Response);
//            System.out.println(((List<Map<String,Object>>)Response.get("body")).get(0));
            List<Map<String, Object>> Response2 = (List<Map<String, Object>>) ((List<Map<String, Object>>) Response.get("body")).get(0).get("graph_data");

            System.out.println("Result" + Response2.get(0));
            for (Map<String, Object> map : Response2) {
                ref_val += Double.valueOf(map.get("val_ref") + "");
                cur_val += Double.valueOf(map.get("val_cur") + "");
                _t++;
                _p++;
                EX += _t + "\t" + "Week Value" + "\t" + "Week " + map.get("week") + "\t" + "Current Value:" + map.get("val_cur") + " Reference value:" + map.get("val_ref") + "\t" + "PASS" + "\t" + " - "
                        + "\t" + String.format("%.2f", (double) (sw1.elapsed(TimeUnit.MILLISECONDS)) / (long) (1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
                Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName(), false, ParentTest.createNode("Week Value"));

            }
            System.out.println("Total Current Value:" + cur_val);
            System.out.println("Total Reference Value:" + ref_val);
            System.out.println("ABSOLUTE % CHANGE:" + (cur_val - ref_val) / ref_val * 100);
        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void run(String reference_point, String CompareTo) throws IOException, Exception {
        double TS = 0.0;

        String id = MetricName(METRIC);
        DA = (long) cur_val;
        String time_window = TimeFrame(DATE_RANGE);
        UnCheckMetrics();
        if (METRIC.equalsIgnoreCase("Program Earned Revenue") || METRIC.equalsIgnoreCase("Program Rate of Return") || METRIC.equalsIgnoreCase("Program Strength of Program")) {

            Scroll_to_WebElement("Select Metric '" + METRIC + "'", "xpath", "//span[text()='" + METRIC + "']", ParentTest, "no_jira");

        }

        Element_By_Path_Click("Select Metric '" + METRIC + "'", "xpath", "//span[text()='" + METRIC + "']", ParentTest, "no_jira");
        if (FAIL) {
            return;
        }
        Scroll_to_WebElement("Scroll to 'Apply' button", "xpath", "//button/span[contains(.,'Apply')]", ParentTest, "no_jira");
        if (FAIL) {
            return;
        }
        Element_By_Path_Click("Click on 'Apply' button", "xpath", "//button/span[contains(.,'Apply')]", ParentTest, "no_jira");
        if (FAIL) {
            return;
        }

        Thread.sleep(500);
        Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira");
        if (FAIL) {
            return;
        }
        Thread.sleep(500);

        Element_By_Path_Click("Select Date Range " + DATE_RANGE, "xpath", "//span[text()='" + DATE_RANGE + "']", ParentTest, "no_jira");
        if (FAIL) {
            return;
        }

        Thread.sleep(5000);

        Element_By_Path_Click("Open TS 'Compare to' dropdown", "xpath", "//div[starts-with(@class,'MuiCardContent-root jss')]//*[contains(.,'" + METRIC + "')]/../..//div[starts-with(@class,'MuiSelect-root MuiSelect-select')]", ParentTest, "no_jira");
        if (FAIL) {
            return;
        }
        Thread.sleep(2000);
        Element_By_Path_Click("Select '" + CompareTo + "'", "xpath", "//ul/li[contains(.,'" + CompareTo + "')]", ParentTest, "no_jira");
        if (FAIL) {
            return;
        }
        Thread.sleep(5000);
        Element_By_Path_Text("Get '" + METRIC + "' Value", "xpath", "//div[starts-with(@class,'MuiCardContent-root jss')]//*[contains(.,'" + METRIC + "')]/..//div[2]/div[1]/p", ParentTest, "no_jira");
        if (FAIL) {
            return;
        }
        DA = Long.parseLong(t.replace("$", "").replace(",", "").replace("%", "").replace("(", "").replace(")", ""));

        Thread.sleep(5000);
        Element_By_Path_Text("Get '" + METRIC + "' Value", "xpath", "//div[starts-with(@class,'MuiCardContent-root jss')]//*[contains(.,'" + METRIC + "')]/..//div/div[2]/p[1]", ParentTest, "no_jira");
        if (FAIL) {
            return;
        }

        TS = Double.parseDouble(t.replace("%", "").replace("arrow_drop_up", "").replace("arrow_drop_down", ""));
        getTimegraphdata(id, reference_point, time_window);
        AbsoluteChange_Calculation("Absoulte Change % Calculation", cur_val, ref_val, TS, ParentTest, "no_jira");
        DollarAmount_Calculation("Dollar Amount Calculation", cur_val, DA, ParentTest, "no_jira");

    }

    public void UnCheckMetrics() {
        try {
            Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira");
            if (FAIL) {
                return;
            }
            Thread.sleep(500);

            Wait_For_Element_By_Path_Presence("Wait for Side bar arrow", "xpath", "//span[contains(text(),'arrow_right')]", ParentTest, "no_jira");
            if (FAIL) {
                return;
            }
            Element_By_Path_Text("Get Side bar arrow text/direction", "xpath", "//span[contains(text(),'arrow_right')]", ParentTest, "no_jira");
            if (FAIL) {
                return;
            }
            if (t.equalsIgnoreCase("arrow_right")) {
                Element_By_Path_Click("Click 'arrow_right' > Expand the Side bar'", "xpath", "//span[contains(text(),'arrow_right')]", ParentTest, "no_jira");
                if (FAIL) {
                    return;
                }
            }
            Thread.sleep(500);
            List_L0("Get User Metrics Count", "xpath", "//div[@class='MuiListItemIcon-root']", ParentTest, "no_jira");
            if (FAIL) {
                return;
            }
            if (L0.isEmpty()) {
                return;  // No User Metrics Found FATAL ===================================================
            }
            List_L0("Get Selected Metrics Count", "xpath", "//span[contains(@class, ' Mui-checked ')]", ParentTest, "no_jira");
            if (FAIL) {
                return;
            }
            for (int j = 0; j < L0.size(); j++) {
                Thread.sleep(500);
                Element_Click("Un-Check Selected Metrics " + (j + 1), L0.get(j), ParentTest, "no_jira");
            }
        }
        catch (Exception ex) {
        }   // =============================================  
    }

    public String TimeFrame(String DR) {
        switch (DR) {
            case "Last 4 weeks":
                return "L4";
            case "Last 12 weeks":
                return "L12";
            case "Last 52 weeks":
                return "L52";
            case "Calendar YTD":
                return "CYTD";
            case "Foodbuy YTD":
                return "CFYTD";
        }

        return null;

    }

    public String MetricName(String Metric) {
        switch (Metric) {
            case "Total Spend":
                return "T-TS";
            case "Contracted Spend":
                return "T-CS";
            case "Contracted Utilization Rate":
                return "T-CUR";
            case "Member Earned Revenue":
                return "T-MER";
            case "Member Rate of Return":
                return "T-MROR";
            case "Member Strength of Program":
                return "T-MSOP";
            case "Customer Earned Revenue":
                return "T-CER";
            case "Customer Rate of Return":
                return "T-CROR";
            case "Customer Strength of Program":
                return "T-CSOP";
            case "Program Earned Revenue":
                return "T-PER";
            case "Program Rate of Return":
                return "T-PROR";
            case "Program Strength of Program":
                return "T-PSOP";
        }

        return null;

    }

}
