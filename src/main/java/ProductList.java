public class ProductList {
        int id;
        String tensp;
        int gia;
        int sl;

        public ProductList(int id, String tensp, int gia, int sl) {
            this.id = id;
            this.tensp = tensp;
            this.gia = gia;
            this.sl=sl;
        }


    @Override
    public String toString() {
        return "ProductList{" +
                "id=" + id +
                ", tensp='" + tensp + '\'' +
                ", gia=" + gia +
                ", sl=" + sl +
                '}';
    }
}


