
public class testaAnimal {

	public static void main(String[] args) {
	
		ClasseCachorro auau1 = new ClasseCachorro();
		auau1.setNome("Belinha");
		auau1.setIdade(5);
		auau1.setSom("au au au");
		auau1.setVelocidade(15);
		System.out.println("O nome da cachorra � "+ auau1.getNome());
		System.out.println("A idade dela � de "+ auau1.getIdade()+ " anos.");
		System.out.println("O latido dela � mais ou menos assim: " +auau1.isSom());
		System.out.println("Quando ela est� correndo chega a "+ auau1.getVelocidade()+"KM/H");
		
		System.out.println();
		
		ClasseCavalo pocoto1 = new ClasseCavalo();
		pocoto1.setNome("Pangar�");
		pocoto1.setIdade(10);
		pocoto1.setSom("iiirrrr�, rilinchin");
		pocoto1.setVelocidade(88);
		
		System.out.println("O nome do cavalo � " +pocoto1.getNome());
		System.out.println("Ele tem " + pocoto1.getIdade() +" anos de idade.");
		System.out.println("O som que ele faz � mais ou menos assim: "+ pocoto1.isSom());
		System.out.println("Quando o "+pocoto1.getNome()+" est� correndo ele pode chegar a "+ pocoto1.getVelocidade()
		+"KM/H");
		
		System.out.println();
		
		
		ClassePreguica preguica1 = new ClassePreguica();
		preguica1.setNome("Pregs");
		preguica1.setIdade(18);
		preguica1.setSom("Zzzzzzz");
		preguica1.setSubirArvore(true);
		
		System.out.println("A pregui�a do zoo se chama "+preguica1.getNome());
		System.out.println("Ela tem "+preguica1.getIdade()+" anos de idade.");
		System.out.println("Quando a "+preguica1.getNome()+" est� dormindo ela faz um som mais ou menos assim "
				+ preguica1.isSom());
		System.out.println("Perguntaram a um zool�go ingl�s se era verdade que o bicho pregui�a sobe em �rvore e ele "+
				"respondeu: "+preguica1.isSubirArvore());
	}

}
