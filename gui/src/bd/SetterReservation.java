package bd;


public class SetterReservation {
    private int res_tr_id;
    private int res_seatnum;
    private String res_name;
    private String res_lname;
    private String res_isadult;
    
    public SetterReservation(int id, int seatnum, String name, String lname, String isadult){
	this.res_tr_id = id;
	this.res_seatnum = seatnum;
	this.res_name = name;
	this.res_lname = lname;
        this.res_isadult = isadult;
    }
    
    public int getID(){
        return res_tr_id;
    }
    
    public int getSeatnum(){
        return res_seatnum;
    }

    public String getName(){
        return res_name;
    }    
    
    public String getLname(){
        return res_lname;
    }
        
    public String getIsadult(){
        return res_isadult;
    }   
}
