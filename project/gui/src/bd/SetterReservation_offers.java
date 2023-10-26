package bd;


public class SetterReservation_offers {
    private int res_off_id;
    private String res_off_ln;
    private String res_off_fn;
    private int res_off_off_id;   
    private int  res_off_prepay;
    
    public SetterReservation_offers(int id, String lname, String fname, int off_id, int prepay){
	this.res_off_id = id;
	this.res_off_ln = lname;
	this.res_off_fn = fname;
	this.res_off_off_id = off_id;
        this.res_off_prepay = prepay;
    }
    
    public int getID(){
        return res_off_id;
    }
    
    public String getLn(){
        return res_off_ln;
    }   
    
    public String getFn(){
        return res_off_fn;
    } 
    
    public int getOff_id(){
        return res_off_id;
    } 
    
    public int getPrepay(){
        return res_off_prepay;
    }     
}
