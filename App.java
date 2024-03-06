public class App {
    public static void main(String[] args) throws Exception {
        Segitiga segitiga = new Segitiga(5, 8, 10, 6, 8);
        segitiga.getInfo();

        Persegi persegi = new Persegi(6);
        persegi.getInfo();

        Lingkaran lingkaran = new Lingkaran(9);
        lingkaran.getInfo();
    }
}
