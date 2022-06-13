
public class testaAnimal {

	public static void main(String[] args) {
	
		ClasseCachorro auau1 = new ClasseCachorro();
		auau1.setNome("Belinha");
		auau1.setIdade(5);
		auau1.setSom("au au au");
		auau1.setVelocidade(15);
		System.out.println("O nome da cachorra é "+ auau1.getNome());
		System.out.println("A idade dela é de "+ auau1.getIdade()+ " anos.");
		System.out.println("O latido dela é mais ou menos assim: " +auau1.isSom());
		System.out.println("Quando ela está correndo chega a "+ auau1.getVelocidade()+"KM/H");
		
		System.out.println();
		
		ClasseCavalo pocoto1 = new ClasseCavalo();
		pocoto1.setNome("Pangaré");
		pocoto1.setIdade(10);
		pocoto1.setSom("iiirrrrí, rilinchin");
		pocoto1.setVelocidade(88);
		
		System.out.println("O nome do cavalo é " +pocoto1.getNome());
		System.out.println("Ele tem " + pocoto1.getIdade() +" anos de idade.");
		System.out.println("O som que ele faz é mais ou menos assim: "+ pocoto1.isSom());
		System.out.println("Quando o "+pocoto1.getNome()+" está correndo ele pode chegar a "+ pocoto1.getVelocidade()
		+"KM/H");
		
		System.out.println();
		
		
		ClassePreguica preguica1 = new ClassePreguica();
		preguica1.setNome("Pregs");
		preguica1.setIdade(18);
		preguica1.setSom("Zzzzzzz");
		preguica1.setSubirArvore(true);
		
		System.out.println("A preguiça do zoo se chama "+preguica1.getNome());
		System.out.println("Ela tem "+preguica1.getIdade()+" anos de idade.");
		System.out.println("Quando a "+preguica1.getNome()+" está dormindo ela faz um som mais ou menos assim "
				+ preguica1.isSom());
		System.out.println("Perguntaram a um zoológo inglês se era verdade que o bicho preguiça sobe em árvore e ele "+
				"respondeu: "+preguica1.isSubirArvore());
	}

}
