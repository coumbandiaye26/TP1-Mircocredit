package sn.coumba.projet;

public class Client {
    private String numero;
    public String nom;
    public String telephone;

    public  Client(String nom, String telephone){
        if (nom==null || nom.isBlank()){
            throw new IllegalArgumentException("Nom obligatoire");
        }
        this.numero =numero;
        this.nom=nom;
        this.telephone=telephone;
    }
}

