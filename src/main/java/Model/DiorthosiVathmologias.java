/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Stavros
 */
public class DiorthosiVathmologias {
    private Kathigitis kathigitis;
    private Mathima mathima;
    private double Palia_Vathm;
    private double Nea_Vathm;
    private boolean digital_sign;
    private String eksetastiki;
    private Grammateia grammateia;

    public DiorthosiVathmologias(Kathigitis kathigitis, Mathima mathima, double Palia_Vathm, double Nea_Vathm, boolean digital_sign, String eksetastiki, Grammateia grammateia) {
        this.kathigitis = kathigitis;
        this.mathima = mathima;
        this.Palia_Vathm = Palia_Vathm;
        this.Nea_Vathm = Nea_Vathm;
        this.digital_sign = digital_sign;
        this.eksetastiki = eksetastiki;
        this.grammateia = grammateia;
    }
    
     public DiorthosiVathmologias(Kathigitis kathigitis, Mathima mathima, double Palia_Vathm, double Nea_Vathm, boolean digital_sign, String eksetastiki) {
        this.kathigitis = kathigitis;
        this.mathima = mathima;
        this.Palia_Vathm = Palia_Vathm;
        this.Nea_Vathm = Nea_Vathm;
        this.digital_sign = digital_sign;
        this.eksetastiki = eksetastiki;
    }
    public Kathigitis getKathigitis() {
        return kathigitis;
    }

    public void setGrammateia(Grammateia grammateia) {
        this.grammateia = grammateia;
    }
    
    //Ελεγξε το dig signature ενος καθηγητη που υποβάλλει δήλωση.
    public boolean checkDigitalSign(DiorthosiVathmologias diorthosiVathmologias)
    {
        if(diorthosiVathmologias != null)
        {
            if(diorthosiVathmologias.getKathigitis().getDigital_signature()== true)
            {
                return true;
            }
            return false;
        }
        else{ return false;}
    }
    
    
}