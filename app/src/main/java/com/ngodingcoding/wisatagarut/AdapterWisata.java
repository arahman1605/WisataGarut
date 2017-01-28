package com.ngodingcoding.wisatagarut;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.PopupMenu;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.ngodingcoding.cardviewandrecyclerview.R;

import java.util.List;

/**
 * Created by Lenovo on 22/01/2017.
 */

public class AdapterWisata extends RecyclerView.Adapter<AdapterWisata.MyViewHolder> {

    private Context mContext;
    public String namawisata,judul,alamat;
    private List<Wisata> daftarWisata;
    public class MyViewHolder extends RecyclerView.ViewHolder {
        public ImageView thumbnail, overflow;
        public TextView title, count;
        public MyViewHolder(View view) {
            super(view);
            title = (TextView) view.findViewById(R.id.title);
            count = (TextView) view.findViewById(R.id.count);
            thumbnail = (ImageView) view.findViewById(R.id.thumbnail);
            overflow = (ImageView) view.findViewById(R.id.menus);
        }
    }

    public AdapterWisata(Context mContext, List<Wisata> daftarWisata) {
        this.mContext = mContext;
        this.daftarWisata = daftarWisata;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.wisata_kotak, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, int position) {
        final Wisata album = daftarWisata.get(position);
        holder.title.setText(album.getName());
        holder.count.setText(album.getWilWisata() + " - Garut");

        //holder.thumbnail.setOnClickListener(clickListener);




        // loading album cover using Glide library
        Glide.with(mContext).load(album.getThumbnail()).into(holder.thumbnail);
        //String coba = Glide.with(mContext).load(album.getThumbnail()).into(holder.thumbnail).toString();
        holder.thumbnail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String deskrips, fasilitas,harga,alamat,akses;
                int posisi = album.getThumbnail();
                String pos = String.valueOf(posisi);
                final int bgdt = 2130837594;
                final String bagendit = String.valueOf(bgdt);
                final int smpr = 2130837596;
                final String sampireun = String.valueOf(smpr);
                final int tlg = 2130837597;
                final String talaga = String.valueOf(tlg);
                final int mwr = 2130837598;
                final String mawar = String.valueOf(mwr);
                final int cnd = 2130837599;
                final String candi = String.valueOf(cnd);
                final int trj = 2130837600;
                final String taraje = String.valueOf(trj);
                final int cpns = 2130837601;
                final String cipanas = String.valueOf(cpns);
                final int co = 2130837602;
                final String orok = String.valueOf(co);
                final int guha = 2130837603;
                final String pguha = String.valueOf(guha);
                final int sntl = 2130837595;
                final String santolo = String.valueOf(sntl);
                //showPopupMenu(holder.overflow);
                //Toast.makeText(mContext, "Menu ini berada di posisi " + pos, Toast.LENGTH_LONG).show();
                if(pos.equals(bagendit)){
                    namawisata = "Situ Bagendit";
                    deskrips = "Objek wisata Situ Bagendit menjadi satu destiansi menarik yang berbatasan langsung dengan Desa Banyuresmi di bagian utara dan di sebelah selatan berbatasan dengan Desa Cipicung. Sedangkan untuk sebelah timur berbatasan langsung dengan Desa Binakarya, dan sebelah barat berbatasan langsung dengan Desa Sukamukti." +
                            "\n" +
                            "Awal mula pembangunan Situ Bagendit tersebut ditujukan untuk menyuplai tenaga listrik ke PLN dengan tenaga sebesar 220v. Sumber air di Situ Bagendit sangat melimpah dan jarang sekali pada musim kemarau mengalami kekeringan. Dari tahun ke tahun pengembangan kawasan Situ Bagendit terus diupayakan dan hasilnya banyak wisatawan dari luar daerah Garut berdatangan untuk menikmati fasilitas yang ada.";
                    fasilitas = "Terdapat fasilitas yang bisa kamu pakai saat berkunjung ke Situ Bagendit ini diantaranya perahu kecil atau sepeda air dan kolam renang untuk orang dewasa dan anak-anak. Untuk menyewa rakit, kamu bisa menggunakan dalam waktu 15 menit dengan biaya sewa sebesar 25 ribu saja. Sedangkan untuk sepeda air tersedia 11 buah dengan biaya sewa 10 ribu per 15 menit. Tidak hanya itu, kereta mini menyusuri tepi danau juga tersedia bagi anak-anak.";
                    harga ="Untuk harga tiket masuk ke Situ Bagendit terbilang murah yakni sebesar 5 ribu saja, sedangkan waktu buka tempat wisata danau tersebut mulai pukul 7 pagi sampai 5 sore.";
                    alamat = "Objek wisata Situ Bagendit terletak Kabupaten di Garut - Jawa Barat, tepatnya di Desa Bagendit, Kecamatan Banyuresmi";
                    akses = "Situ Bagendit ini terletak kurang lebih 4 km dari pusat kota Garut. Untuk sampai di tempat ini kita bias menggunakan kendaraan umum , namun memakai kendaraan pribadi tentu akan lebih santai dan nyaman. Dari Jakarta dan bandung atau tempat lain rute awal adalah langsung menuju Garut, Jawa Barat. Kemudian menuju barat ke Jalan Margawati-Cimuncang, nanti akan sampai di Jalan Ciledug menuju Jalan Kyai Haji Hasan Arif dan akan sampai Ke Kecamatan Banyuresmi, setelah di banyuresmi langsung menuju situ bagendit, jika masih kebingungan kita bias menanyakan kepada penduduk setempat, nanti kita akan di tunjukan arah yang benar dan tepat";
                    Intent deskripsi = new Intent(mContext, Deskripsi.class);
                    Toast.makeText(mContext, "Situ Bagendit", Toast.LENGTH_SHORT).show();
                    Bundle b = new Bundle();
                    b.putString("wisata" , namawisata);
                    b.putString("deswisata", deskrips);
                    b.putString("faswisata" , fasilitas);
                    b.putString("hrgwisata", harga);
                    b.putString("alwisata" , alamat);
                    b.putString("akwisata", akses);
                    deskripsi.putExtras(b);
                    mContext.startActivity(deskripsi);
                }
                if(pos.equals(sampireun)){
                    namawisata = "Kampung Sampireun";
                    deskrips = "Kampung Sampireun Resort & Spa adalah pilihan yang populer di kalangan pelancong di Garut, baik menjelajahi atau hanya transit. Hotel ini menawarkan berbagai layanan dan fasilitas yang dirancang untuk memberikan kenyamanan dan kemudahan. Fasilitas-fasilitas seperti fasilitas rapat , layanan kamar, toko, kotak penyimpanan aman, concierge tersedia untuk Anda nikmati. Koran harian, air botol gratis, balkon/teras, TV satelit/kabel, pembuat kopi/teh dapat ditemukan di setiap kamar. Untuk meningkatkan jumlah bermalam para tamu, hotel ini menawarkan fasilitas rekreasi seperti sauna, kolam (anak), kolam renang (luar ruangan), olahraga air (tak-bermotor), taman. Temukan semua yang Garut tawarkan dengan membuat Kampung Sampireun Resort & Spa sebagai pangkalan Anda.";
                    fasilitas = "Kampung Sampireun memiliki 22 Bungalow terdiri dari 8 unit tipe Kalapalua Suite (Satu kamar tidur & teras), 4 unit tipe Kurjati Suite (Satu kamar tidur, ruang tengah, & teras), 6 unit tipe Waluran Suite (Dua kamar tidur, ruang tengah, & teras), 1 unit tipe Cikuray Suite (Dua kamar tidur, ruang tengah, & teras), 1 unit tipe Papandayan Suite (Dua kamar tidur, ruang tengah, & teras) , dan 1 unit tipe Manglayang (Tiga kamar tidur, ruang tengah, & teras).";
                    harga ="-";
                    alamat = "Jl. Raya Samarang Kamojang KM 4\n" +
                            "Kp. Ciparay Desa Sukakarya\n" +
                            "Kec. Samarang Kab. Garut,\n" +
                            "Jawa Barat - Indonesia.";
                    akses = "Setelah masuk ke Jalan Otista ikuti jalan tersebut sampai menemukan Bunderan Tugu Adipura (Tarogong). Dari Bunderan tersebut belok kanan, lurus sekitar 100 meter mentok belok kiri. 50 meter ke depan akan menemukan pertigaan Jalan Samarang (Terdapat Sign Board Kampung Sampireun 11 KM) lalu belok kanan." +
                            "\n" +
                            "Anda telah memasuki Jalan Raya Samarang ikuti jalan tersebut  + 7 KM dan akan menemukan pertigaan ke Jalan Raya Kamojang ( Terdapat Sign Board Kampung Sampireun 4 KM ) belok kanan patokannya terdapat Minimarket Indomaret. Ikuti jalan tersebut sekitar 4KM";
                    Intent deskripsi = new Intent(mContext, Deskripsi.class);
                    Toast.makeText(mContext, "Kampung Sampireun", Toast.LENGTH_SHORT).show();
                    Bundle b = new Bundle();
                    b.putString("wisata" , namawisata);
                    b.putString("deswisata", deskrips);
                    b.putString("faswisata" , fasilitas);
                    b.putString("hrgwisata", harga);
                    b.putString("alwisata" , alamat);
                    b.putString("akwisata", akses);
                    deskripsi.putExtras(b);
                    mContext.startActivity(deskripsi);
                }
                if(pos.equals(talaga)){
                    namawisata = "Kawah Talaga Bodas";
                    deskrips = "Kawah Talaga Bodas adalah salah satu keindahan alam yang dimiliki kabupaten Garut. Kawah talaga bodas merupakan kawah gunung Talaga Bodas yang membentuk sebuah Talaga (danau) bersulfur jenuh berwarna putih. Kawasan Taman wisata alam Talaga Bodas dikelola oleh BKSDA Jawa Barat. Kawah Talaga Bodas berada diketinggian 1512 m dpl, sedangkan Gunung Talaga bodas sendiri mempunyai ketinggian 2201 m dpl. Puncak Gunung Talaga bodas merupakan perbatasan kabupaten Garut dan Kabupaten Tasikmalaya. Gunung Talaga Bodas merupakan satu dari lima gunung yang menjadi simbol lambang Kabupaten Garut. Cagar Alam Gunung Talaga bodas terletak di kecamatan Pangatikan dan kecamatan Wanaraja seluas 258,05 Ha dan Taman Wisatav Alam (TWA) Kawah talaga Bodas seluas 27,88 Ha berada di kecamatan Pangatikan.";
                    fasilitas = "Pemandian air panas langsung dari kawah.";
                    harga ="Jalan Talaga Bodas, Wanaraja\n" +
                            "Tiket wisnu hari biasa: Rp. 5.000\n" +
                            "Tiket wisnu hari libur: Rp. 7.500\n" +
                            "Tiket wisman hari biasa/libur: Rp. 100.000/150.000\n" +
                            "Asuransi: Rp. 2.000\n" +
                            "Tiket Motor hari biasa/libur: Rp. 5.000/7.500\n" +
                            "Tiket Mobil hari biasa/libur: Rp. 10.000/15.000\n" +
                            "Ojek dari parkiran ke kawah: Rp. 10.000\n" +
                            "Ojek dari Wanaraja ke kawah: Rp. 60.000 sekali jalan.";
                    alamat = "Sukamenak, Wanaraja, Sukamenak, Wanaraja, Kabupaten Garut, Jawa Barat 44183.";
                    akses = "Belum ada penanda khusus yang menunjukan lokasi ini. Penandanya adalah pertigaan setelah alun-alun wanaraja ambil belokan ke kanan (jika dari arah Garut) atau pertigaan sebelum alun-alun wanaraja ambil belokan ke ke kiri (jika dari arah Cibatu). Transportasi umum menuju lokasi bisa dengan menggunakan angkot Garut – wanaraja dari terminal guntur Garut dan disambung dengan ojek sampai ke lokasi.";
                    Intent deskripsi = new Intent(mContext, Deskripsi.class);
                    Toast.makeText(mContext, "Kawah Talaga Bodas", Toast.LENGTH_SHORT).show();
                    Bundle b = new Bundle();
                    b.putString("wisata" , namawisata);
                    b.putString("deswisata", deskrips);
                    b.putString("faswisata" , fasilitas);
                    b.putString("hrgwisata", harga);
                    b.putString("alwisata" , alamat);
                    b.putString("akwisata", akses);
                    deskripsi.putExtras(b);
                    mContext.startActivity(deskripsi);
                }
                if(pos.equals(mawar)){
                    namawisata = "Taman Bunga - Kebun Mawar";
                    deskrips = "Ternyata Kebun Mawar Situhapa ini sebenarnya penginapan tapi memiliki area taman bunga (yang ternyata bunganya tidak hanya bunga mawar) dengan luas sekitar 5 hektar, udara disini cukup sejuk angin cepoy-cepoy walaupun matahari terik benerik, udaranya sejuk karena lokasinya sebenernya di area Kamojang, Kecamatan Samarang (bukan Semarang yee, catet!) dengan ketinggian dataran sekitar 1.150 meter di atas permukaan laut.";
                    fasilitas = "Dengan memberikan keindahan pemandangan agar dapat memanjakan pengunjung dan memberikan ketenangan saat berada di taman dengan di kelilingi hamparan bunga dan juga pemandangan yang indah yaitu pegunungan garut." +
                            "\n" +
                            "Kebun mawar juga memiliki fasilitas restaurant untuk memanjakan perut pengunjung dengan menyediakan 3 jenis makanan yaitu : Makanan Tradisional, Makanan Nasional dan juga Makanan Western sehingga pengunjung dapat menentukan sesuai dengan seler maasing-masing." +
                            "\n" +
                            "Kebun Mawar juga melengkapi fasilitas Tempat Bermain anak yang berada di bagian agak atas sehingga pasti menarik dan memberika keseruan dengan beberapa wahana bermain yang disediakan. Anda juga dapat bermain bersama merpati yang di kembang biakkan pasti menambah keseruan liburan bersama keluarga.";
                    harga ="dikenakan biaya Rp. 15.000,-";
                    alamat = "Jl. Raya Kamojang KM. 5, Samarang, Sukakarya, Garut, Kabupaten Garut, Jawa Barat 44161Telepon: (0262) 4706006.";
                    akses = "Lewat Garut dari Kota Bandung (atau kalau dari Jakarta itu lewat Cipularang keluar di Cileunyi, lalu kalau weekend mau menghindari macet di Nagreg, bisa milih lewat Cijapati, kemarin kita sebenernya ‘disasarin Google Maps’ lewat siini eh kok ya malah lebih lancar (kalau dari peta itu alurnya naik ke Utara kalau ke arah Kamojang dari Garut).";
                    Intent deskripsi = new Intent(mContext, Deskripsi.class);
                    Toast.makeText(mContext, "Taman Bunga - Kebun Mawar", Toast.LENGTH_SHORT).show();
                    Bundle b = new Bundle();
                    b.putString("wisata" , namawisata);
                    b.putString("deswisata", deskrips);
                    b.putString("faswisata" , fasilitas);
                    b.putString("hrgwisata", harga);
                    b.putString("alwisata" , alamat);
                    b.putString("akwisata", akses);
                    deskripsi.putExtras(b);
                    mContext.startActivity(deskripsi);
                }
                if(pos.equals(candi)){
                    namawisata = "Candi Cangkuang - Situ Cangkuang - Kampung Pulo";
                    deskrips = "Candi Cangkuang ditemukan kembali oleh Tim Sejarah Leles pada tanggal 9 Desember 1966. Tim penelitian yang disponsori oleh Bapak Idji Hatadji (CV. Haruman) ini diketuai oleh Prof. Harsoyo, Uka Tjandrasasmita (ketua penelitian sejarah Islam dan lembaga kepurbakalaan), dan mahasiswa dari IKIP Bandung. Penelitian dilaksanakan berdasarkan tulisan Vorderman dalam buku Notulen Bataviaasch Genotschap terbitan tahun 1893 yang menyatakan bahwa di Desa Cangkuang terdapat makam kuno dan sebuah arca yang sudah rusak. Disebutkan bahwa temuan itu berlokasi di bukit Kampung Pulo.";
                    fasilitas = "Souvenir, Rakit, wisata di kampong pulo.";
                    harga ="Biaya naik rakit sebesar Rp.4.000,00 perorang, yang dibayar saat tiba kembali nanti. Bagi Anda yang membawa rombongan, bisa juga menyewa satu rakit sebesar Rp.70.000,00. Jika kebetulan Anda datang bukan pada saat hari libur dan sendirian, silahkan minta tolong kepada tukang rakit kecil yang bisa berangkat tanpa menunggu penuh terlebih dahulu. Ongkosnya seikhlasnya, tapi dengan Rp.5.000,00 sudah cukup untuk menyebrang ke Kampung Pulo, pulau lokasi candi cangkuang berada.";
                    alamat = "Candi Cangkuang terletak di Kampung Pulo, Desa Cangkuang , Kecamatan Leles, Kabupaten Garut.";
                    akses = "Secara umum, waktu tempuh dari Jakarta menuju lokasi hanya memakan waktu sekitar 4-6 jam tergantung hari libur atau bukan. Jika Anda menggunakan kendaraan pribadi, Candi Cangkuang dapat ditempuh melalui jalan tol Cipularang keluar di Cileunyi. Perjalanan dilanjutkan melalui jalur lintas selatan hingga Cagak Nagreg. Silahkan ambil jalan ke kanan menuju arah Garut. Selanjutnya ikuti jalan hingga tiba di Alun-alun kecamatan Leles. Beloklah ke kiri, lalu ikuti jalan desa, kemudian Anda akan menemukan kawasan wisata Candi Cangkuang.";
                    Intent deskripsi = new Intent(mContext, Deskripsi.class);
                    Toast.makeText(mContext, "Candi Cangkuang - Situ Cangkuang - Kampung Pulo", Toast.LENGTH_SHORT).show();
                    Bundle b = new Bundle();
                    b.putString("wisata" , namawisata);
                    b.putString("deswisata", deskrips);
                    b.putString("faswisata" , fasilitas);
                    b.putString("hrgwisata", harga);
                    b.putString("alwisata" , alamat);
                    b.putString("akwisata", akses);
                    deskripsi.putExtras(b);
                    mContext.startActivity(deskripsi);
                }
                if(pos.equals(mawar)){
                    namawisata = "Taman Bunga - Kebun Mawar";
                    deskrips = "Ternyata Kebun Mawar Situhapa ini sebenarnya penginapan tapi memiliki area taman bunga (yang ternyata bunganya tidak hanya bunga mawar) dengan luas sekitar 5 hektar, udara disini cukup sejuk angin cepoy-cepoy walaupun matahari terik benerik, udaranya sejuk karena lokasinya sebenernya di area Kamojang, Kecamatan Samarang (bukan Semarang yee, catet!) dengan ketinggian dataran sekitar 1.150 meter di atas permukaan laut.";
                    fasilitas = "Dengan memberikan keindahan pemandangan agar dapat memanjakan pengunjung dan memberikan ketenangan saat berada di taman dengan di kelilingi hamparan bunga dan juga pemandangan yang indah yaitu pegunungan garut." +
                            "\n" +
                            "Kebun mawar juga memiliki fasilitas restaurant untuk memanjakan perut pengunjung dengan menyediakan 3 jenis makanan yaitu : Makanan Tradisional, Makanan Nasional dan juga Makanan Western sehingga pengunjung dapat menentukan sesuai dengan seler maasing-masing." +
                            "\n" +
                            "Kebun Mawar juga melengkapi fasilitas Tempat Bermain anak yang berada di bagian agak atas sehingga pasti menarik dan memberika keseruan dengan beberapa wahana bermain yang disediakan. Anda juga dapat bermain bersama merpati yang di kembang biakkan pasti menambah keseruan liburan bersama keluarga.";
                    harga ="dikenakan biaya Rp. 15.000,-";
                    alamat = "Jl. Raya Kamojang KM. 5, Samarang, Sukakarya, Garut, Kabupaten Garut, Jawa Barat 44161Telepon: (0262) 4706006.";
                    akses = "Lewat Garut dari Kota Bandung (atau kalau dari Jakarta itu lewat Cipularang keluar di Cileunyi, lalu kalau weekend mau menghindari macet di Nagreg, bisa milih lewat Cijapati, kemarin kita sebenernya ‘disasarin Google Maps’ lewat siini eh kok ya malah lebih lancar (kalau dari peta itu alurnya naik ke Utara kalau ke arah Kamojang dari Garut).";
                    Intent deskripsi = new Intent(mContext, Deskripsi.class);
                    Toast.makeText(mContext, "Taman Bunga - Kebun Mawar", Toast.LENGTH_SHORT).show();
                    Bundle b = new Bundle();
                    b.putString("wisata" , namawisata);
                    b.putString("deswisata", deskrips);
                    b.putString("faswisata" , fasilitas);
                    b.putString("hrgwisata", harga);
                    b.putString("alwisata" , alamat);
                    b.putString("akwisata", akses);
                    deskripsi.putExtras(b);
                    mContext.startActivity(deskripsi);
                }
                if(pos.equals(taraje)){
                    namawisata = "Curug Sang Hyang Taraje";
                    deskrips = "Merupakan salah satu air terjun yang ada di daerah Garut. Curug atau air terjun Sang Hyang Taraje masih terbilang alami dan terletak kurang lebih 2 jam perjalanan dari kota Garut." +
                            "Curug dalam bahasa sunda berarti air terjun. Sang hyang merupakan sebutan kehormatan untuk dewa/raja zaman dulu. Sedangkan taraje dalam bahasa sunda berarti tangga. Menurut dongeng dari warga sekitar, curug ini merupakan tangga yang digunakan oleh dewa-dewa menuju kayangan.\n" +
                            "Mengenai legenda air terjun ini, disebutkan kalau air terjun ini digunakan oleh Sangkuriang mengambil bintang untuk Dayang sumbi." +
                            "Menurut legenda setempat, di dekat air terjun ini terdapat sebuah batu berbentuk tapak raksasa yang konon itu adalah tapak Sangkuriang tetapi jarang sekali orang yang dapat menemuinya. Sedangkan batu yang ada di bawah tepat air terjun menurut masyarakat setempat dipercaya sebagai tempat penyimpanan bintang (harta karun) Sangkuriang tetapi konon tempat itu dijaga oleh Belut raksasa.";
                    fasilitas = "-.";
                    harga ="-.";
                    alamat = "Desa Cibuluh, Cikajang, Jatiwangi, Pakenjeng, Kabupaten Garut, Jawa Barat 44164.";
                    akses = "Curug Sanghyang Taraje berada tepatnya di desa Kombongan wilayah Pakenjeng Kabupaten Garut berada di ketinggian 1000 Meter diatas permukaan laut dengan tinggi air terjun 100 Meter. Jarak dari ibu kota Kabupaten Garut kurang lebih 47 Km dapat ditempuh dengan menggunakan roda 4 dan roda 2 dengan waktu tempuh sekitar 2 jam. Kondisi jalan cukup baik meskipun tidak bisa disebut istimewa, di sepanjang perjalanan kita akan disuguhi pemandangan cantik undakan-undakan sawah lebih nyaman menggunakan kendaraan roda dua. kondisi jalan yang curam, berbatu dan sempit cukup beresiko, belum lagi area disekitar pos terakhir menuju curug sempit dan susah untuk parkir jika menggunakan kendaraan roda 4, apalagi kalo belum hafal medan dan kendaraan yang tidak fit.";
                    Intent deskripsi = new Intent(mContext, Deskripsi.class);
                    Toast.makeText(mContext, "Curug Sang Hyang Taraje", Toast.LENGTH_SHORT).show();
                    Bundle b = new Bundle();
                    b.putString("wisata" , namawisata);
                    b.putString("deswisata", deskrips);
                    b.putString("faswisata" , fasilitas);
                    b.putString("hrgwisata", harga);
                    b.putString("alwisata" , alamat);
                    b.putString("akwisata", akses);
                    deskripsi.putExtras(b);
                    mContext.startActivity(deskripsi);
                }
                if(pos.equals(cipanas)){
                    namawisata = "Komplek wisata pemandian dan hotel cipanas";
                    deskrips = "Pemandian Air Panas Cipanas sejak dahulu menjadi tempat wisata favorit bagi para wisatawan, baik wisatawan lokal maupun wisatawan mancanegara. Akses yang sangat mudah dijangkau dan fasilitas yang memang sangat lengkap di daerah cipanas ini menjadikannya sebagai target tujuan wisata dikala hari libur tiba, tak hanya hari-hari libur saja, Cipanas bahkan ramai di hari-hari biasa. Hotel, bungalou, penginapan dan kolam renang air panas semuanya ada di lokasi yang satu ini, fasilitas all in one yang ada membuat wisatawan kembali menjadikan tempat ini sebagai sarana rekreasi dan liburan yang sangat representatif dan mudah dijangkau. Titik lokasipun sangat mudah dicapai karena tidak jauh dari pusat kota.";
                    fasilitas = "Hotel, resort, pemandian air panas, dll.";
                    harga ="Bervariasi dari mulai yang grats sampai yang paling mahal mencapai 50.000.";
                    alamat = "Jln raya cipanas Kec tarogong kaler garut.";
                    akses = "-.";
                    Intent deskripsi = new Intent(mContext, Deskripsi.class);
                    Toast.makeText(mContext, "Komplek wisata pemandian dan hotel cipanas", Toast.LENGTH_SHORT).show();
                    Bundle b = new Bundle();
                    b.putString("wisata" , namawisata);
                    b.putString("deswisata", deskrips);
                    b.putString("faswisata" , fasilitas);
                    b.putString("hrgwisata", harga);
                    b.putString("alwisata" , alamat);
                    b.putString("akwisata", akses);
                    deskripsi.putExtras(b);
                    mContext.startActivity(deskripsi);
                }
                if(pos.equals(orok)){
                    namawisata = "Curug Orok";
                    deskrips = "Curug Orok memiliki ketinggian sekitar 45 m dan berada di ketinggian 250 meter di atas permukaan laut dengan konfigurasi umum lahan berbukit karena letaknya di kaki gunung Papandayan. \n" +
                            "Curug ini terdiri dari dua buah curug yaitu curug besar yang mana aliran airnya jatuh langsung dari atas tebing yang berasal dari aliran sungai di atasnya. Limpahan curahan air ini membentuk kolam air dibawahnya.  Kolam ini cukup besar dan tidak terlalu dalam sehingga dapat digunakan untuk sekedar mandi ataupun berendam.  Sedangkan curug yang kecil terdiri dari beberapa kucuran air yang keluar dari rembesan dinding tebingnya.\n" +
                            "Tak jauh dari curug ini sekitar 500 m juga terdapat curug lain yang bernama Curug Kembar. Curug ini masih satu aliran air dengan Curug Orok.";
                    fasilitas = "Didekat curug ini tersedia dua buah toilet yang sekaligus berfungsi sebagai tempat bilas.  Sayangnya kondisinya kurang baik bahkan mengenaskan. Untuk memdapatkan toilet yang lebih baik tersedia di area dekat parkir. \n" +
                            "Selain toilet yang lebih baik di area parkiran juga terdapat beberapa fasilitas seperti kolam renang, gazebo, area perkemahan, area permainan anak, penginapan, mushola, dan rumah makan.\n" +
                            "Area perparkiran cukup luas menampung kendaraan baik roda dua maupun empat.  Kapasitas area ini sekitar 500 m2 dengan daya tampung 10 bus, 20 mobil dan 50 motor.";
                    harga ="Tiket masuk adalah Rp 10000 per orang.  Bagi yang memabawa kendaraan dikenakan karcis tanda masuk kendaraan untuk roda dua sebesar Rp 1000 dan Rp 3000 untuk kendaraan roda empat.";
                    alamat = "Terletak di Desa Cikandang, Kecamatan Cikajang, Kabupaten Garut, Propinsi Jawa Barat.\n" +
                            "Peta dan Koordinat GPS: 7° 23' 16.81\" S  107° 44' 6.08\" E.";
                    akses = "Berejarak sekitar 9 km dari ibukota Kecamatan Cikajang, sedangkan dari ibukota Kabupaten Garut sekitar 31 Km. Dapat dicapai dengan kendaraan roda dua atau empat dengan kondisi jalan aspal cukup baik.  Waktu tempuh menuju lokasi ini sekitar 1,5 jam perjalanan dari pusat kota Garut.\n" +
                            "Bila menggunakan kendaraan pribadi dari kota Garut perjalanan di arahkan ke kecamatan Cikajang.  Sesampainya di kecamatan ini akan ditemui pertigaan yang dikenal dengan nama pertigaan Papanggungan.  Ambil belokan ke kanan ke arah Curug Orok, selanjutnya ikuti jalan tersebut hingga tiba di jalan masuk ke lokasi wisata yang ditandai dengan adanya plang di sebelah kiri jalan “Wana Wisata dan Bumi Perkemahan Angling Darma: Curug Orok, Ci Kahuripan, Curug Kembar”. \n" +
                            "Setibanya di gerbang pintu masuk tersebut, perjalanan diteruskan ke pelataran parkir yang berjarak sekitar 500 m dengan konsisi jalan tanah yang sudah dikeraskan.  Sebelum tiba di area parkir akan ditemui pos jaga sekaligus loket tiket masuk.";
                    Intent deskripsi = new Intent(mContext, Deskripsi.class);
                    Toast.makeText(mContext, "Curug Orok", Toast.LENGTH_SHORT).show();
                    Bundle b = new Bundle();
                    b.putString("wisata" , namawisata);
                    b.putString("deswisata", deskrips);
                    b.putString("faswisata" , fasilitas);
                    b.putString("hrgwisata", harga);
                    b.putString("alwisata" , alamat);
                    b.putString("akwisata", akses);
                    deskripsi.putExtras(b);
                    mContext.startActivity(deskripsi);
                }
                if(pos.equals(pguha)){
                    namawisata = "Pantai Puncak Guha";
                    deskrips = "Salah satu pantai selatan di wilayah kabupaten Garut yang masih belum banyak terjamah adalah pantai Puncak Guha . Pantai ini mulai banyak dikunjungi setelah ter-ekspose dalam novel perahu kertas karya salah satu novelis indonesia , Dewi Lestari ( Dee ) .\n" +
                            "Pantai ini terletak dekat sekali dengan pantai Rancabuaya , sehinga bisa anda jadikan satu paket perjalanan saat berkunjung kesana.";
                    fasilitas = "Dua gazebo tempat istirahat.";
                    harga ="Dengan tiket masuk Rp 5000 saja, anda sudah bisa masuk ke area ini.";
                    alamat = "Sinarjaya, Bungbulang, Purbayani, Caringin, Kabupaten Garut, Jawa Barat.";
                    akses = "Untuk menuju lokasi anda bisa menempuh jalur yang sama ke arah pantai Rancabuaya. Pantai ini terletak kurang lebih 2 kilometer dari Rancabuaya sehingga cukup mudah dijangkau. Lokasi ini hanya di tandai dengan gerbang sederhana di pinggi jalan, tapi cukup mudah untuk dicari .\n" +
                            "Rute Menuju Puncak Guha antara lain dapat ditempuh melalui ;\n" +
                            "- Rute Bandung – Pangalengan – Rancabuaya – Puncak Guha . Jalur ini lebih disarankan karena sudah mulus . Kondisi jalan rusak / dalam perbaikan di beberapa tempat saja .\n" +
                            "- Rute Garut – Cikajang – Pameungpeuk – Rancabuaya . Pantai Puncak Guha terletak sekitar 2 kilometer sebelum Rancabuaya.";
                    Intent deskripsi = new Intent(mContext, Deskripsi.class);
                    Toast.makeText(mContext, "Pantai Puncak Guha", Toast.LENGTH_SHORT).show();
                    Bundle b = new Bundle();
                    b.putString("wisata" , namawisata);
                    b.putString("deswisata", deskrips);
                    b.putString("faswisata" , fasilitas);
                    b.putString("hrgwisata", harga);
                    b.putString("alwisata" , alamat);
                    b.putString("akwisata", akses);
                    deskripsi.putExtras(b);
                    mContext.startActivity(deskripsi);
                }
                if(pos.equals(santolo)){
                    namawisata = "Pantai Santolo";
                    deskrips = "Bentangan pasir putih serta keindahan panorama pantai yang sejuk dipandang mata akan memanjakan kita saat berkunjung ke pantai santolo, dermaga yang berdiri kokoh akan menemani dan menjadi saksi bisu keindahan dan kenyamanan panorama pantai saat kita bersantai bersama keluarga atau bersama pasangan. Pembangunan yang dialami pantai ini tidak mempengaruhi terhadap pesona keindahan pantai yang alami. Santolo adalah sebuah kawasan tempat berlabuh dan berkumpulnya para nelayan tradisional, wisata pantai santolo sangat populer di di daerah Jawa Barat bahkan kepopulerannya mampu menyedot banyak wisatawan dari kota metropolitan (Bandung), Jakarta, Bekasi. Pantai santolo ini terletak di daerah Garut bagian selatan, tepatnya di kecamatan Cikelet, Untuk sampai di pantai santolo jika kita berangkat dari kota Garut jarak tempuh perjalanan kira-kira 88 km, atau sekitar 3,5 jam. Dengan kata lain jika ingin bewisata ke santolo yang pertama di tuju adalah kota Garut selanjutnya ke pantai santolo.";
                    fasilitas = "Losmen dan penginapan kelas menengah dengan biaya yang sangat terjangkau,\n" +
                            "Adanya rumah-rumah penduduk yang terletak disekitar pantai yang bisa di sewa dengan harga yang relatif murah. Jika kita berencana untuk tinggal dalam waktu yang lama tentu sangat membantu dalam hal keuangan :D.\n" +
                            "Perahu Sewaan yang akan melayani wisatawan untuk menikmati panorama laut selatan yang terkenal indah dengan deburan ombaknya.\n" +
                            "Kios-kios cinderamata yang menyajikan aneka ragam cinderamata hasil karya penduduk setempat atau oleh-oleh khas Garut\n" +
                            "Warung-warung sederhana beratap daun kelapa dan terpal yang menyediakan makanan dan jajanan ringan, selain itu di warung-warung ini kita bisa menikmati makanan yang segar seperti bakar ikan, bakar kerang dan makanan loain yang berasal dari hasil nelayan setempat.\n" +
                            "Perahu penyebrangan dengan ongkos hanya 2.000,- / oranng. Dengan perahu ini kita akan di bawa menyeberangi muara.\n" +
                            "Lembaga Penerbangan dan Antariksa Nasional (LAPAN). Jika kita sempat, sebelum memasuki gerbang Pantai Santolo kita akan menlihat sebuah tempat yang agak aneh yakni sebuah tempat peluncuran roket yang merupakan Lembaga Penerbangan dan Antariksa Nasional (LAPAN), ini akan menambah seru perjalanan wisata kita.";
                    harga ="Dengan tiket masuk Rp 10000 saja, anda sudah bisa masuk ke area ini.";
                    alamat = "Kecamatan Cikelet, Kabupaten Garut, Provinsi Jawa Barat.";
                    akses = "- Jalur pertama adalah menuju ke terminal Garut-dilanjutkan ke santolo.\n" +
                            "Santolo GarutJalur ini melewati jalan nasional timur dan utara yang langsung menuju kota garut, jalur ini biasanya di lewati oleh wisatawan yajng berasal dari Jakarta, Bekasi, Bandung, Tasikmalaya, Sumedang dan sekitar kota yang berada di sebelah timur dan utara kota garut. Jasa transportasi yang di gunakan sangat beragam mulai bus, mini bus dan kereta api. Khusu untuk keereta api biasanya berhenti di Stasiun Malangbong, Stasiun Cibatu, dan Stasiun Leles.\n" +
                            "- Jalur yang kedua adalah melewati perbatasan cianjur (Kec.Cidaun). Melewati Jalan lintas selatan Jawa barat, atau melewati ranca bali-Naringgul-Cidaun-Rancabuaya-Santolo.\n" +
                            "Jalur ini biasa digunakan oleh wisatawan yang berasal dari Cianjur, Bogor, Sukabumi dan sebagian daerah dari kabupaten bandung seperti Ciwidey dan Soreang.";
                    Intent deskripsi = new Intent(mContext, Deskripsi.class);
                    Toast.makeText(mContext, "Pantai Santolo", Toast.LENGTH_SHORT).show();
                    Bundle b = new Bundle();
                    b.putString("wisata" , namawisata);
                    b.putString("deswisata", deskrips);
                    b.putString("faswisata" , fasilitas);
                    b.putString("hrgwisata", harga);
                    b.putString("alwisata" , alamat);
                    b.putString("akwisata", akses);
                    deskripsi.putExtras(b);
                    mContext.startActivity(deskripsi);
                }



            }
        });
    }

    /**
     * Showing popup menu when tapping on 3 dots
     */
    private void showPopupMenu(View view) {
        // inflate menu
        PopupMenu popup = new PopupMenu(mContext, view);
        MenuInflater inflater = popup.getMenuInflater();
        inflater.inflate(R.menu.menu_rincian, popup.getMenu());
        popup.setOnMenuItemClickListener(new MyMenuItemClickListener());
        popup.show();
    }

    /**
     * Click listener for popup menu items
     */
    class MyMenuItemClickListener implements PopupMenu.OnMenuItemClickListener {

        public MyMenuItemClickListener() {
        }

        @Override
        public boolean onMenuItemClick(MenuItem menuItem) {
            switch (menuItem.getItemId()) {
                case R.id.action_lihat_deskripsi:
                    Intent deskripsi = new Intent(mContext, Deskripsi.class);
                    Toast.makeText(mContext, "Membuka Deskripsi Wisata", Toast.LENGTH_SHORT).show();
                    Bundle b = new Bundle();
                    b.putString("wisata" , namawisata +"\n");
                    deskripsi.putExtras(b);
                    mContext.startActivity(deskripsi);
                    return true;
                default:
            }
            return false;
        }
    }

    @Override
    public int getItemCount() {
        return daftarWisata.size();
    }
}
