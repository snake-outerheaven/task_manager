// o nome da classe vem de MCP, Master Control Program, aqui sendo Master Control Class
//
// basicamente é o controlador da aplicação
//
// Atributos:
//
//  mgr é o objeto que condensa as regras de negócio da aplicação, em cima das entidades do domínio
//  que são representadas por instâncias de ToDoTask
//
//  view é uma interface que captura intenções do usuário, sem se importar se o programa está
//  sendo usado do terminal, janela gráfica, frontend ou aritmancia.
//
//  DbInterface é uam interface que abstrai a lógica de persistência de dados sobre diversos
//  conteineres, entre eles arquivo de texto, arquivos binários, banco de dados, runas, etc.

public class MCC {

    private Manager mgr;
    private ViewInterface view;
    private DbInterface db;

    public MCC(Manager mgr, ViewInterface view, DbInterface db) {
        this.mgr = mgr;
        this.view = view;
        this.db = db;
    }
}
