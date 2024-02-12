package Ejercicio02;

public class Carta {
	    private String formato;
	    private String emisor;
	    private String codigoPostal;
	    private String destinatario;

	    public Carta() {

	    }

	    public Carta(String formato, String emisor, String codigoPostal, String destinatario) {
	        setFormato(formato);
	        setEmisor(emisor);
	        setCodigoPostal(codigoPostal);
	        setDestinatario(destinatario);
	    }

	    public String getFormato() {
	        return formato;
	    }

	    public String getEmirsor() {
	        return emisor;
	    }
	    public String getCodigoPostal() {
	        return codigoPostal;
	    }
	    public String getDestinatario() {
	        return destinatario;
	    }

	    public void setDestinatario(String destinatario) {
	        this.destinatario = destinatario;
	    }
	    public void setEmisor(String emisor) {
	        this.emisor = emisor;
	    }
	    public void setCodigoPostal(String codigoPostal) {
	        this.codigoPostal = codigoPostal;
	    }
	    public void setFormato(String formato) {
	        this.formato = formato;
	    }
	}


