/**
 * Write a description of class Background here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public enum Background  
{
    CHAD(0,"CHAD"),LIBYA (1,"LIBYA"), MALAWI(2,"MALAWI"), MALI(3,"MALI"),
    MADAGASCAR(4,"MADAGASCAR");

    private int rnk;
    private String rep;

    private Background(int rnk, String representation){
        this.rnk = rnk;
        rep = representation;
    }
    
}
