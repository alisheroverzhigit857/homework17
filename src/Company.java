import java.util.Arrays;

public class Company {
    private String address;
    private String ownerName;
    private Java [] javas;
    private Android [] androids;
    private Go [] gos;

    public Company(String address, String ownerName, Java[] javas, Android[] androids, Go[] gos) {
        this.address = address;
        this.ownerName = ownerName;
        this.javas = javas;
        this.androids = androids;
        this.gos = gos;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public Java[] getJavas() {
        return javas;
    }

    public void setJavas(Java[] javas) {
        this.javas = javas;
    }

    public Android[] getAndroids() {
        return androids;
    }

    public void setAndroids(Android[] androids) {
        this.androids = androids;
    }

    public Go[] getGos() {
        return gos;
    }

    public void setGos(Go[] gos) {
        this.gos = gos;
    }

    @Override
    public String toString() {
        return "Company{" +
                "\naddress = " + address + '\'' +
                "\n ownerName = " + ownerName + '\'' +
                "\n javas = " + Arrays.toString(javas) +
                "\n androids = " + Arrays.toString(androids) +
                "\n gos = " + Arrays.toString(gos) +
                '}';
    }
}
