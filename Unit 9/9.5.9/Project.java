public class Project extends Assignment {
    private String dueDate;
    private boolean groups;

    public Project(String name, double availablePoints,
            double earnedPoints, String dueDate, boolean groups) {
        super(name, availablePoints, earnedPoints);
        this.dueDate = dueDate;
        this.groups = groups;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String d) {
        dueDate = d;
    }

    public boolean getGroups() {
        return groups;
    }
}