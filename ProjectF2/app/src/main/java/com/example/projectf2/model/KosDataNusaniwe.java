package com.example.projectf2.model;

import java.util.ArrayList;


import com.example.projectf2.model.Kos;
import com.example.projectf2.R;

    public class KosData {
        private static String[] kosNames = {
                "Kos Putri Wailela",
                "Kos Roberth Wattimena",
                "Kos Waihaong Jaya",
                "Kos Coker Putri",
                "Kos Coker Putra",
                "Kos Abadi",
                "Kos Cahaya Ilahi",
                "Kos Indah Luhukai",
                "Kos Bersih Rapih",
                "Kos Bagus Sekali"
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
                R.drawable.satu,
                R.drawable.dua,
                R.drawable.tiga,
                R.drawable.empat,
                R.drawable.lima,
                R.drawable.enam,
                R.drawable.tujuh,
                R.drawable.delapan,
                R.drawable.sembilan,
                R.drawable.sepuluh
        };

        public static ArrayList<Kos> getListData() {
            ArrayList<Kos> list = new ArrayList<>(  );
            for ( int position = 0; position <kosNames.length; position++){
                Kos kos= new Kos();
                kos.setName( kosNames[position] );
                kos.setDetails( kosDetails[position] );
                kos.setPhoto( kosImages[position] );
                list.add(kos);
            }
            return list;
        }
    }

