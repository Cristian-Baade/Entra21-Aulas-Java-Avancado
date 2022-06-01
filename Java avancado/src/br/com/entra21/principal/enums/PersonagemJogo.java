package br.com.entra21.principal.enums;

public enum PersonagemJogo {
	BARBARO(1000, "Muito HP"), ANAO(100, "Ferreiro"), DRUIDA(50, "Suporte"), SACERDOTE(10, "Cura/Corre"),
	MAGO(20, "Contemplem o MAGO");

	private final int VIDA;
	private final String DESCRICAO;

	private PersonagemJogo(int vida, String descricao) {
		this.VIDA = vida;
		this.DESCRICAO = descricao;

	}

	public int getVIDA() {
		return VIDA;
	}

	public String getDESCRICAO() {
		return DESCRICAO;
	}

	public String getDetails() {
		return "Veja a descrição completa do " + this.name() + " sua vida é " + this.VIDA
				+ " e sua habilidade principal " + this.DESCRICAO;
	}
}
