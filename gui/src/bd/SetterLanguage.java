package bd;


public class SetterLanguage {
    private String lng_gui_AT;
    private String lng_language;
    
    public SetterLanguage( String AT, String language){
        this.lng_gui_AT = AT;
        this.lng_language = language;
    }

    public String getAT(){
        return lng_gui_AT;
    }     
     
    public String getLanguage(){
        return lng_language;
    }
    
}
