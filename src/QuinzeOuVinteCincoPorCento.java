
public class QuinzeOuVinteCincoPorCento implements  RegraDeCalculo{

	@Override
	public double calcula(Funcionario f) {
		if(f.getSalarioBase() > 2000.0) {
			return  f.getSalarioBase() * 0.75;
		}else {
			return f.getSalarioBase() * 0.85;
		}
	}

}
