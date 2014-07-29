/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rachunek;

/**
 *
 * @author pmazur
 */
public class TRachunek {

    private String imie, nazwisko;
    private float saldo, debet;

    public TRachunek(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.saldo = 0;
        this.debet = 0;
    }

    public TRachunek(String imie, String nazwisko, float saldo) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.saldo = saldo;
        this.debet = 0;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public float getSaldo() {
        return saldo;
    }

    public float getDebet() {
        return debet;
    }

    public void Wplata(float kwota) {
        saldo = saldo + kwota;
    }

    public boolean Wyplata(float kwota) {
        if (saldo - kwota < -debet) {
            return false;
        }

        return true;
    }

    public boolean CzyDebet() {
        if (saldo < 0) {
            return true;
        }
        return false;

    }

    public boolean Przelew(TRachunek rachunek, float kwota) {
        if (Wyplata(kwota)) {
            rachunek.Wplata(kwota);
            return true;
        } else {
            return false;
        }
    }

    public double NaliczOdsetki(double oproc) {
        return saldo * 0.01 * oproc;

    }

    public void setDebet(float debet) {
        this.debet = debet;
    }

    @Override
    public String toString() {
        return "TRachunek{" + "imie=" + imie + ", nazwisko=" + nazwisko + ", saldo=" + saldo + ", debet=" + debet + '}';
    }

}
