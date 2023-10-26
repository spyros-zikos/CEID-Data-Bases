package bd;


public class SetterGuide {
    private String gui_AT;    
    private String gui_cv;

    public SetterGuide( String AT, String cv){
        this.gui_AT = AT;
        this.gui_cv = cv;
    }

    public String getAT(){
        return gui_AT;
    }     
     
    public String getCV(){
        return gui_cv;
    }
    
    
}
