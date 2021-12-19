package adapter;

public class TestAdapter {

	public static void main(String[] args) {
		Pc pc = new Pc();
		SdCard sdCard = new SdCard();
		ReaderDevice usb = new Usb();
		pc.read(usb);
		UsbAdapter usbAdapter = new UsbAdapter(sdCard);
		pc.read(usbAdapter);
	}
}
