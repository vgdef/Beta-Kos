package com.example.projectf2.model;

import com.example.projectf2.R;

import java.util.ArrayList;

public class KosDataTelukAmbon {

        private static String[] kosNames = {
                "Kos Bersih Rapih",

                "Kos Roberth Wattimena",
                "Kos Waihaong Jaya",
                "Kos Coker Putri",
                "Kos Coker Putra",
                "Kos Bagus Sekali",
                "Kos Cahaya Ilahi",
                "Kos Abadi",
                "Kos Indah Luhukai",
                "Kos Putri Wailela",

        };

        private static String[] kosDetails = {
                "Jl. Dr. Kayadoe, No 7 RT/RW 004/05, Kudamati(Lorong Aman)",
                "Jl. Pattimura No, 1 RT/RW 005/06 Tanah Tingi (Fardeis)",
                "Jl. Nona Sar Sopacua No, 9 RT/RW 009/001 Wainitu(Lorong Siloam)",
                "Jl. Putuhena No.10 RT/RW 002/003 Wailela (Lorong SD 32 Negeri Ambon)",
                "Jl. Dr. Kayadoe, No 7 RT/RW 004/05, Kudamati(Lorong Aman)",
                "Jl. Dr. Kayadoe, No 7 RT/RW 004/05, Kudamati(Lorong Aman)",
                "Jl. Dr. Kayadoe, No 7 RT/RW 004/05, Kudamati(Lorong Aman)",
                "Jl. Dr. Kayadoe, No 7 RT/RW 004/05, Kudamati(Lorong Aman)",
                "Jl. Dr. Kayadoe, No 7 RT/RW 004/05, Kudamati(Lorong Aman)",
                "Jl. Dr. Kayadoe, No 7 RT/RW 004/05, Kudamati(Lorong Aman)"
        };

        private static int[] kosImages = {
                R.drawable.sepuluh,
                R.drawable.delapan,
                R.drawable.tiga,
                R.drawable.enam,
                R.drawable.empat,
                R.drawable.lima,
                R.drawable.dua,
                R.drawable.tujuh,
                R.drawable.sembilan,
                R.drawable.satu

        };

        public static ArrayList<Kos> getListData() {
            ArrayList<Kos> list = new ArrayList<>(  );
            for ( int position = 0; position <kosNames.length; position++){
                Kos kos= new Kos();
                kos.setNameeee( kosNames[position] );
                kos.setDetailssss( kosDetails[position] );
                kos.setPhotoooo( kosImages[position] );
                list.add(kos);
            }
            return list;
        }
    }



