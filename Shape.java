package project_fci_2024;

 abstract class Shape {
    protected String color;
    protected boolean is_filled;

    public Shape(String color, boolean is_filled) {
        this.color = color;
        this.is_filled = is_filled;
    }
    
    public Shape() {
        this.color = null;
        this.is_filled = false;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isIs_filled() {
        return is_filled;
    }

    public void setIs_filled(boolean is_filled) {
        this.is_filled = is_filled;
    }
    
    public abstract double getArea();
    public abstract double getPer();
    
}
