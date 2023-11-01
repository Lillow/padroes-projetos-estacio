package main;

import dispenserChain.ChangeProcessor;
import dispenserChain.ChangeRequest;
import dispenserChain.DispenserChain;

public class ChangeApp {
	public static void main(String[] args) {
		DispenserChain dispenserChain = new DispenserChain();
		ChangeProcessor changeProcessor = new ChangeProcessor();

		changeProcessor.addChangeRequest(new ChangeRequest(23));
		changeProcessor.addChangeRequest(new ChangeRequest(42));
		changeProcessor.addChangeRequest(new ChangeRequest(13));

		changeProcessor.processChangeRequests(dispenserChain);
	}
}
