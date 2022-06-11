package model;

public class JavaBeans {

	private String ID_CON;
	private String NOME;
	private String FONE;
	private String EMAIL;
	public JavaBeans() {
		super();
		
	}
	
	public JavaBeans(String iD_CON, String nOME, String fONE, String eMAIL) {
		super();
		ID_CON = iD_CON;
		NOME = nOME;
		FONE = fONE;
		EMAIL = eMAIL;
	}

	public String getID_CON() {
		return ID_CON;
	}
	public void setID_CON(String iD_CON) {
		ID_CON = iD_CON;
	}
	public String getNOME() {
		return NOME;
	}
	public void setNOME(String nOME) {
		NOME = nOME;
	}
	public String getFONE() {
		return FONE;
	}
	public void setFONE(String fONE) {
		FONE = fONE;
	}
	public String getEMAIL() {
		return EMAIL;
	}
	public void setEMAIL(String eMAIL) {
		EMAIL = eMAIL;
	}
}
