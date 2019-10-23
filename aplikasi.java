public class aplikasi {

    public static void main(String[] args) {
        stack s=new stack(4);

        s.push("instan");
        s.push("pasmina");
        s.push("segiempat");
        s.push("segitiga");

        s.cetak();

        System.out.println(s.cari(" instan"));
    }
}
