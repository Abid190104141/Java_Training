public class Laptop {

private String laptopId;
private String brand;
private String model;
private int serialNumber;

    public Laptop(String laptopId, String brand, String model, int serialNumber) {
        this.laptopId = laptopId;
        this.brand = brand;
        this.model = model;
        this.serialNumber = serialNumber;
    }
    public Laptop() {

    }


    public String getLaptopId() {
        return laptopId;
    }

    public void setLaptopId(String laptopId) {
        this.laptopId = laptopId;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getDetails(){
        return "Laptop ID : " + laptopId+
                "\nBrand : " + brand+
                "\nModel : " + model+
                "\nSerial No : "+serialNumber;
    }
}
