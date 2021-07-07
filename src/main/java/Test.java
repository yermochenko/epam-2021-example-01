public class Test {
    public static void main(String[] args) {
        Voucher v = new Voucher();
        Voucher v1 = v;
        v = null;
        v1 = null;
    }
}
