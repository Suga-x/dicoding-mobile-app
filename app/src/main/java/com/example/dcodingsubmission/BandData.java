package com.example.dcodingsubmission;

import java.util.ArrayList;

public class BandData {
    private static String[] bandName ={
            "Metalica",
            "Pierce the Veil",
            "My Chemical Romance",
            "Avenged Sevenfold",
            "Nirvana",
            "Bring Me The Horizon",
            "Muse",
            "Green Day",
            "5 Second Of Summer",
            "Fall out boy"
    };
    private static String[] bandDesc = {
            "Metallica is an American heavy metal band. The band was formed in 1981 in Los Angeles by vocalist/guitarist James Hetfield and drummer Lars Ulrich, and has been based in San Francisco for most of its career.",
            "Pierce the Veil is an American rock band from San Diego, California, United States. Formed in 2006, the band was founded by brothers Vic and Mike Fuentes after the disbandment of the group Before Today, which was formed out of the San Diego punk rock scene.",
            "My Chemical Romance (commonly abbreviated to MCR or My Chem) is an American rock band from Newark, New Jersey.",
            "Avenged Sevenfold (sometimes abbreviated as A7X) is an American heavy metal band from Huntington Beach, California, formed in 1999.",
            "Nirvana was an American rock band formed in Aberdeen, Washington in 1987. Founded by lead singer and guitarist Kurt Cobain and bassist Krist Novoselic",
            "Bring Me the Horizon (often abbreviated as BMTH) are a British rock band formed in Sheffield in 2004. The group consists of lead vocalist Oliver Sykes",
            "Muse are an English rock band from Teignmouth, Devon, formed in 1994.",
            "Green Day is an American rock band formed in the East Bay of California in 1987 by lead vocalist and guitarist Billie Joe Armstrong and bassist and backing vocalist Mike Dirnt.",
            "5 Seconds of Summer, often shortened to 5SOS (pronounced as '5 sos'), are an Australian pop rock band from Sydney, New South Wales, formed in late 2011.",
            "Fall Out Boy is an American rock band formed in Wilmette, Illinois, a suburb of Chicago, in 2001. "
    };
    private static  int[] bandThumbnailImage ={
            R.drawable.metallicatmb,
            R.drawable.piercetheveiltmb,
            R.drawable.mcrtmb,
            R.drawable.a7xtmb,
            R.drawable.nirvanatmb,
            R.drawable.bmthtmb,
            R.drawable.musetmb,
            R.drawable.greendaytmb,
            R.drawable.sostmb,
            R.drawable.fobtmb,
    };
    private static  int [] bandPoster ={
            R.drawable.metallica,
            R.drawable.ptv,
            R.drawable.mcr,
            R.drawable.a7x,
            R.drawable.nirvana,
            R.drawable.bmth,
            R.drawable.muse,
            R.drawable.greenday,
            R.drawable.sos,
            R.drawable.fallout,
    };
    static ArrayList<Band> getListData(){
        ArrayList<Band> listBand =new ArrayList<>();
        for (int i = 0; i<bandName.length; i++){
            Band band = new Band();
            band.setNamaBand(bandName[i]);
            band.setDescBand(bandDesc[i]);
            band.setFotothumbnail(bandThumbnailImage[i]);
            band.setFotoPoster(bandPoster[i]);
            listBand.add(band);
        }
        return listBand;
    }
}
