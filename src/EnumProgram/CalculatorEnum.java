package EnumProgram;

public enum CalculatorEnum {

	addition("+"), substraction("-"), multiplication("*"), division("/");

	final String symbol;

	private CalculatorEnum(String symbol) {

		this.symbol = symbol;

	}
}
