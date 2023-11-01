package dispenserChain;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ChangeProcessor {
	private List<ChangeRequest> changeRequests = new ArrayList<>();

	public void addChangeRequest(ChangeRequest changeRequest) {
		changeRequests.add(changeRequest);
	}

	public void processChangeRequests(DispenserChain dispenserChain) {
		Iterator<ChangeRequest> iterator = changeRequests.iterator();
		while (iterator.hasNext()) {
			ChangeRequest request = iterator.next();
			int amount = request.getAmount();
			System.out.println("Processando solicitação de troco para R$" + amount);
			dispenserChain.dispense(amount);
			iterator.remove();
		}
	}
}
