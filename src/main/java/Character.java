public class Character {

    Long Id;
    String Name;
    Skill firstSkill;
    Skill secondSkill;
    Skill thirdSkill;


    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Skill getFirstSkill() {
        return firstSkill;
    }

    public void setFirstSkill(Skill firstSkill) {
        this.firstSkill = firstSkill;
    }

    public Skill getSecondSkill() {
        return secondSkill;
    }

    public void setSecondSkill(Skill secondSkill) {
        this.secondSkill = secondSkill;
    }

    public Skill getThirdSkill() {
        return thirdSkill;
    }

    public void setThirdSkill(Skill thirdSkill) {
        this.thirdSkill = thirdSkill;
    }


    public static void main(String[] args) {
        System.out.println("lsajdflasdkfj");
    }
}
