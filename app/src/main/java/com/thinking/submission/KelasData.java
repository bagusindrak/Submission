package com.thinking.submission;

import java.util.ArrayList;

public class KelasData {
    private static String[] kelasDaftar = {
            "Menjadi Android Developer Expert",
            "Belajar Dasar-Dasar Azure Cloud",
            "Memulai Pemrograman Dengan Python",
            "Belajar Dasar Pemrograman Web",
            "Memulai Pemrograman Dengan Java",
            "Source Code Management untuk Pemula",
            "Belajar Membuat Aplikasi Kognitif",
            "Belajar Membuat Game dengan Construct 2",
            "Belajar Membuat Augmented Reality",
            "Memulai Pemrograman Dengan Kotlin"
    };

    private static String[] kelasDetail = {
            "Jadilah expert di dunia pemrograman Android. Materi disusun oleh Dicoding sebagai Google Authorized Training Partner.",
            "Cloud Computing adalah #1 hard skill di lebih dari 140 negara, dan membantu dalam hosting web app, backend mobile app, dan Computer Vision.",
            "Belajar Bahasa Python - Fundamental berbagai tren Industri saat ini : Data Science, Machine Learning, Infrastructure-management",
            "Ingin bisa membuat website? Pelajari komponen dasar seperti HTML, CSS dan JavaScript pada kurikulum kelas ini.",
            "Belajar Bahasa Java buat kamu yang ingin mempelajari konsep Pemrograman Berorientasi Objek (PBO) terpopuler untuk mengembangkan aplikasi.",
            "Pelajari teknik berkolaborasi antara developer, di dunia development aplikasi, menggunakan source code management (version control).",
            "Kelas ini didesain untuk developer yang ingin mempelajari aplikasi kognitif dengan menggunakan teknologi IBM Watson.",
            "Awali karirmu jadi game developer pemula menggunakan Construct 2 Free Edition yang dapat diunduh secara bebas atau gratis.",
            "Di era Industri 4.0 saat ini, teknologi Augmented Reality menjadi masa depan yang canggih.",
            "Kelas pengantar untuk mempelajari Functional Programming serta Object-Oriented Programming menggunakan Kotlin"
    };

    private static int[] kelasImages = {
            R.drawable.menjadi_android_developer_expert_logo,
            R.drawable.belajar_dasar_dasar_azure_cloud_logo,
            R.drawable.memulai_pemrograman_dengan_python_logo,
            R.drawable.web_fundamental_logo,
            R.drawable.java_fundamental_logo,
            R.drawable.belajar_version_control_logo,
            R.drawable.belajar_membuat_aplikasi_kognitif_logo,
            R.drawable.belajar_membuat_game_dengan_construct_2_logo,
            R.drawable.belajar_membuat_augmented_reality_logo,
            R.drawable.kotlin_fundamental_logo
    };



    static ArrayList<Kelas> getListData() {
        ArrayList<Kelas> list = new ArrayList<>();
        for (int position = 0; position < kelasDaftar.length; position++) {
            Kelas hero = new Kelas();
            hero.setName(kelasDaftar[position]);
            hero.setDetail(kelasDetail[position]);
            hero.setPhoto(kelasImages[position]);
            list.add(hero);
        }
        return list;
    }
}
