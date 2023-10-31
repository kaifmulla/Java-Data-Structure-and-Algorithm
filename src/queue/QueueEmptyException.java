package queue;

public class QueueEmptyException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	public String messagee() {
		return "queue is full";
	}
}
