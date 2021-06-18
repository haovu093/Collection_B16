import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        ArrayList<ProductList> productLists = new ArrayList<ProductList>();
        productLists.add(new ProductList(1, "Kẹo hải hà", 30000, 2));
        productLists.add(new ProductList(2, "Mì tôm hảo hảo", 6000, 3));
        productLists.add(new ProductList(3, "Cocacola", 12000, 4));
        // in list sp
        System.out.println("Danh sách sản phẩm: ");
        for (ProductList productList : productLists) {
            System.out.println(productList);
        }
        //Tìm kiếm sp
        System.out.println("Sản phẩm có name = Kẹo hải hà");
        for (int i = 0; i < productLists.size(); i++) {
            if (productLists.get(i).tensp.contains("Kẹo hải hà")) {
                System.out.println(productLists.get(i));
            }
        }
        System.out.println("Sửa sp có id =2 ");
        for (int i = 0; i < productLists.size(); i++) {
            if (productLists.get(i).id == 2) {
                productLists.set(i, new ProductList(10, "tên sau khi sửa", 500000, 100));
            }
        }
        System.out.println("Danh sách sau khi sửa: ");
        for (ProductList productList : productLists) {
            System.out.println(productList);
        }

        System.out.println("Xóa sp có id =1");
        for (int i = 0; i < productLists.size(); i++) {
            if (productLists.get(i).id == 1) {
                productLists.remove(1);
            }
        }
        System.out.println("Danh sách sau khi xóa: ");
        for (ProductList productList : productLists) {
            System.out.println(productList);
        }


        // Bài 2 :
        ArrayList<Employee> employees = new ArrayList<Employee>();
        employees.add(new Employee(1, "NV01", "Vũ Thị Hảo", 30, "Hà nội", 01123234));
        employees.add(new Employee(2, "NV", "Cao Văn Quang", 30, "Hà nội", 01123234));
        employees.add(new Employee(3, "NV03", "Cao Vũ Anh Thư", 30, "Hà nội", 01123234));

        // in list nhân viêm
        System.out.println("Danh sách nhân viên: ");
        for (Employee employee : employees) {
            System.out.println(employee);
        }

//         Check thông tin nhân viên
        Scanner sc = new Scanner(System.in);
        String checkName;
        System.out.println("Nhập tên nhân viên");
        checkName = sc.nextLine();
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).tenNV.contains(checkName)) {
                System.out.println(checkName + " nằm trong danh sách NV");
            } else System.out.println(checkName + "  không thuộc danh sách NV");
            break;
        }

        System.out.println("\n Danh sách nv sau khi sửa ");
        for (Employee employee : employees) {
            System.out.println(employee);
        }

        //Nhập vào mã nhân viên
        String maupdate;
        System.out.println("\nNhập vào mã nhân viên:");
        maupdate = sc.nextLine();
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).maNV.contains(maupdate)) {
                System.out.println(maupdate + " nằm trong danh sách NV");
                employees.remove(i);
            } else System.out.println(maupdate + "  không thuộc danh sách NV");
            break;
        }
        System.out.println("\nDanh sách nv sau khi xóa ");
        for (Employee employee : employees) {
            System.out.println(employee);
        }

    }
}

