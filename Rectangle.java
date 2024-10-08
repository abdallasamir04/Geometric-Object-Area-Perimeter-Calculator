package project_fci_2024;

 class Rectangle extends Shape{

    protected double len , wid;

    public Rectangle() {
        this.len = 1.0;
        this.wid = 1.0;
    }

    public Rectangle(double len, double wid, String color, boolean is_filled) {
        super(color, is_filled);
        this.len = len;
        this.wid = wid;
    }
    
    public Rectangle(double len, double wid) {
        this.len = len;
        this.wid = wid;
    }

    public double getLen() {
        return len;
    }

    public void setLen(double len) {
        this.len = len;
    }

    public double getWid() {
        return wid;
    }

    public void setWid(double wid) {
        this.wid = wid;
    }

    @Override
    public double getArea() {
        return this.len * this.wid;
    }

    @Override
    public double getPer() {
        return (this.len + this.wid) * 2;
    }
    
}
