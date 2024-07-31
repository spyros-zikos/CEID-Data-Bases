package bd;
   

public class SetterIT {
    private String IT_AT;
    private String password;
    private String start_date;   
    private String end_date;
    
    public SetterIT(String AT, String pass, String start,String end){
	this.IT_AT = AT;
	this.password = pass;
	this.start_date = start;
	this.end_date = end;
    }
    
    public String getAT(){
        return IT_AT;
    }
    
    public String getPassword(){
        return password;
    }

    public String getStart(){
        return start_date;
    }    
    
    public String getEnd(){
        return end_date;
    }
}
