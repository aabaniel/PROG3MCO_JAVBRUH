/*
Implement a creature class here
*/
public class creature {
    private String cName;
    private String cType;
    private String cFam;
    private Integer cHealth;
    private Integer cEvLvl;
    private Boolean IsAlive;
    private Boolean IsEnemy;
    private Boolean IsActive;

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
    public void setIsAlive(Boolean isAlive) {
        IsAlive = isAlive;
    }
    public Boolean getIsAlive() {
        return IsAlive;
    }
    public void setIsEnemy(Boolean isEnemy) {
        IsEnemy = isEnemy;
    }
    public Boolean getIsEnemy() {
        return IsEnemy;
    }

}
