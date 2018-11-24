package _01;

public class GameDemo {

	public static void main(String[] args) {
		// 并行：在同一时刻点发生
		// 并发：在同一时间段发生
		// 进程：一个内存中运行的程序，每个进程都有自己的一块内存空间，多进程就是运行多个程序
		// 线程：一个进程中的一个任务，多线程是一个进程的多个任务
		playGame();
		playMusic();
	}

	private static void playGame() {
		for (int i = 0; i < 1000; i++) {
			System.out.println("playGame----------");
		}
	}

	private static void playMusic() {
		for (int i = 0; i < 1000; i++) {
			System.out.println("playMusic");
		}
	}
}
