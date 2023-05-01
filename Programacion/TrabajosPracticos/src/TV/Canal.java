package TV;

public class Canal {
	private int numeroCanal;
	private String descripcionCanal;
	private boolean closeCaption;
	private boolean sonidoStereo;
	
	public Canal() {
		numeroCanal=0;
		descripcionCanal="S/N";
		closeCaption=false;
		sonidoStereo=true;
	}

	public Canal(int numeroCanal,String descripcionCanal, boolean closeCaption,boolean sonidoStereo) {
		this.numeroCanal=numeroCanal;
		this.descripcionCanal=descripcionCanal;
		this.closeCaption=closeCaption;
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

	public boolean isCloseCaption() {
		return closeCaption;
	}

	public void setCloseCaption(boolean closeCaption) {
		this.closeCaption = closeCaption;
	}

	public boolean isSonidoStereo() {
		return sonidoStereo;
	}

	public void setSonidoStereo(boolean sonidoStereo) {
		this.sonidoStereo = sonidoStereo;
	}
}
