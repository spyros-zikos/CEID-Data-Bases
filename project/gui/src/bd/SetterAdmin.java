package bd;


public class SetterAdmin {
    private String adm_AT;    
    private String adm_type;
    private String adm_diploma;

    public SetterAdmin(String AT, String type, String diploma){
        this.adm_AT = AT;
        this.adm_type = type;
        this.adm_diploma = diploma;
    }
 
    public String getAT(){
        return adm_AT;
    }
    
    public String getType(){
        return adm_type;
    }
    
    public String getDiploma(){
        return adm_diploma;
    }    
}
