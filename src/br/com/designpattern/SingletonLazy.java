package br.com.designpattern;

public class SingletonLazy {
    private static SingletonLazy instance;
    private static int qtdUsuarios;

    private SingletonLazy(){
        super();
    }

    public static SingletonLazy getInstance(){
        if(instance == null){
            instance = new SingletonLazy();
        }
        return instance;
    }

    public static void setQtdUsuarios(){
        qtdUsuarios += 1;
    }

    public static int getQtdUsuarios(){
        return qtdUsuarios;
    }
}
