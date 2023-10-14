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
    public void setcType(String cType) {
        this.cType = cType;
    }
    public void setcFam(String cFam) {
        this.cFam = cFam;
    }
    public void setcHealth(Integer cHealth) {
        this.cHealth = cHealth;
    }
    public void setcEvLvl(Integer cEvLvl) {
        this.cEvLvl = cEvLvl;
    }
    public void setIsActive(Boolean isActive) {
        IsActive = isActive;
    }
    public void setIsAlive(Boolean isAlive) {
        IsAlive = isAlive;
    }
    public void setIsEnemy(Boolean isEnemy) {
        IsEnemy = isEnemy;
    }

}
