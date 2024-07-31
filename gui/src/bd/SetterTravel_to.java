package bd;


public class SetterTravel_to {
    private int to_dst_id;
    private int to_tr_id;
    private String to_arrival;
    private String to_departure;
    
    public SetterTravel_to(int id_dst, int id_tr, String arrival, String departure){
	this.to_dst_id = id_dst;
	this.to_tr_id = id_tr;
	this.to_arrival = arrival;
	this.to_departure = departure;
    }
    
    public int getID_dst(){
        return to_dst_id;
    }
    
    public int getID_tr(){
        return to_tr_id;
    }

    public String getArrival(){
        return to_arrival;
    }    
    
    public String getDeparture(){
        return to_departure;
    } 
}
