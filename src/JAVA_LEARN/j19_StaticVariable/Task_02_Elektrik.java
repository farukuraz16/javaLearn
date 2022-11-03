package JAVA_LEARN.j19_StaticVariable;

public class Task_02_Elektrik {

	/*
    Task 02 ->
    ElektirikHesap Class:  fields : toplamTuketim(int), oran(double), fatura(double)
    Müşteriye ait tüketilen enerjiyi toplamTuketim'e toplayan tüketimEkle method
    oran(0.7)  katsaysı ile  toplamTuketim çarparak fatura değeri atayan odenecekTutar method

    Müsteri Class: fields: name ElektrikHesabi class obj.
    Runner Class obj ile enz 2  aylık elektrik tüketim faturası print eden code create ediniz

     */

    int toplamTuketim=0;
    double oran=0.7;
    double fatura;
    int tuketilenenerji;

    public Task_02_Elektrik(int toplamTuketim, double fatura) {
        this.toplamTuketim = toplamTuketim;
        this.oran = oran;
        this.fatura = fatura;

        System.out.println("toplamTuketim = " + tuketimEkle(tuketilenenerji, toplamTuketim));
        System.out.println("fatura = " + odenecekTutar(oran, toplamTuketim, fatura));

    }

    private double odenecekTutar(double oran, int toplamTuketim,double fatura) {
        fatura=oran*toplamTuketim;
        return fatura;
    }

    private int tuketimEkle(int tuketilenenerji, int toplamTuketim) {
        toplamTuketim+=tuketilenenerji;
        return toplamTuketim;
    }
}
