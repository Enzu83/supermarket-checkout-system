package Item;

public class ConcreteWeightVisitor implements WeightVisitor {
	
	public double visit(UnitPricedLineItem uli) {
		return uli.getKgPerUnit() * uli.getQuantity();
	}
	
	public double visit(WeightPricedLineItem wli) {
		return wli.getWeight();
	}

	public String toString() {
		return "Concrete Weight Visitor";
	}
}
