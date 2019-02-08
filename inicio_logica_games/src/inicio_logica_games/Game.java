package inicio_logica_games;

import java.util.ArrayList;

// Obs.: Todo Game possui um loop infinito, ou seja, um game loop
// FPS: É quantas vezes por segundo em que aplico 
// alguma coisa, intervalo de tempo

public class Game implements Runnable {
	
	private boolean isRunning;
	private Thread thread;
	
	private ArrayList<Entidade> entidades = new ArrayList<>();
	
	public Game() {
		entidades.add(new Entidade());
		entidades.add(new Entidade());
		entidades.add(new Entidade());
		entidades.add(new Entidade());
		for(int i = 0; i < entidades.size(); i++) {
			Entidade e = entidades.get(0);
		}
	}
	
	public static void main(String[] args) {
		Game game = new Game();
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
