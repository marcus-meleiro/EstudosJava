package NivelIntermediario;

public class Main {
    public static void main(String[] args) {
        //Criar o ninja Naruto
        Uzumaki Naruto = new Uzumaki();
        Naruto.nome = "Naruto Uzuamaki";
        Naruto.cla = "Uzumaki";
        Naruto.rank = "Genin";
        Naruto.aldeia = "Aldeia da Folha";
        Naruto.idade = 17;
        Naruto.ModoSabio();

        //Criar o ninja Sasuke
        Uchiha Sasuke = new Uchiha();
        Sasuke.nome = "Sasuke Uchiha";
        Sasuke.cla = "Uchiha";
        Sasuke.rank = "Genin";
        Sasuke.aldeia = "Aldeia da Folha";
        Sasuke.idade = 18;
        Sasuke.AtivarSharingan();

        //Criar a ninja Sakura
        Haruno Sakura = new Haruno();
        Sakura.nome = " Sakura Haruno";
        Sakura.cla = "Haruno";
        Sakura.rank = "Genin";
        Sakura.aldeia = "Aldeia da Folha";
        Sakura.idade = 18;
        Sakura.ModoCura();

        //Criando ninja Hinata
        Hyuuga Hinata = new Hyuuga();
        Hinata.nome = "Hinata Hyuuga";
        Hinata.aldeia = "Aldeia da Folha";
        Hinata.idade = 16;
        Hinata.cla = "Hyuuga";
        Hinata.rank = "Genin";
        Hinata.AtivarByakugan();

        //Criando o ninja Neji

        Hyuuga Neji = new Hyuuga();
        Neji.nome = "Neji Hyuuga";
        Neji.aldeia = "Aldeia da Folha";
        Neji.idade = 18;
        Neji.rank = "Genin";
        Neji.cla = "Hyuuga";
        Neji.AtivarByakugan();

        //Criando o Ninja boruto
        Ninja Boruto = new Ninja();
        Boruto.nome = "Boruto Uzumaki";
        Boruto.aldeia = "Aldeia da Folha";
        Boruto.idade = 12;
        Boruto.rank = "Genin";
        Boruto.cla = "Uzumaki";





    }
}
