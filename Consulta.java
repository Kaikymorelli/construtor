package metodoconstrutor;

public class Consulta {
	
	private String data;
	private String nomePcnt;
	private String nomeDents;
	
	
	public Consulta () {
	}
	public Consulta (String data) {
	}
	public Consulta (String data, String nomePcnt, String nomeDents  ) {
		this.data = data;
		this.nomePcnt = nomePcnt;
		this.nomeDents = nomeDents;
	}
	
	public String getdata() {
		return data;
	}
	public void setdata(String data) {
		this.data = data;
	}
	public String getnomePcnt() {
		return nomePcnt;
	}
	public void setnomePcnt(String nomePcnt) {
		this.nomePcnt = nomePcnt;
	}
	public String getnomeDents() {
		return nomeDents;
	}
	public void setnomeDents(String nomeDents) {
		this.nomeDents = nomeDents;
	}

	

}
