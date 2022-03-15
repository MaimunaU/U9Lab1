public class Skateboard extends Vehicle{
    private String color;

    public Skateboard(String name, int wheels, String color)
    {
        super(name, wheels);
        this.color = color;
    }

    public String getColor()
    {
        return color;
    }

    public void trick()
    {
        System.out.println("I just did a really cool trick!");
    }
}
