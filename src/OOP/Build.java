package OOP;

public class Build {
    // public - доступно везде
    //   public String type;

    // private - видно в пределах класса
    //   private String type;

    // protected - доступно в пределах пакеты, а наследники в других пакетах
    //   protected String type;

    private String type;
    private String color;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
    //  Геттеры и сеттеры - методы для доступа к полям(посредники)
}
