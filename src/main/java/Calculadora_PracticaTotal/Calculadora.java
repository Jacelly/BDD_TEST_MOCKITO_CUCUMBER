package Calculadora_PracticaTotal;


public class Calculadora {
		//instanciar de alguna manera
		//dependencia
		ICalculadora calOp;
		public double getSuma(double a, double b) {
			return a + b;
		}
		public double getResta(double a, double b) {
			return a - b;
		}
		public double getMultiplicacion(double a, double b) {
			double result=0;
			
			if(a>0 && b>0) {
				for (int i=0; i<b; i++) {
						result += a;
					
				}
			}
			else if(a>0 && b<0)
			{
				for (int i=0; i<a; i++) {
						result +=b;
					
				}
			}
			else if(a<0 && b>0)
			{
				for (int i=0; i<b; i++) {
						result +=a;
					
				}
			}
			else if(a<0 && b<0)
			{
				for (int i=0; i>b; i--) {
						result +=Math.abs(a);
				}
			}
			return result;
		}
		public double ObtenerSuma(double a, double b) {
			return calOp.getSuma1(a,b);
		}
		
}
