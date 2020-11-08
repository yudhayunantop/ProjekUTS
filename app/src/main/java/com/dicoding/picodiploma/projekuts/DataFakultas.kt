import com.dicoding.picodiploma.projekuts.R
import com.dicoding.picodiploma.projekuts.fakultas


object DataFakultas {
    private val fakultasNames = arrayOf(
            "FAKULTAS ARSITEKTUR DAN DESAIN",
            "FAKULTAS EKONOMI DAN BISNIS",
            "FAKULTAS ILMU KOMPUTER",
            "FAKULTAS PERTANIAN",
            "FAKULTAS HUKUM",
            "FAKULTAS ILMU SOSIAL DAN ILMU POLITIK",
            "FAKULTAS TEKNIK",
            "PROFIL SAYA"
    )

    private val fakultasWeb = arrayOf(
            "http://fad.upnjatim.ac.id/",
            "http://febis.upnjatim.ac.id/",
            "https://fik.upnjatim.ac.id/",
            "http://faperta.upnjatim.ac.id/",
            "http://fhukum.upnjatim.ac.id/",
            "http://fisip.upnjatim.ac.id/",
            "http://ft.upnjatim.ac.id/",
            "https://github.com/yudhayunantop"
    )

    val jurusanWeb = arrayOf(
            arrayOf("http://dkv.upnjatim.ac.id/", "http://arsitektur.upnjatim.ac.id/"),
            arrayOf("http://ekbang.upnjatim.ac.id/", "http://akuntansi.upnjatim.ac.id/", "http://manajemen.upnjatim.ac.id/"),
            arrayOf("http://if.upnjatim.ac.id/", "http://sisfo.upnjatim.ac.id/", "https://fik.upnjatim.ac.id/"),
            arrayOf("http://agrotek.upnjatim.ac.id/", "http://agribis.upnjatim.ac.id/"),
            arrayOf("http://fhukum.upnjatim.ac.id/"),
            arrayOf("https://adneg.upnjatim.ac.id/", "https://adbis.upnjatim.ac.id/", "http://hubint.upnjatim.ac.id/", "http://ilkom.upnjatim.ac.id/"),
            arrayOf("http://tekkimia.upnjatim.ac.id/", "http://tekindustri.upnjatim.ac.id/", "http://teksipil.upnjatim.ac.id/", "http://teklingk.upnjatim.ac.id/", "http://tekpang.upnjatim.ac.id/", "https://ft.upnjatim.ac.id/"),
            arrayOf("https://github.com/yudhayunantop")
    )

    private val fakultasEmail = arrayOf(
            "fad@upnjatim.ac.id",
            "feb@upnjatim.ac.id",
            "fik@upnjatim.ac.id",
            "faperta@upnjatim.ac.id",
            "fhukum@upnjatim.ac.id",
            "fisip@upnjatim.ac.id",
            "ft@upnjatim.ac.id",
            "yudha.yunanto.2010@gmail.com"
    )

    private val fakultasDetails = arrayOf(
            "Fakultas Arsitektur dan Desain merupakan salah satu dari 7 Fakultas di UPN Veteran Jawa Timur yang terdiri dari program studi:\n" +
                    "\n 1. Desain Komunikasi dan Visual \n 2. Arsitektur",
            "Fakultas Ekonomi dan Bisnis merupakan salah satu dari 7 Fakultas di UPN Veteran Jawa Timur yang terdiri dari program studi:\n" +
                    "\n 1. Ekonomi Manajemen \n 2. Ekonomi Akutansi \n 3. Ekonomi Pembangunan \n 4. Magister Akutansi \n 5. Magister Manajemen",
            "Fakultas Ilmu Komputer merupakan salah satu dari 7 Fakultas di UPN Veteran Jawa Timur yang terdiri dari program studi:\n" +
                    "\n 1. Sistem Informasi \n 2. Informatika \n 3. Sains Data",
            "Fakultas Pertanian merupakan salah satu dari 7 Fakultas di UPN Veteran Jawa Timur yang terdiri dari program studi:\n" +
                    "\n 1. Agribisnis \n 2. Agroteknologi \n 3. Magister Agribisnis \n 4. Magister Agroteknologi",
            "Fakultas Hukum merupakan salah satu dari 7 Fakultas di UPN Veteran Jawa Timur yang terdiri dari program studi:\n" +
                    "\n 1. Hukum",
            "Fakultas Ilmu Sosial dan Politik merupakan salah satu dari 7 Fakultas di UPN Veteran Jawa Timur yang terdiri dari program studi:\n" +
                    "\n 1. Administrasi Negara \n 2. Administrasi Bisnis \n 3. Hubungan Internasional \n 4. Ilmu Komunikasi \n 5. Pariwisata",
            "Fakultas Teknik merupakan salah satu dari 7 Fakultas di UPN Veteran Jawa Timur yang terdiri dari program studi:\n" +
                    "\n 1. Teknik Industri \n 2. Teknik Kimia \n 3. Teknik Lingkungan \n 4. Teknik Sipil \n 5. Teknologi Pangan",
            "Nama           : Yudha Yunanto Putra\n" +
                    "TTL            : Surabaya, 30 Mei 2000\n" +
                    "Alamat         : Jl. Wonorejo Rungkut 1/5\n" +
                    "No. HP         : 082135888551\n" +
                    "\n Riwayat Pendidikan : \n 1. SDN Wonorejo 274 \n 2. SMPN 12 Surabaya \n 3. SMAM 2 Surabaya"
    )

    private val fakultasImages = intArrayOf(
        R.drawable.fad,
        R.drawable.feb,
        R.drawable.fik,
        R.drawable.faperta,
        R.drawable.hukum,
        R.drawable.fisip,
        R.drawable.ft,
        R.drawable.profil
    )

        val listFakultas: ArrayList<fakultas>
            get() {
                val list = arrayListOf<fakultas>()
                for (position in fakultasNames.indices) {
                    val fakultas = fakultas(
                            fakultasNames[position],
                            fakultasDetails[position],
                            fakultasImages[position],
                            fakultasWeb[position],
                            fakultasEmail[position],
                            jurusanWeb[position]
                    )
//                    fakultas.name = fakultasNames[position]
//                    fakultas.detail = fakultasDetails[position]
//                    fakultas.photo = fakultasImages[position]
//                    fakultas.web = fakultasWeb[position]
//                    fakultas.email = fakultasEmail[position]
//                    fakultas.linkJurusan = jurusanWeb[position]
                    list.add(fakultas)
                }
                return list
            }

}