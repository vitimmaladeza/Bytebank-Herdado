//contrato Autenticavel
//quem assina esse contrato preisa implementar o metodo setSenha e o metodo autentica.


interface Autenticavel {

    void setSenha(int senha);

    boolean autentica(int senha);

}
