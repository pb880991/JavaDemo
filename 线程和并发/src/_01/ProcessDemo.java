package _01;


public class ProcessDemo {
	public static void main(String[] args) throws Exception {
		//开启进程方式1
		Runtime runtime = Runtime.getRuntime();
		runtime.exec("gedit");
		//开启方式2
		ProcessBuilder pBuilder = new ProcessBuilder("gedit");
		pBuilder.start();
	}
}
