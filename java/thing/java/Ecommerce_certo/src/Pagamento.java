
public class Pagamento extends Produto{
	
	private double dinheiro;
	private double cartao;
	private double parcelado;
	private double precoTotal;
	
	
	public Pagamento(int codProd, String nome,double precoUni, int estoque)
	{
		super (codProd, nome, precoUni, estoque);
		
	}
	
	public Pagamento() {
		super();
	}
	public double getDinheiro() {
		return dinheiro;
	}
	public void setDinheiro(double dinheiro) {
		this.dinheiro = dinheiro;
	}
	public double getCartao() {
		return cartao;
	}
	public void setCartao(double cartao) {
		this.cartao = cartao;
	}
	public double getParcelado() {
		return parcelado;
	}
	public void setParcelado(double parcelado) {
		this.parcelado = parcelado;
	}
	public double getPrecoTotal() {
		return precoTotal;
	}
	public double vistaDinheiro (double total)
	{
		this.dinheiro=total-((total/100)*11);
		return this.dinheiro;
	}
	public double vistaCartao (double total)
	{
		this.cartao=total-((total/100)*11);
		return this.cartao;
	}
	public double parceladoCartao (int parcela, double total)
	{
		this.parcelado=total-((total/100)*19);
		if (parcela==2)
		{	
			this.parcelado=total-((total/100)*9);
			return this.parcelado;
		}
		else
		{
			this.parcelado=total-((total/100)*19);
			return this.parcelado;
		}
	
	}
	public double somaTotal (double soma)
	{
		return this.precoTotal=this.precoTotal+soma;
	}
	
	

}
