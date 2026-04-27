package ExDoGpt;

import java.util.List;
import java.util.Stack;

public class Historico extends Usuario{
    private Stack<String> historico = new Stack<>();

    public Historico(){
        super();
    }
    public Historico(String nome, List livrosEmprestados){
        super(nome,livrosEmprestados);
    }

    public void registrarAcao(String acao)
    {
        historico.push(acao);
    }
    public void desfazerAcao()
    {
        historico.pop();
    }

    public void mostarHistorico()
    {
        for (String user : historico)
        {
            System.out.println(user);
        }
    }
}
