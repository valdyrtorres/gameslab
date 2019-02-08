package inicio_logica_games;

// Obs.: Todo Game possui um loop infinito, ou seja, um game loop
// FPS: É quantas vezes por segundo em que aplico 
// alguma coisa, intervalo de tempo

public class GameNotProf implements Runnable {
	
	private boolean isRunning;
	private Thread thread;
	
	public static void main(String[] args) {
		GameNotProf game = new GameNotProf();
		game.start();
	}
	
	public synchronized void start() {
		isRunning = true;
		thread = new Thread(this);
		thread.start();
	}
	
	// Método de atualizar, cada vez que roda o loop
	public void tick() {
		// Atualizar o jogo
		System.out.println("Tick");
	}
	
	public void render() {
		// Renderizar o jogo
		System.out.println("Render");
	}
	
	@Override
	public void run() {
		// Game loop não profissional
		while(isRunning) {
			tick();
			render();
			try {
			Thread.sleep(1000);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
}
