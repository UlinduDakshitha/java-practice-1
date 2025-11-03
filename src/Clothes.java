public class Clothes extends Products{
    private String size;

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
    public double showFinalPrice(){
        return getPrice();

    }

}
