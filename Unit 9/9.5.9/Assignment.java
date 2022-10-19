public class Assignment
{
    private String name;
    private double availablePoints;
    private double earnedPoints;
    
    public Assignment(String name, double availablePoints, double earnedPoints)
    {
        this.name = name;
        this.availablePoints = availablePoints;
        this.earnedPoints = earnedPoints;
    }
    public String getName()
    {
        return name;
    }
    public double getEarnedPoints()
    {
        return earnedPoints;
    }
    public double getAvailablePoints()
    {
        return availablePoints;
    }
}