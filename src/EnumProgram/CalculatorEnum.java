package EnumProgram;

public enum CalculatorEnum {

	addition("+"), substraction("-"), multiplication("*"), division("/");

	final String symbol;

	CalculatorEnum(String symbol) {

		this.symbol = symbol;

	}
}
