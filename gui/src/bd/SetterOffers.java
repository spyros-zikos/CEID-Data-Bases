package bd;


public class SetterOffers {
    private int off_id;
    private String off_start;
    private String off_end;
    private int off_cost;   
    private int  off_dst_id;
    
    public SetterOffers(int id, String start, String end, int cost, int dst_id){
	this.off_id = id;
	this.off_start = start;
	this.off_end = end;
	this.off_cost = cost;
        this.off_dst_id = dst_id;
    }
    
    public int getID(){
        return off_id;
    }
    
    public String getStart(){
        return off_start;
    }   
    
    public String getEnd(){
        return off_end;
    } 
    
    public int getCost(){
        return off_cost;
    } 
    
    public int getDst_id(){
        return off_dst_id;
    } 
}
