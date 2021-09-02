package API;

import org.json.JSONArray;
import org.json.JSONObject;

class shoppingcart extends API_GUI{
    protected shoppingcart(API_GUI a) {
        app = a.app;
        env = a.env;
        BaseAPI = a.BaseAPI;
        Mobile_User_TKN = a.Mobile_User_TKN;

        BrandID = a.BrandID;
        MENU_IDS = a.MENU_IDS;
        ITEMS_IDS = a.ITEMS_IDS;
        ParentTest = a.ParentTest;
    }
    String AAA = "";
    protected void run() {  
        Auth = "Bearer " + Mobile_User_TKN;
        
        BODY = "{\"brand\":\"" + BrandID + "\"," +
            "\"is\":{\"type\":\"pickup\"}," +
            "\"mealSwipeTotal\":0.0," +
            "\"menu\":\"" + MENU_IDS.get(MENU_IDS.size() - 1) + "\"," +
            "\"payment_method\":{\"credit_card\":{}," +
            "\"mealplan\":{}}," +
            "\"showSingleTimeSlot\":false," +
            "\"type\":0," +
            "\"typeOfCell\":0}";
        JOB_Api_Call("Create New ShoppingCart Pickup", "POST",             // ===========================
            BaseAPI + "/shoppingcart", Auth, BODY, 200, ParentTest, "no_jira");
        if(json != null){
            try {
                ShoppingCart_Pickup_ID = json.getString("id");
            } catch (Exception ex){
                AAA = ex.getMessage();
            }
        } 
        
        BODY = "{\"items\":[{\"id\":\"" + ITEMS_IDS.get(ITEMS_IDS.size() - 1) + "\"," +
            "\"quantity\":1," +
            "\"price\":{\"amount\":0.05}}]}"; 
        JOB_Api_Call("Add Last Menu Item to Pickup ShoppingCart", "PUT",   // ===========================
            BaseAPI + "/shoppingcart/" + ShoppingCart_Pickup_ID, Auth, BODY, 200, ParentTest, "no_jira");
        if(json != null){
            try{
                AAA = json.toString(4); 
                ShoppingCart_Delivery_ID = json.getString("id");
                JSONArray items = json.getJSONArray("items");
                for (int i = 0; i < items.length(); i++) {
                    if(items.getJSONObject(i).getString("id").equals(ITEMS_IDS.get(ITEMS_IDS.size() - 1))){
                        Item_Index = items.getJSONObject(i).getString("_index");                         
                    }
                }

            } catch (Exception ex){
                AAA = ex.getMessage();
            }
        } 
        
        BODY = "{\"brand\":\"" + BrandID + "\"," +
            "\"is\":{\"type\":\"delivery\"}," +
            "\"mealSwipeTotal\":0.0," +
            "\"menu\":\"" + MENU_IDS.get(MENU_IDS.size() - 1) + "\"," +
            "\"payment_method\":{\"credit_card\":{}," +
            "\"mealplan\":{}}," +
            "\"showSingleTimeSlot\":false," +
            "\"type\":0," +
            "\"typeOfCell\":0}";
        JOB_Api_Call("Create New ShoppingCart Delivery", "POST", // ===========================
            BaseAPI + "/shoppingcart", Auth, BODY, 200, ParentTest, "no_jira");
        if(json != null){
            try{
                ShoppingCart_Delivery_ID = json.getString("id");
                AAA = json.toString(4);
            } catch (Exception ex){
                AAA = ex.getMessage();
            }
        }  
        
        BODY = "{\"items\":[{\"id\":\"" + ITEMS_IDS.get(ITEMS_IDS.size() - 1) + "\"," +
            "\"quantity\":2," +
            "\"price\":{\"amount\":0.05}}]}"; 
        JOB_Api_Call("Add Last Menu Item to Delivery ShoppingCart", "PUT",           // ===========================
            BaseAPI + "/shoppingcart/" + ShoppingCart_Delivery_ID, Auth, BODY, 200, ParentTest, "no_jira");
        if(json != null){
            try{
                ShoppingCart_Delivery_ID = json.getString("id");
                AAA = json.toString(4);
            } catch (Exception ex){
                AAA = ex.getMessage();
            }
        }        
        
        BODY = "{\"items\":[{\"id\":\"" + ITEMS_IDS.get(ITEMS_IDS.size() - 1) + "\"," +
            "\"quantity\":1}]}"; 
        JOB_Api_Call("Patch Last Menu Item: Quantity 2 > 1", "PATCH",       // ===========================
            BaseAPI + "/shoppingcart/" + ShoppingCart_Delivery_ID, Auth, BODY, 200, ParentTest, "no_jira");  
        if(json != null){
            try{
                ShoppingCart_Delivery_ID = json.getString("id");
                AAA = json.toString(4);
            } catch (Exception ex){
                AAA = ex.getMessage();
            }
        }
        
        JSONObject requestParams = new JSONObject();
        requestParams.put("code", "compassunlimited");
        requestParams.put("email", Mobile_User_ID);
        BODY = requestParams.toString();
        JOB_Api_Call("Add Promo Code to Delivery ShoppingCart1", "PUT",           // ===========================
            BaseAPI + "/shoppingcart/" + ShoppingCart_Delivery_ID + "/promo", Auth, BODY, 200, ParentTest, "no_jira");        
        if(json != null){
            try{
                ShoppingCart_Delivery_ID = json.getString("id");
                AAA = json.toString(4);
            } catch (Exception ex){
                AAA = ex.getMessage();
            }
        }
        
        JOB_Api_Call("Get Delivery ShoppingCart after Patch Item", "GET",                 // ===========================
            BaseAPI + "/shoppingcart/" + ShoppingCart_Delivery_ID, Auth, "", 200, ParentTest, "no_jira");        
        if(json != null){
            try{
                ShoppingCart_Delivery_ID = json.getString("id");
                AAA = json.toString(4);
            } catch (Exception ex){
                AAA = ex.getMessage();
            }
        }
            
        if(ITEMS_IDS.size() > 1) {
            BODY = "{\"items\":[{\"id\":\"" + ITEMS_IDS.get(0) + "\"," +
                "\"options\":[]," +
                "\"quantity\":1," +
                "\"price\":{\"amount\":0.08}}]}"; 
            JOB_Api_Call("Add 1st Menu Item to Delivery ShoppingCart", "PUT",        // ===========================
               BaseAPI + "/shoppingcart/" + ShoppingCart_Delivery_ID, Auth, BODY, 200, ParentTest, "no_jira"); 
            if(json != null){
                try{
                    ShoppingCart_Delivery_ID = json.getString("id");
                    AAA = json.toString(4);
                } catch (Exception ex){
                    AAA = ex.getMessage();
                }
            }
            
            BODY = "{\"items\":[{\"id\":\"" + ITEMS_IDS.get(ITEMS_IDS.size() - 1) + "\"}]}"; 
            JOB_Api_Call("Delete ShoppingCart Last Menu Item", "DELETE", // ===========================
               BaseAPI + "/shoppingcart/" + ShoppingCart_Delivery_ID, Auth, BODY, 200, ParentTest, "no_jira");
            if(json != null){
                try{
                    ShoppingCart_Delivery_ID = json.getString("id");
                    AAA = json.toString(4);
                } catch (Exception ex){
                    AAA = ex.getMessage();
                }
            }
        }
        JOB_Api_Call("Get ShoppingCart", "GET",                             // ===========================
            BaseAPI + "/shoppingcart/" + ShoppingCart_Delivery_ID, Auth, "", 200, ParentTest, "no_jira");
        if(json != null){
            try{
                ShoppingCart_Delivery_ID = json.getString("id");
                AAA = json.toString(4);
            } catch (Exception ex){
                AAA = ex.getMessage();
            }
        }
    }
}
