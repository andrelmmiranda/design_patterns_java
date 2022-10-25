import br.com.designpattern.SingletonLazy;

public class Main {
    public static void main(String[] args){
        Usuario u1 = new Usuario();
        Usuario u2 = new Usuario();


        System.out.println(SingletonLazy.getQtdUsuarios());
    }
}

class Usuario{
    public Usuario(){
        SingletonLazy.setQtdUsuarios();
    }
}
