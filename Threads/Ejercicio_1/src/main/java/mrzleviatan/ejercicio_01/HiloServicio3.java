package mrzleviatan.ejercicio_01;

public class HiloServicio3 extends Thread{

	boolean runHilo;
	int contador;
	
	
	public HiloServicio3(String nombre) {
		this.runHilo = true;
		this.contador = 1;
		start();

	}
	
	@Override
	public void run() {
		
		while(runHilo){
			
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("Hilo servicio 3 en ejecuci�n: "+contador);
			contador++;
		}

		System.out.println("\n Hilo Servicio 3 Se Ah Detenido");

	}

	public void detener() {

		this.runHilo = false;

	}
}
