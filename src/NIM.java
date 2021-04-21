public class NIM {

    private String nim;

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getJenisKelamin(){
        char kodeJk = nim.charAt(6);
        if(kodeJk == '1'){
            return "Laki-laki";
        }else if(kodeJk == '2'){
            return "Perempuan";
        }
        return "UNKNOWN";
    }
    public String getJenjang(){
        char kodeJ = nim.charAt(0);
        if(kodeJ == '1'){
            return "S1(Sarjana)";
        }else if(kodeJ == '2'){
            return "S2(Magister)";
        }else if(kodeJ == '2'){
            return "S3(Doktor)";
        }
        return "UNKNOWN";
    }
    public String getTahun(){
        String kodeT = nim.substring(1,3);
        return "20"+kodeT;
    }
    public String getFakultas(){
        char kodeF = nim.charAt(3);
        if(kodeF == '1'){
            return"Tarbiah dan Keguruan";
        }else if(kodeF == '2'){
            return "Syariah dan Hukum";
        }else if(kodeF == '3'){
            return "Ushuluddin";
        }else if(kodeF == '4'){
            return "Dakwah & Komunikasi";
        }else if(kodeF == '5'){
            return "Sains & Teknologi";
        }else if(kodeF == '6'){
            return "Psikologi";
        }else if(kodeF == '7'){
            return "Ekonomi & Ilmu Sosial";
        }else if(kodeF == '8'){
            return "Pertanian & Peternakan";
        }
        return "UNKNOWN";
    }
    public String getJurusan(){
        char kodeP = nim.charAt(5);
        if(kodeP == '1'){
            return"Teknik Informatika";
        }else if(kodeP == '2'){
            return "Teknik Industri";
        }else if(kodeP == '3'){
            return "Sistem Informasi";
        }else if(kodeP == '4'){
            return "Matematika";
        }else if(kodeP == '5'){
            return "Teknik Elektro";
        }
        return "UNKNOWN";
    }
    public String getNomorUrut(){
        String kodeN = nim.substring(7);
        return kodeN;
    }
}



