package myobj.prizedraw_answer;

public class Prize {
	String name;
	int qty;
	double chance;

	public Prize(String name, int qty, double chance) {
		this.name = name;
		this.qty = qty;
		this.chance = chance;
	}
	
	// get필드명() : 해당 필드값을 꺼내주는 메서드, Getter
	public String getName() {
		return name;
	}
	
	public int getQty() {
		return qty;
	}
	
	public double getChance() {
		return chance;
	}
	
	// 상품 당첨시 개수를 줄여줌
	public void minusQty() {
		--qty;
	}
	
	@Override
	public String toString() {
		return String.format("[%s/남은수량:%d/확률%.2f]", name, qty, chance);
	}
}
