
public class Principal2 {

	public static void main(String[] args) {
		Proprietario dono1 = new Proprietario();
		dono1.nome = "Jo�o da Silva";
		
		Carro meuCarro = new Carro();
		meuCarro.modelo = "Palio";
		
		Carro seuCarro = new Carro();
		seuCarro.modelo = "Civic";
		
		meuCarro.dono = dono1;
		seuCarro.dono = dono1;
		
		System.out.println("Antes da mudan�a");
		System.out.println(meuCarro.dono.nome);
		System.out.println(seuCarro.dono.nome);
		System.out.println(dono1.nome);
		
		System.out.println();
		
		meuCarro.dono.nome = "Sebasti�o";
		
		System.out.println("Depois da mudan�a");
		System.out.println(meuCarro.dono.nome);
		System.out.println(seuCarro.dono.nome);
		System.out.println(dono1.nome);
	}
	
}
