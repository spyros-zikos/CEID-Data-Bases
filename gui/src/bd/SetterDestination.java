package bd;


public class SetterDestination {
	private int dst_id; 
	private String dst_name;
	private String dst_descr;
	private String dst_rtype;
	private String dst_language;
	private int dst_location;
    
    public SetterDestination(int id, String name, String descr, String rtype, String language, int location){
    	this.dst_id = id;
	this.dst_name = name;
	this.dst_descr = descr;
	this.dst_rtype = rtype;
	this.dst_language = language;
	this.dst_location = location;
    }
    
    public int getID(){
        return dst_id;
    }
    
    public String getName(){
        return dst_name;
    }

    public String getDescr(){
        return dst_descr;
    }    
    
    public String getRtype(){
        return dst_rtype;
    } 
    
    public String getLanguage(){
        return dst_language;
    } 
    
    public int getLocation(){
        return dst_location;
    }
}
