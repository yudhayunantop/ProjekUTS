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
        "null"
    )

    private val fakultasEmail = arrayOf(
        "tu.fad@upnjatim.ac.id",
        "tu.febis@upnjatim.ac.id",
        "tu.fik@upnjatim.ac.id",
        "tu.faperta@upnjatim.ac.id",
        "tu.fhukum@upnjatim.ac.id",
        "tu.fisip@upnjatim.ac.id",
        "tu.ft@upnjatim.ac.id",
        "null"
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
                    "E-mail         : yudha.yunanto.2010@gmail.com\n" +
                    "Github         : https://github.com/yudhayunantop\n" +
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
                    val fakultas = fakultas()
                    fakultas.name = fakultasNames[position]
                    fakultas.detail = fakultasDetails[position]
                    fakultas.photo = fakultasImages[position]
                    fakultas.web = fakultasWeb[position]
                    fakultas.email = fakultasEmail[position]
                    list.add(fakultas)
                }
                return list
            }
}