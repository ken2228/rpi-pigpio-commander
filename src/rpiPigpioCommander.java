import jpigpio.JPigpio;
import jpigpio.PigpioException;
import jpigpio.PigpioSocket;
import jpigpio.Utils;

public class rpiPigpioCommander {
	
	final String raspberryIP = "192.168.178.122";
	final int raspberryPort = 8888;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Test_AppName");
		rpiPigpioCommander app = new rpiPigpioCommander();
		app.run();
	}
	
	public void run() {

		try {
			JPigpio pigpio = new PigpioSocket(raspberryIP, raspberryPort);
			//JPigpio pigpio = new Pigpio();
			pigpio.gpioInitialize();
			Utils.addShutdown(pigpio);
			
		} catch (PigpioException e) {
			e.printStackTrace();
		}
	}

}
