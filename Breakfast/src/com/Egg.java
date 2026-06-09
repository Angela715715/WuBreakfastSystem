package com;

public class Egg {
	private String name;
	private int eggcake;
	private int lobo;
	private int jaja;
	private int kala;
	private int toast;
	private int sum;
	
	public Egg( String name,int eggcake,int lobo,int jaja,int kala,int toast)
	{				
					this.name=name;
					this.eggcake=eggcake;
					this.lobo=lobo;
					this.jaja=jaja;
					this.kala=kala;
					this.toast=toast;
					
					
					sum=(eggcake*30)+(lobo*35)+(jaja*45)+(kala*55)+(toast*40);
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	
	
	public int getEggcake() {
		return eggcake;
	}
	public void setEggcake(int eggcake) {
		this.eggcake=eggcake;
	}
	
	
	public int getLobo() {
		return lobo;
	}
	public void setLobo(int lobo) {
		this.lobo=lobo;
	}
	
	
	public int getJaja() {
		return jaja;
	}
	public void setJaja(int jaja) {
		this.jaja=jaja;
	}
	
	
	public int getKala() {
		return kala;
	}
	public void setKala(int kala) {
		this.kala=kala;
	}
	
	
	public int getToast() {
		return toast;
	}
	public void setToast(int toast) {
		this.toast=toast;
	}
	
	
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum=sum;
	}
}
