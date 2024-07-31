package bd;


public class SetterEvent {
    private int ev_tr_id;
    private String ev_start;
    private String ev_end;
    private String ev_descr;
    
    public SetterEvent(int id, String start, String end, String descr){
        this.ev_tr_id = id;
        this.ev_start = start;
        this.ev_end = end;
        this.ev_descr = descr;
    }
    
    public int getID(){
        return ev_tr_id;
    }
    
    public String getStart(){
        return ev_start;
    }

    public String getEnd(){
        return ev_end;
    }    
    
    public String getDescr(){
        return ev_descr;
    }   
}
