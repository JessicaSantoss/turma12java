package Classes;

public class Produto {

	private String nomeProduto;
	private int codigoProduto;
	private double precoUnitario;
	private int estoque;
	

	public Produto(int codigoProduto, String nomeProduto, double precoUnitario, int estoque) {
		super();
		this.nomeProduto = nomeProduto;
		this.codigoProduto = codigoProduto;
		this.precoUnitario = precoUnitario;
		this.estoque = estoque;
	}


	public Produto() {
		super();
	}


	public String getNomeProduto() {
		return nomeProduto;
	}


	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}


	public double getPrecoUnitario() {
		return precoUnitario;
	}


	public void setPrecoUnitario(double precoUnitario) {
		this.precoUnitario = precoUnitario;
	}


	public int getCodigoProduto() {
		return codigoProduto;
	}


	public void setCodigoProduto(int codigoProduto) {
		this.codigoProduto = codigoProduto;
	}


	public int getEstoque() {
		return estoque;
	}


	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}

	public void adicionar(int estoque) {
        this.estoque += estoque;
    
    }
    public void retirar(int estoque) {
        this.estoque -= estoque;
    
    }
    public double precoQuantidade(int estoque) {
        double valorQuantidade = this.precoUnitario* estoque;
        return valorQuantidade;
    }


	public int getCodProd() {
		return 0;
	}
	

}
