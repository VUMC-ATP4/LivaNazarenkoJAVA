package classHomework;

public class Trissturis{

    // visu malu garumu mainīgajie(veseli skaitļi) un laukums
    int malaA, malaB, malaC;
    double laukums;

    // non-arg konstruktors, kurš pasaka, ka veidojam trīsstūri
    Trissturis() {
        System.out.println("Veidoju trīsstūri");
    }

    //arg konstruktors, kur tiek padotas visas trīs malas un uzreiz aprēķināts trijstūra laukums(hērona formula) un saglabāts laukuma mainīgajā

    Trissturis(int malaA, int malaB, int malaC) {
        this.malaA = malaA;
        this.malaB = malaB;
        this.malaC = malaC;
    }
    //laukuma mainīgais, ko izvadīt Main klasē
    public double laukums() {
        double pusperimetrs = (malaA + malaB + malaC) / 2;
        System.out.print("Trīsstūra laukums ir ");
        return Math.sqrt(pusperimetrs * (pusperimetrs - malaA) * (pusperimetrs - malaB) * (pusperimetrs - malaC));
    }

    //metode, kas atgriež true/false vai trīsstūris ir vienādmalu
    public boolean vaiVienadmalu (){

        if (malaA == malaB && malaB== malaC && malaA == malaC){
            return true;
        }else {
            return false;
        }
    }

    public boolean vaiVienadsanu () {

        if ((malaA == malaB && malaB != malaC) || (malaB == malaC && malaC !=malaA) || (malaC == malaA && malaA != malaB)) {
            return true;
        } else {
            return false;
        }
    }

}
