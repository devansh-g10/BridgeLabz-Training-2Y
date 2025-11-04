class Prototype implements Cloneable {
    int id;
    String type;
    
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
