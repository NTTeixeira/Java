package model.entities;

public class Area {

	private Double base;
	private Double baseMa;
	private Double baseMe;
	private Double height;
	private Double radius;
	private Double side;

	public Area() {

	}
	
	public void Area1(Double side) {
		this.side = side;
	}

	public Area(Double radius) {
		this.radius = radius;
	}

	public Area(Double base, Double height) {
		this.base = base;
		this.height = height;
	}
	
	public void Area1(Double baseMa, Double baseMe) {
		this.baseMa = baseMa;
		this.baseMe = baseMe;	
	}
	
	public Area(Double baseMa, Double baseMe, Double height) {
		this.baseMa = baseMa;
		this.baseMe = baseMe;	
		this.height = height;
	}

	public Double getBase() {
		return base;
	}

	public void setBase(Double base) {
		this.base = base;
	}

	public Double getBaseMa() {
		return baseMa;
	}

	public void setBaseMa(Double baseMa) {
		this.baseMa = baseMa;
	}

	public Double getBaseMe() {
		return baseMe;
	}

	public void setBaseMe(Double baseMe) {
		this.baseMe = baseMe;
	}

	public Double getHeight() {
		return height;
	}

	public void setHeight(Double height) {
		this.height = height;
	}

	public Double getRadius() {
		return radius;
	}

	public void setRadius(Double radius) {
		this.radius = radius;
	}

	public Double getSide() {
		return side;
	}

	public void setSide(Double side) {
		this.side = side;
	}

	public Double calculationRec(Double base, Double heigth) {
		return base * heigth;
	}
	
	public Double calculationTri(Double base, Double heigth) {
		return (base * heigth) / 2;
	}
	
	public Double calculationCir(Double radius) {
		return Math.pow(radius, 2) * Math.PI;
	}
	
	public Double calculationSqu(Double side) {
		return side * 4;
	}
	
	public Double calculationTra(Double baseMa, Double baseMe, Double heigth) {
		return ((baseMa + baseMe) * heigth) / 2;
	}
	
	public Double calculationLoz(Double baseMa, Double baseMe) {
		return (baseMa * baseMe) / 2;
	}
	
}
