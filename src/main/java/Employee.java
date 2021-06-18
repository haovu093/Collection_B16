public class Employee {
    int id;
    String maNV;
    String tenNV;
    int tuoiNV;
    String address;
    int sdt;

    public Employee(int id, String maNV, String tenNV, int tuoiNV, String address, int sdt) {
        this.id = id;
        this.maNV = maNV;
        this.tenNV = tenNV;
        this.tuoiNV = tuoiNV;
        this.address = address;
        this.sdt = sdt;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", maNV='" + maNV + '\'' +
                ", tenNV='" + tenNV + '\'' +
                ", tuoiNV=" + tuoiNV +
                ", address='" + address + '\'' +
                ", sdt=" + sdt +
                '}';
    }
}
