package AP3_API;

class voucherify extends AP3_API_GUI{
    protected voucherify(AP3_API_GUI a) {
        ParentTest = a.ParentTest;
    }
    String AAA = "";
    protected void run() {  
        JOB_VF_Call("Promo/Vouchers - Boost",
            "https://app.voucherify.io/#/app/projects/proj_f1r5Tpr0J3Ct/vouchers?page=2", "30ae6f78-370c-401e-8a9d-4854b9417d1f", "175a14af-e5a1-4062-850f-725023e4967c", 200, ParentTest, "no_jira");
        if(json != null){
            AAA = json.toString(4);
        } 
        JOB_VF_Call("Promo/Vouchers - Thrive",
            "https://app.voucherify.io/#/app/projects/proj_ZaNuBdxR40vR/vouchers?page=1", "40001c3c-9668-4ea5-ab7e-47e3882e9195", "298e956c-eae5-4f62-a245-1b2ab886ffe7", 200, ParentTest, "no_jira");
        if(json != null){
            AAA = json.toString(4);
        } 
    }
}
