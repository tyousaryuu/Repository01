package tt.ss.rr;

public class Goods {
	String name;		//商品名称
	int ID;			//商品编号
	double price;		//商品单价
	String unit;		//商品计价单位
	public Goods(String name, int iD, double price, String unit) {
		super();
		this.name = name;
		ID = iD;
		this.price = price;
		this.unit = unit;
	}
	public Goods() {
		super();
	}

}
