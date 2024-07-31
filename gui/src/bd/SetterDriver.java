package bd;


public class SetterDriver {
    private String drv_AT;
    private String drv_license;
    private String drv_route;
    private int drv_experience;
    
    public SetterDriver(String AT, String license, String route, int experience){
        this.drv_AT = AT;
	this.drv_license = license;
   	this.drv_route = route;
   	this.drv_experience = experience;
    } 
     
    public String getAT(){
        return drv_AT;
    }
    
    public String getLicense(){
        return drv_license;
    }
    
    public String getRoute(){
        return drv_route;
    }
    
    public int getExperience(){
        return drv_experience;
    }        
}
