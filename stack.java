
public class stack {
    String data [];
    int top;


    public stack(int jumlah){
    data =new String[jumlah];
    top=-1;
}
    public void push (String hijab){
    if(top <data.length-1){
        top++;
        data[top]= hijab;

    }else {
        System.out.println("hanger sudah penuh");

    }
}
    public String pop (){
    if (top >=0){
        String tempat = data [top];

        top--;
        return tempat;

    }else{
        System.out.println("lemari kosong");
    }
    return "";
}
    public void cetak(){
        System.out.println(" _________________________");
        System.out.println("|LEMARI HIJAB             |");
        System.out.println(" _________________________");
        for (int i=data.length-1;i>=0;i--){
            System.out.println(data[i]+"");
        }
    }
    public String cari (String hijab){
        System.out.println("mencari hijab"+hijab);
        for (int i=data.length-1; i >= 0; i--){
            if (data[i]== hijab) {
                return "hijab ada di Lemari "+(i=i);

        }
    }
        return "hijab tidak ada";


    }

}
