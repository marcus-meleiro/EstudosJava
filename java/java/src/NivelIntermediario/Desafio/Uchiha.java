package NivelIntermediario.Desafio;

public class Uchiha extends Ninja {
    String habilidadeEspecial;

    public void mostrarHabilidadeEspecial(){
        System.out.println("Habilidade Especial: " + habilidadeEspecial);

    }

    public void mostrarInfo(){
        System.out.println("Nome: " + nome + " Idade: " + idade +  " Missão: " + missao + " Dificuldade da missão: " + dificuldadeMIssao + " Status da misssão: " + statusMissao);
        System.out.println("Habilidade Especial: " + habilidadeEspecial);

    }

}
