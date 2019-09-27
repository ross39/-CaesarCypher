package ie.gmit.sw;

public class CypherException extends Throwable {

	/** FOR MY OWN NOTES
	 * The serialization runtime associates with each serializable class a version
	 * number, called a serialVersionUID, which is used during deserialization to
	 * verify that the sender and receiver of a serialized object have loaded
	 * classes for that object that are compatible with respect to serialization.
	 */
	private static final long serialVersionUID = 777L;

	public CypherException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CypherException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public CypherException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public CypherException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public CypherException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

}
