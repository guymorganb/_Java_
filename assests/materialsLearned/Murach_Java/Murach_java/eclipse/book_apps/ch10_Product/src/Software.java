public class Software extends Product {
    private String version;

    public Software() {
        super();  // call constructor of Product superclass
        version = "";
        count++;
    }

    public void setVersion(String version) {
        this.version = version;
    }
    public String getVersion() {
        return version;
    }
    
    @Override
    public String toString() {       
        return super.toString() + " " + getVersion();
    }
}
