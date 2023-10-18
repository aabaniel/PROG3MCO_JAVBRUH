
public class Creature {
    /*
     Creature: contains setters and getters for creature object.  
     
     */
    public String cName;
    public String cType;
    public String cFam;
    public Integer cHealth;
    public Integer cEvLvl;
    public Boolean IsEnemy;
    public Boolean IsActive;

    
   
    
   
    

    

    public void setcName(String cName) {
        this.cName = cName;
    }
    
    
    public String getcName() {
        return cName;
    }
    public void setcType(String cType) {
        this.cType = cType;
    }
    public String getcType() {
        return cType;
    }
    public void setcFam(String cFam) {
        this.cFam = cFam;
    }
    public String getcFam() {
        return cFam;
    }
    public void setcHealth(Integer cHealth) {
        this.cHealth = cHealth;
    }
    public Integer getcHealth() {
        return cHealth;
    }
    public void setcEvLvl(Integer cEvLvl) {
        this.cEvLvl = cEvLvl;
    }
    public Integer getcEvLvl() {
        return cEvLvl;
    }
    public void setIsActive(Boolean isActive) {
        IsActive = isActive;
    }
    public Boolean getIsActive() {
        return IsActive;
    }
   
    
    public void setIsEnemy(Boolean isEnemy) {
        IsEnemy = isEnemy;
    }
    public Boolean getIsEnemy() {
        return IsEnemy;
    }

}
