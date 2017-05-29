public class Silinder{
	double r, h;
	public Silinder(double raadius, double k6rgus){
		if(raadius<=0){throw new RuntimeException("Sobimatu pikkus");}
		if(k6rgus<=0){throw new RuntimeException("Sobimatu pikkus");}
		r=raadius;
		h=k6rgus;
	}
	public double ruumala(){
		return Math.PI*h*Math.pow(r, 2);
	}
	
	public double pindala(){
		return 2*Math.PI*Math.pow(r, 2)+2*Math.PI*r*h;
	}
	
	public double kylgpindala(){
		return 2*Math.PI*r*h;
	}

	public String toString(){
			return "Silindri ruumala on "+Math.round(ruumala())+" kuupsentimeetrit, pindala on "+Math.round(pindala())+" ruutsentimeetrit ja kylgpindala on "+Math.round(kylgpindala())+" ruutsentimeetrit.";
	}
	
}