package start;

import java.awt.Graphics;
import java.awt.image.BufferStrategy;

import display.Display;
import gfx.Asset;
import states.GameState;
import states.State;

public class Game implements Runnable{
	
	public String title;
	public int width, height;
	public boolean running = false;
	
	private Display display;
	private Thread thread;
	
	private BufferStrategy bs;
	private Graphics g;
	
	//states
	private State gameState;
	
	public Game(String title, int width, int height) {
		
		this.title = title;
		this.width = width;
		this.height = height;
		
		
		
	}
	
	private void init() {
		
		display = new Display(title, width, height);
		Asset.init();
		
		//gameState = new GameState();
		//State.setState(gameState);
		
		
	}
	
	int x = 0, y, z, x1, y1, z1, x2, y2, z2, x3, y3;
	
	private void update() {     //like tick method update everything every second
		if(x < 720) {
			x += 1;
		}else if(y < 720) {
			y -= 1;
		}else if(z < 720) {
			z += 1;
		}else if(x1 < 720) {
			x1 -= 1;
		}else if(y1 < 720) {
			y1 += 1;
		}else if(z1 < 720) {
			z1 -= 1;
		}else if(x2 < 720) {
			x2 += 1;
		}else if(y2 < 720) {
			y2 -= 1;
		}else if(z2 < 720) {
			z2 += 1;
		}else if(x3 < 720) {
			x3 -= 1;
		}else {
			//do nothing ... stay on 100
		}
		
		//if(State.getState() != null)
			//State.getState().update();
	}
	
	private void render() {
		
		bs = display.getCanvas().getBufferStrategy();
		if(bs == null) {
			display.getCanvas().createBufferStrategy(3);
			return;
		}
		g = bs.getDrawGraphics();
		
		//clear screen
		
		g.clearRect(0, 0, width, height);
		
		//Draw Here
		/*
		g.setColor(Color.red);
		g.fillRect(0, 0, 80, 80);
		g.drawImage(testImage, 0, 0, null);
		*/
		
		g.drawImage(Asset.backgroung, 800, 0, null);
		
		
		g.drawImage(Asset.i100, Asset.width-Asset.width, Asset.height-Asset.height, null);
		g.drawImage(Asset.i99, Asset.width, Asset.height-Asset.height, null);
		g.drawImage(Asset.i98, Asset.width*2, Asset.height-Asset.height, null);
		g.drawImage(Asset.i97, Asset.width*3, Asset.height-Asset.height, null);
		g.drawImage(Asset.i96, Asset.width*4, Asset.height-Asset.height, null);
		g.drawImage(Asset.i95, Asset.width*5, Asset.height-Asset.height, null);
		g.drawImage(Asset.i94, Asset.width*6, Asset.height-Asset.height, null);
		g.drawImage(Asset.i93, Asset.width*7, Asset.height-Asset.height, null);
		g.drawImage(Asset.i92, Asset.width*8, Asset.height-Asset.height, null);
		g.drawImage(Asset.i91, Asset.width*9, Asset.height-Asset.height, null);
		
		g.drawImage(Asset.i81, Asset.width-Asset.width, Asset.height, null);
		g.drawImage(Asset.i82, Asset.width, Asset.height, null);
		g.drawImage(Asset.i83, Asset.width*2, Asset.height, null);
		g.drawImage(Asset.i84, Asset.width*3, Asset.height, null);
		g.drawImage(Asset.i85, Asset.width*4, Asset.height, null);
		g.drawImage(Asset.i86, Asset.width*5, Asset.height, null);
		g.drawImage(Asset.i87, Asset.width*6, Asset.height, null);
		g.drawImage(Asset.i88, Asset.width*7, Asset.height, null);
		g.drawImage(Asset.i89, Asset.width*8, Asset.height, null);
		g.drawImage(Asset.i90, Asset.width*9, Asset.height, null);
		
		g.drawImage(Asset.i80, Asset.width-Asset.width, Asset.height*2, null);
		g.drawImage(Asset.i79, Asset.width, Asset.height*2, null);
		g.drawImage(Asset.i78, Asset.width*2, Asset.height*2, null);
		g.drawImage(Asset.i77, Asset.width*3, Asset.height*2, null);
		g.drawImage(Asset.i76, Asset.width*4, Asset.height*2, null);
		g.drawImage(Asset.i75, Asset.width*5, Asset.height*2, null);
		g.drawImage(Asset.i74, Asset.width*6, Asset.height*2, null);
		g.drawImage(Asset.i73, Asset.width*7, Asset.height*2, null);
		g.drawImage(Asset.i72, Asset.width*8, Asset.height*2, null);
		g.drawImage(Asset.i71, Asset.width*9, Asset.height*2, null);
		
		g.drawImage(Asset.i61, Asset.width-Asset.width, Asset.height*3, null);
		g.drawImage(Asset.i62, Asset.width, Asset.height*3, null);
		g.drawImage(Asset.i63, Asset.width*2, Asset.height*3, null);
		g.drawImage(Asset.i64, Asset.width*3, Asset.height*3, null);
		g.drawImage(Asset.i65, Asset.width*4, Asset.height*3, null);
		g.drawImage(Asset.i66, Asset.width*5, Asset.height*3, null);
		g.drawImage(Asset.i67, Asset.width*6, Asset.height*3, null);
		g.drawImage(Asset.i68, Asset.width*7, Asset.height*3, null);
		g.drawImage(Asset.i69, Asset.width*8, Asset.height*3, null);
		g.drawImage(Asset.i70, Asset.width*9, Asset.height*3, null);
		
		g.drawImage(Asset.i60, Asset.width-Asset.width, Asset.height*4, null);
		g.drawImage(Asset.i59, Asset.width, Asset.height*4, null);
		g.drawImage(Asset.i58, Asset.width*2, Asset.height*4, null);
		g.drawImage(Asset.i57, Asset.width*3, Asset.height*4, null);
		g.drawImage(Asset.i56, Asset.width*4, Asset.height*4, null);
		g.drawImage(Asset.i55, Asset.width*5, Asset.height*4, null);
		g.drawImage(Asset.i54, Asset.width*6, Asset.height*4, null);
		g.drawImage(Asset.i53, Asset.width*7, Asset.height*4, null);
		g.drawImage(Asset.i52, Asset.width*8, Asset.height*4, null);
		g.drawImage(Asset.i51, Asset.width*9, Asset.height*4, null);
		
		g.drawImage(Asset.i41, Asset.width-Asset.width, Asset.height*5, null);
		g.drawImage(Asset.i42, Asset.width, Asset.height*5, null);
		g.drawImage(Asset.i43, Asset.width*2, Asset.height*5, null);
		g.drawImage(Asset.i44, Asset.width*3, Asset.height*5, null);
		g.drawImage(Asset.i45, Asset.width*4, Asset.height*5, null);
		g.drawImage(Asset.i46, Asset.width*5, Asset.height*5, null);
		g.drawImage(Asset.i47, Asset.width*6, Asset.height*5, null);
		g.drawImage(Asset.i48, Asset.width*7, Asset.height*5, null);
		g.drawImage(Asset.i49, Asset.width*8, Asset.height*5, null);
		g.drawImage(Asset.i50, Asset.width*9, Asset.height*5, null);
		
		g.drawImage(Asset.i40, Asset.width-Asset.width, Asset.height*6, null);
		g.drawImage(Asset.i39, Asset.width, Asset.height*6, null);
		g.drawImage(Asset.i38, Asset.width*2, Asset.height*6, null);
		g.drawImage(Asset.i37, Asset.width*3, Asset.height*6, null);
		g.drawImage(Asset.i36, Asset.width*4, Asset.height*6, null);
		g.drawImage(Asset.i35, Asset.width*5, Asset.height*6, null);
		g.drawImage(Asset.i34, Asset.width*6, Asset.height*6, null);
		g.drawImage(Asset.i33, Asset.width*7, Asset.height*6, null);
		g.drawImage(Asset.i32, Asset.width*8, Asset.height*6, null);
		g.drawImage(Asset.i31, Asset.width*9, Asset.height*6, null);
		
		g.drawImage(Asset.i21, Asset.width-Asset.width, Asset.height*7, null);
		g.drawImage(Asset.i22, Asset.width, Asset.height*7, null);
		g.drawImage(Asset.i23, Asset.width*2, Asset.height*7, null);
		g.drawImage(Asset.i24, Asset.width*3, Asset.height*7, null);
		g.drawImage(Asset.i25, Asset.width*4, Asset.height*7, null);
		g.drawImage(Asset.i26, Asset.width*5, Asset.height*7, null);
		g.drawImage(Asset.i27, Asset.width*6, Asset.height*7, null);
		g.drawImage(Asset.i28, Asset.width*7, Asset.height*7, null);
		g.drawImage(Asset.i29, Asset.width*8, Asset.height*7, null);
		g.drawImage(Asset.i30, Asset.width*9, Asset.height*7, null);
		
		g.drawImage(Asset.i20, Asset.width-Asset.width, Asset.height*8, null);
		g.drawImage(Asset.i19, Asset.width, Asset.height*8, null);
		g.drawImage(Asset.i18, Asset.width*2, Asset.height*8, null);
		g.drawImage(Asset.i17, Asset.width*3, Asset.height*8, null);
		g.drawImage(Asset.i16, Asset.width*4, Asset.height*8, null);
		g.drawImage(Asset.i15, Asset.width*5, Asset.height*8, null);
		g.drawImage(Asset.i14, Asset.width*6, Asset.height*8, null);
		g.drawImage(Asset.i13, Asset.width*7, Asset.height*8, null);
		g.drawImage(Asset.i12, Asset.width*8, Asset.height*8, null);
		g.drawImage(Asset.i11, Asset.width*9, Asset.height*8, null);
		
		g.drawImage(Asset.i1, Asset.width-Asset.width, Asset.height*9, null);
		g.drawImage(Asset.i2, Asset.width, Asset.height*9, null);
		g.drawImage(Asset.i3, Asset.width*2, Asset.height*9, null);
		g.drawImage(Asset.i4, Asset.width*3, Asset.height*9, null);
		g.drawImage(Asset.i5, Asset.width*4, Asset.height*9, null);
		g.drawImage(Asset.i6, Asset.width*5, Asset.height*9, null);
		g.drawImage(Asset.i7, Asset.width*6, Asset.height*9, null);
		g.drawImage(Asset.i8, Asset.width*7, Asset.height*9, null);
		g.drawImage(Asset.i9, Asset.width*8, Asset.height*9, null);
		g.drawImage(Asset.i10, Asset.width*9, Asset.height*9, null);
		
		
		if(x < 720) {
			g.drawImage(Asset.player_icon_1, x, 720, null);
			y = x;
			if(y == 719) {
				x = 720;
			}
		}else if(y < 720) {
			
			if(y < 0) {
				y = 720;
			}else {
				g.drawImage(Asset.player_icon_1, y, 640, null);
			}
			
		}else if(z < 720) {	
			g.drawImage(Asset.player_icon_1, z, 560, null);
			x1 = z;
			if(x1 == 719) {
				z = 720;
			}	
			
		}else if(x1 < 720) {
			if(x1 < 0) {
				x1 = 720;
			}else {
				g.drawImage(Asset.player_icon_1, x1, 480, null);
			}
		}else if(y1 < 720) {
			g.drawImage(Asset.player_icon_1, y1, 400, null);
			z1 = y1;
			if(z1 == 719) {
				y1 = 720;
			}
		}else if(z1 < 720) {
			if(z1 < 0) {
				z1 = 720;
			}else {
				g.drawImage(Asset.player_icon_1, z1, 320, null);
			}
		}else if(x2 < 720) {
			g.drawImage(Asset.player_icon_1, x2, 240, null);
			y2 = x2;
			if(y2 == 719) {
				x2 = 720;
			}
		}else if(y2 < 720) {
			if(y2 < 0) {
				y2 = 720;
			}else {
				g.drawImage(Asset.player_icon_1, y2, 160, null);
			}
		}else if(z2 < 720) {
			g.drawImage(Asset.player_icon_1, z2, 80, null);
			x3 = z2;
			if(x3 == 719) {
				z2 = 720;
			}
		}else if(x3 < 720) {
			if(x3 < 0) {
				x3 = 720;
			}else {
				g.drawImage(Asset.player_icon_1, x3, 0, null);
			}
		}else {
			g.drawImage(Asset.player_icon_1, 0, 0, null);
		}
		
		//if(State.getState() != null)
			//State.getState().render(g);
		
		//End Draw
		
		bs.show();           //Workers on bufferStrategy (hidden magical display)
		g.dispose();		 //graphics object done properly
		
	}
	
	
	@Override
	public void run() {
		
		init();
		
		int fps = 120;
		double timePerUpdate = 1000000000 / fps;
		double delta = 0;
		long now;
		long lastTime = System.nanoTime();
		long timer = 0;
		int ticks = 0;
		
		while(running) {
			
			now = System.nanoTime();
			delta += (now - lastTime) / timePerUpdate;
			timer += now - lastTime;
			lastTime = now;
			
			if(delta >= 1) {
				
				update();
				render();
				ticks++;
				delta--;
			
			}
			
			
			if(timer >= 1000000000) {
				System.out.println("FPS : " + ticks);
				timer = 0;
				ticks = 0;
			}
			
			
		}
		
		
	}
	
	
	public synchronized void start() {
	
		if(running == true) {
			return;
		}
		running = true;
		thread = new Thread(this);
		thread.start();
	
	}
	
	
	public synchronized void stop() {
		
		if(running == false) {
			return;
		}
		running = false;
		
		try {
			thread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
	
	
	
}
