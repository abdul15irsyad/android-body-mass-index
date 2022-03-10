package com.example.bodymassindex;

public class HitungBMI {
    private double beratBadan;
    private double tinggiBadan;
    private String statusBMI;

    // fungsi konstruktor
    public HitungBMI(double bb, double tb){
        this.beratBadan = bb;
        this.tinggiBadan = tb;
    }

    // fungsi untuk mengubah nilai berat badan
    public void setBeratBadan(double beratBadan) {
        this.beratBadan = beratBadan;
    }

    // fungsi untuk mengambil nilai berat badan
    public double getBeratBadan() {
        return beratBadan;
    }

    // fungsi untuk mengubah nilai tinggi badan
    public void setTinggiBadan(double tinggiBadan) {
        this.tinggiBadan = tinggiBadan;
    }

    // fungsi untuk mengambil nilai tinggi badan
    public double getTinggiBadan() {
        return tinggiBadan;
    }

    // fungsi untuk mengubah nilai status berat badan
    public void setStatusBMI(String statusBMI) {
        this.statusBMI = statusBMI;
    }

    // fungsi untuk mengambil nilai status berat badan
    public String getStatusBMI() {
        return statusBMI;
    }

    // fungsi untuk menghitung BMI
    public String hasilBMI(){
        double bmi = this.beratBadan/Math.pow(this.tinggiBadan,2);
        String result = "";
        if(bmi < 18.5){
            result = "Kekurangan Berat Badan";
        }else if(bmi >= 18.5 && bmi < 25){
            result = "Normal";
        }else if(bmi >= 25 && bmi < 30){
            result = "Kelebihan Berat Badan";
        }else if(bmi > 30){
            result = "Kegemukan";
        }
        return result;
    }
}
