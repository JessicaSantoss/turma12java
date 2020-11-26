package Classes;

public class NotaFiscal {
	
		private int numero;
		private int data;
		private double valor;
		
		public NotaFiscal(int numero, int data, double valor) {
			super();
			this.numero = numero;
			this.data = data;
			this.valor = valor;
		}

		public int getNumero() {
			return numero;
		}

		public void setNumero(int numero) {
			this.numero = numero;
		}

		public int getData() {
			return data;
		}

		public void setData(int data) {
			this.data = data;
		}

		public double getValor() {
			return valor;
		}

		public void setValor(double valor) {
			this.valor = valor;
		}
		
		

}
