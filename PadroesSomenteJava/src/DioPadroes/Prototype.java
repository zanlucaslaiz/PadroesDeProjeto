package DioPadroes;

public class Prototype {
    
    public static void main(String[] args) throws CloneNotSupportedException {
        Documento1 d = new Documento1();
        d.nome = "ListaDeMembros.pdf";
        d.tipo = "PDF";
        d.visibilidade = "restrito";
        d.localizacao = "arquivos.sistema:1234/p1o39d8a.pdf";
        System.out.println(d);
        
        System.out.println("---");
        
        Documento1 d2 = d.clone();
        System.out.println(d2);
        
        System.out.println("---");
        
        d2.nome = "Lista2.pdf";
        System.out.println(d);
        System.out.println(d2);
    }

}

/*----------------------------------------------------*/

final class Documento1 implements Cloneable {
    
    String nome;
    String visibilidade;
    String tipo;
    String localizacao; // url, path, etc
    
    @Override
    public Documento1 clone() throws CloneNotSupportedException {
        return (Documento1) super.clone();
    }

    @Override
    public String toString() {
        return "Documento1 [nome=" + nome + ", visibilidade=" + visibilidade + ", tipo=" + tipo + ", localizacao=" + localizacao
                + "]";
    }
    
}