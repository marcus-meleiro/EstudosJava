package NIvel_Basico.Coondicoes.ternario;

public class Ternario {
    public static void main(String[] args) {

        /** Tenarios São maneiras de resduzir o codigo 
         *  é basicamente o if e else 
         * 
         * 
         * variavel = (condição) ? valorSeVerdadeiro : valorSeFalso
         * 
         */

        short numMissoes = 1;
        String nivel = (numMissoes >= 10) ? "Esse ninja está com mais de 10 Missões" : "Esse ninja tem menos de 10 missões";
        System.out.println(nivel);

        
    }
}
