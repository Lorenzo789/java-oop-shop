package generation.italy.shop;

public class Main {
	
	/*
		Java Shop
		Repo: java-oop-shop
		Todo:
	
		Nel solito package generation.italy.shop creare classe Prodotto
		che rappresenta un singolo prodotto all'interno di un negozio. Il prodotto e' caratterizzato dalle seguenti informazioni:
	
	    codice - int
	    nome - String
	    descrizione - String
	    prezzo - int
	    iva - int
	
		Nella classe, oltre alle variabili d'istanza generare i seguenti metodi:
	    costruttore che accetta in ingresso nome, descrizione, prezzo
	    
	    N.B.: il codice e' un valore a 5 cifre calcolato casualmente
	    
	    N.N.B.: il valore dell'iva e' fisso a 20 (inteso come 20%)
	    
	    metodo che restituisce il prezzo
	    
	    metodo che restituisce il prezzo incrementato dell'iva (PERCENTUALE)
	    
	    metodo toString() che dia una rappresentazione sensata dell'oggetto
	
		Nello stesso package aggiungere una classe Main con metodo main che verra' utilizzato per creare alcuni oggetti di prova
		e testarne le relative funzioni a scopo di debug.
	 */
	public static void main(String[] args) {
		
		Product toy = new Product("giocattolo", "meraviglioso", 10);
		System.out.println(toy);
		
		Product wardrobe = new Product("armadio", "leggendario", 100);
		System.out.println(wardrobe);
		
		Product mouse = new Product("mouse", "figherrimo", 70);
		System.out.println(mouse);
		
	}
	
}
