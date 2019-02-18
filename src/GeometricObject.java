public abstract class GeometricObject
{
    private String colour = "white";
    private boolean filled;
    private java.util.Date dateCreated;

    protected GeometricObject()
    {
        dateCreated = new java.util.Date();
        this.colour = "white";
        this.filled = false;

    }

    protected GeometricObject(String color, boolean filled)
    {
        dateCreated = new java.util.Date();
        this.colour = colour;
        this.filled = filled;
    }

    public String getColour()
    {
        return colour;
    }

    public void setColour(String color)
    {
        this.colour = colour;
    }

    public boolean isFilled()
    {
        return filled;
    }

    public void setFilled(boolean filled)
    {
        this.filled = filled;
    }

    public java.util.Date getDateCreated()
    {
        return dateCreated;
    }

    @Override
    public String toString()
    {
        return "created on " + dateCreated + "\nColour: " + colour + " \nFilled: " + filled;
    }

    public abstract double getArea();

    public abstract double getPerimeter();
}
