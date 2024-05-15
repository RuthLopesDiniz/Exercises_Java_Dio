
public class FormatCep {
	public static void main(String[] args) {
		try{
		String cepFormated = formatCep("2376064");
		System.out.println(cepFormated);
		}
		catch (CepInvalidoException e) {
			System.out.println("O cep não tem a quantidade de digitos corretos.");
		}
	}
		static String formatCep(String cep) throws CepInvalidoException{
	        if(cep.length() != 8)
	          throw new CepInvalidoException();
	        
	          //simulando um cep formatado
	          return "23.765-064";
		
	}
}
