package bd;


public class SetterTrip {
    private int tr_id;
    private String tr_departure;
    private String tr_return;
    private int	tr_maxseats;
    private float tr_cost;
    private int	tr_br_code;
    private String tr_gui_AT;
    private String tr_drv_AT;
  
    
    public SetterTrip(int id, String departure, String return_date, int maxseats, float cost, int code, String gui_AT, String drv_AT){
        this.tr_id = id;
        this.tr_departure = departure;
        this.tr_return = return_date;
        this.tr_maxseats = maxseats;
        this.tr_cost = cost;
        this.tr_br_code = code;
        this.tr_gui_AT = gui_AT;
        this.tr_drv_AT = drv_AT;
    } 
     
    public int getID(){
        return tr_id;
    }  
    public String getDeparture(){
        return tr_departure;
    }
    
    public String getReturn_date(){
        return tr_return;
    }
    
    public int getMaxseats(){
        return tr_maxseats;
    }
    
    public float getCost(){
        return tr_cost;
    }
    
    public int getCode(){
        return tr_br_code;
    }
    
    public String getGui_AT(){
        return tr_gui_AT;
    } 
    
    public String getDrv_AT(){
        return tr_drv_AT;
    } 
   
}
