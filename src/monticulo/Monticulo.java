package monticulo;

public class Monticulo {

	private int vec[] = new int[15];
	private int tope = 1;

	public void insertar(final int valor) {
		this.vec[tope] = valor;
		int aux = tope;
		int auxIntercambio;

		while (this.vec[aux / 2] < this.vec[aux] && aux > 1) {
			auxIntercambio = this.vec[aux / 2];
			this.vec[aux / 2] = this.vec[aux];
			this.vec[aux] = auxIntercambio;
			aux = aux / 2;
		}
		this.tope++;
	}

	public void mostrar() {
		for (int i = 1; i < this.tope; i++) {
			System.out.print(this.vec[i] + "\t");
		}
		System.out.println();
	}

	public void eliminar() {
		/// int raiz = vec[1];
		this.vec[1] = this.vec[tope - 1];

		int aux = 1;
		int auxIntercambio;

		while (((aux * 2) < tope && (aux * 2) + 1 < tope)
				&& (this.vec[aux * 2] > this.vec[aux] || this.vec[aux * 2 + 1] > this.vec[aux])) {
			if (this.vec[aux * 2] > this.vec[aux * 2 + 1]) {
				auxIntercambio = this.vec[aux * 2];
				this.vec[aux * 2] = this.vec[aux];
				this.vec[aux] = auxIntercambio;
				aux = aux * 2;
			} else {
				auxIntercambio = this.vec[aux * 2 + 1];
				this.vec[aux * 2 + 1] = this.vec[aux];
				this.vec[aux] = auxIntercambio;
				aux = aux * 2 + 1;
			}
		}
		this.tope--;
	}

	

	public static void main(String[] args) {
		Monticulo monty = new Monticulo();
		monty.insertar(6);
		monty.insertar(28);
		monty.insertar(57);
		monty.insertar(15);
		monty.insertar(30);
		monty.insertar(60);
		monty.insertar(10);
		monty.insertar(8);

		monty.mostrar();
		monty.eliminar();
		monty.mostrar();
		
		
		
	}

}
