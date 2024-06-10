import java.util.Date;
import java.util.List;

// Classe Spectacle
public class Spectacle {
    private String nom;
    private int duree;
    private int nombreActes;
    private int nombreSpectateurs;
    private String genre;
    
    private List<Artiste> artistes;
    private List<Representation> representations;
    private List<Genre> genres;
}

// Classe Artiste
public class Artiste {
    private String nom;
    
    private List<Spectacle> spectacles;
}

// Classe Representation
public class Representation {
    private String jour;
    private String heure;
    private boolean annulee;
    
    private List<Fauteuil> fauteuils;
    private List<Reservation> reservations;
    private List<Annulation> annulations;
}

// Classe Fauteuil
public class Fauteuil {
    private String rangee;
    private String numero;
    
    private List<Billet> billets;
}

// Classe Billet
public class Billet {
    private String numero;
    
    private Reservation reservation;
}

// Classe Reservation
public class Reservation {
    private String numero;
    private Date date;
    private Date dateEnvoiConf;
    
    private List<Billet> billets;
    private Client client;
}

// Classe Client
public class Client {
    private String nom;
    private String prenom;
    private String adresse;
    private String tel;
    private String mail;
    private String numero;
    
    private List<Facture> factures;
    private List<Annulation> annulations;
}

// Classe Facture
public class Facture {
    private String numero;
    private double montantHT;
    private double staticTauxTVA;
    
    private Payment payment;
}

// Classe Payment
public class Payment {
    private boolean realise;
    
    private CB cb;
    private Liquide liquide;
    private Cheque cheque;
    private ChequeVacance chequeVacance;
}

// Sous-classes de Payment
public class CB extends Payment {
}

public class Liquide extends Payment {
}

public class Cheque extends Payment {
}

public class ChequeVacance extends Payment {
}

// Classe Annulation
public class Annulation {
    private Date date;
    private boolean remboursementEffectue;
    
    private AnnulationArtiste annulationArtiste;
    private AnnulationClient annulationClient;
}

// Classe AnnulationArtiste
public class AnnulationArtiste extends Annulation {
}

// Classe AnnulationClient
public class AnnulationClient extends Annulation {
}

// Classe Abonne
public class Abonne extends Adulte {
    private double reductionStatic;
}

// Classe Adulte
public class Adulte {
}

// Classe Jeune
public class Jeune extends TarifCoop {
    private double reductionStatic;
}

// Classe Groupe
public class Groupe extends TarifCoop {
    private double reductionStatic;
}

// Classe Senior
public class Senior extends TarifCoop {
    private double reductionStatic;
}

// Classe TarifCoop
public class TarifCoop {
    private double pleinTarif;
    
    private List<TarifCoop> tarifs;
}

// Classe Genre
public class Genre {
    private String libelle;
    
    private List<Spectacle> spectacles;
}

// Sous-classes de Genre
public class Musique extends Genre {
}

public class Opera extends Genre {
}

public class Danse extends Genre {
}

public class Cirque extends Genre {
}

public class Marionnette extends Genre {
}

public class Theatre extends Genre {
}

public class Zone {
    private String nom;
    
    private List<Fauteuil> fauteuils;
}
