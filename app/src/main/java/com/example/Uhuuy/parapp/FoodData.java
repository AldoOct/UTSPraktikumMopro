package com.example.Uhuuy.parapp;

import java.util.ArrayList;

public class FoodData {
    private static String[] wisataNames = {
            "Ayam Penyet",
            "Baso",
            "Bebek Peking",
            "Gado-Gado",
            "Gulai",
            "Mie",
            "Nasi Goreng",
            "Pempek",
            "Rendang",
            "Sate Ayam"
    };

    private static String[] wisataDetails = {
            "Ayam Penyet adalah makana yang ada di indoensia, yang rasanya sangat enak, dan bisa membuat pemakannya ketagihan lagi dan lagi, makanan ini berasal dari jawa barat. Sebenarnya Penyet berasal dari Bahasa Jawa yang bermakna 'lumat. Bahannya di masak lumat di hidangkan dengan sambal khas yang di tumbuk lumat , di makan bersama nasi putih, tempe, tahu dan ulam ulaman.",
            "Bakso atau baso adalah jenis bola daging yang lazim ditemukan pada masakan Indonesia.[2] Bakso umumnya dibuat dari campuran daging sapi giling dan tepung tapioka, akan tetapi ada juga bakso yang terbuat dari daging ayam, ikan, atau udang bahkan daging kerbau. Dalam penyajiannya, bakso umumnya disajikan panas-panas dengan kuah kaldu sapi bening, dicampur mi, bihun, taoge, tahu, terkadang telur dan ditaburi bawang goreng dan seledri. Bakso sangat populer dan dapat ditemukan di seluruh Indonesia; dari gerobak pedagang kaki lima hingga restoran besar. Berbagai jenis bakso sekarang banyak ditawarkan dalam bentuk makanan beku yang dijual di pasar swalayan ataupun mal-mal. Irisan bakso dapat juga dijadikan pelengkap jenis makanan lain seperti mi goreng, nasi goreng, atau cap cai.",
            "Bebek Peking dibuat menggunakan daging bebek khusus diternakkan untuk makanan ini. Bebek-bebek digemukkan dengan cara memberikan makanan bergizi, pada saat bebek-bebek kekenyangan, peternak-peternak mungkin saja memasukkan makanan ke dalam kerongkongan sang bebek secara paksa. Ini yang kemudian menjadikan bebek Peking juga dikenal dengan nama bebek isi. Bebek tadi disajikan setelah dipanggang dengan kayu-kayu bakar khusus yang akan menambah wangi daging bebek yang dipanggang.",
            "Gado Gado adalah salah satu makanan yang berasal dari Indonesia yang berupa sayur-sayuran yang direbus dan dicampur jadi satu, dengan bumbu atau saus dari kacang tanah yang dihaluskan disertai irisan telur dan di atasnya ditaburkan bawang goreng dan sedikit emping goreng juga kerupuk ada juga yang memakai kerupuk udang.",
            "Gulai adalah masakan berbahan baku daging ayam, aneka ikan, kambing, sapi, jeroan, atau sayuran seperti nangka muda dan daun singkong, yang diolah dalam kuah bumbu rempah yang bercita rasa gurih. Ciri khas gulai adalah bumbunya yang kaya rempah antara lain kunyit, ketumbar, lada, lengkuas, jahe, cabai merah, bawang merah, bawang putih, adas, pala, serai, kayu manis dan jintan yang dihaluskan, dicampur, kemudian dimasak dalam santan.",
            "Indomie Mi Goreng merupakan salah satu tipe mi instan yang dibuat dengan merek Indomie oleh perusahaan Indofood, penghasil mi instan terbesar di dunia yang terletak di Indonesia.",
            "Nasi goreng adalah sebuah makanan berupa nasi yang digoreng dan diaduk dalam minyak goreng atau margarin, biasanya ditambah kecap manis, bawang merah, bawang putih, asam jawa, lada dan bumbu-bumbu lainnya, seperti telur, ayam, dan kerupuk. Ada pula nasi goreng jenis lain yang dibuat bersama ikan asin yang juga populer di seluruh Indonesia.",
            "Pempek atau empek-empek adalah makanan khas Palembang yang terbuat dari daging ikan yang digiling lembut dan tepung kanji (secara salah kaprah sering disebut sebagai \"tepung sagu\"), serta beberapa komposisi lain seperti telur, bawang putih yang dihaluskan, penyedap rasa dan garam. Sebenarnya sulit untuk mengatakan bahwa penganan pempek pusatnya adalah di Palembang karena hampir semua daerah di Sumatera Selatan memproduksinya.",
            "Rendang atau randang adalah masakan daging dengan bumbu rempah-rempah yang berasal dari Minangkabau. Masakan ini dihasilkan dari proses memasak yang dipanaskan berulang-ulang menggunakan santan sampai kuahnya kering sama sekali. Proses memasaknya memakan waktu berjam-jam (biasanya sekitar empat jam) hingga yang tinggal hanyalah potongan daging berwarna hitam pekat.",
            "Sate Ayam adalah makanan khas Indonesia. Sate Ayam dibuat dari daging ayam. Pada umumnya sate ayam dimasak dengan cara dipanggang dengan menggunakan arang dan disajikan dengan pilihan bumbu kacang atau bumbu kecap. Sate ini biasanya disajikan bersama dengan lontong atau nasi."
    };

    private static int[] wisataImages = {
            R.drawable.ayam_penyet,
            R.drawable.baso,
            R.drawable.bebek_peking,
            R.drawable.gado_gado,
            R.drawable.gulai,
            R.drawable.mie,
            R.drawable.nasi_goreng,
            R.drawable.pempek,
            R.drawable.rendang,
            R.drawable.sate_ayam
    };

    static ArrayList<Food> getListData() {
        ArrayList<Food> list = new ArrayList<>();
        for (int position = 0; position < wisataNames.length; position++) {
            Food makanan = new Food();
            makanan.setName(wisataNames[position]);
            makanan.setDetail(wisataDetails[position]);
            makanan.setPhoto(wisataImages[position]);
            list.add(makanan);
        }
        return list;
    }
}
