public class Cliente{

    private String nome;
    private Double saldo;



    public Cliente(String nome, Double saldo){
        this.nome = nome;
        this.saldo = saldo;
    }

    public void Emprestar(){
        System.out.println("EMPRESTADO!")
    }
}