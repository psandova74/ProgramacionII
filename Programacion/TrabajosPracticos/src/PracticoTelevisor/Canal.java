package PracticoTelevisor;

public class Canal {
	int numeroCanal;
	String descripcionCanal;
	boolean closedCaption;
	boolean sonidoStereo;
	
	public Canal(int numeroCanal, String descripcionCanal, boolean closedCaption, boolean sonidoStereo) {
		this.numeroCanal=numeroCanal;
		this.descripcionCanal=descripcionCanal;
		this.closedCaption=closedCaption;
		this.sonidoStereo=sonidoStereo;
	}

	public int getNumeroCanal() {
		return numeroCanal;
	}

	public void setNumeroCanal(int numeroCanal) {
		this.numeroCanal = numeroCanal;
	}

	public String getDescripcionCanal() {
		return descripcionCanal;
	}

	public void setDescripcionCanal(String descripcionCanal) {
		this.descripcionCanal = descripcionCanal;
	}

	public boolean isClosedCaption() {
		return closedCaption;
	}

	public void setClosedCaption(boolean closedCaption) {
		this.closedCaption = closedCaption;
	}

	public boolean isSonidoStereo() {
		return sonidoStereo;
	}

	public void setSonidoStereo(boolean sonidoStereo) {
		this.sonidoStereo = sonidoStereo;
	}

}
