import java.util.ArrayList;

public class Senjata extends Item {

    private ArrayList<String> arrAksi = new ArrayList<>();
    private ArrayList<Item> arrItem = new ArrayList<>();
    private GameInfo objGameInfo;
    private Ruangan objRuangan;
    private Item objitem;
    private Player objplayer;
    int x =0;
    private int damage;

    public Senjata(String nama, String jenis) {
        super(nama, jenis);
        arrAksi.add("Ambil senjata");
        arrAksi.add("pakai sebjata");
    }
    @Override
    public void prosesAksi(int subpil){
        //1 jika di ruangan ada senjata
        //2 jika di ruangan tak ada senjata
        if (pil == 1) {
            System.out.println(getDeskripsi());
        } else if (pil == 2) {  //bisa ambil atau buang
            if (objRuangan == null) {
                //dipegang player, buang ke ruangan
                dibuang();
            } else {
                //ada di ruangan, diambil player
                diambil();
            }
        }
        }

    public int cariSenjata(String namaItem , String jenis){
        for (Item objItem:arrItem) {
            if (namaItem.equals(objItem.getNama()) && jenis.equals("Senjata")) {
                return (x=1);
            }
        }
        return(x=2); //tidak ketemu
    }
    public void pakai(int tambahDMG){
        if (x!=1){
            System.out.println("Senjata tidak bisa dipakai");
        }else {
            objplayer.setDayaSerang(objplayer.getDayaSerang()+tambahDMG);
        }
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}


