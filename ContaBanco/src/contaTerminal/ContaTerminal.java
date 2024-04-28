package contaTerminal;

public class ContaTerminal {

public String NomeCLiente;
private int NumeroConta;
private String Agencia;
public double Saldo;

public ContaTerminal(String nomeCLiente, int numeroConta, String agencia, double saldo) {
	this.NomeCLiente=nomeCLiente;
	this.NumeroConta=numeroConta;
	this.Agencia=agencia;
	this.Saldo=saldo;
}

public int getNumeroConta() {
	return NumeroConta;
}

public void setNumeroConta(int numeroConta) {
	NumeroConta = numeroConta;
}

public String getAgencia() {
	return Agencia;
}

public void setAgencia(String agencia) {
	Agencia = agencia;
}

@Override
public String toString() {
	return "Olá! " + NomeCLiente + ", Obrigado por criar uma conta em nosso banco, sua agência é: " + Agencia + ", conta: " + NumeroConta
			+ ", e seu Saldo é: " + Saldo + " já esta disponível para saque";
}


}
