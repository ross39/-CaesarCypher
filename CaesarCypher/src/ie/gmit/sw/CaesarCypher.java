package ie.gmit.sw;


public class CaesarCypher extends AbstractCypher implements Cypherable, CypherKey {
	private CypherKey key;

	public CaesarCypher(int key) throws CypherException {
		super();
		setKey(key + "");
		// TODO Auto-generated constructor stub
	}

	@Override
	public byte encrypt(byte b) throws CypherException {
		return (byte) (b + Integer.parseInt(key.getKey()));
	}

	@Override
	public byte decrypt(byte b) throws CypherException {
		return (byte) (b - Integer.parseInt(key.getKey()));
	}	

	public void setKey(String key) throws CypherException {
		this.key = new CypherKeyImpl(key);
	}

	public String getKey() {
		return key.getKey();
	}

	@Override
	protected void finalize() throws Throwable {
		super.finalize();
	}

	public class CypherKeyImpl implements CypherKey{
		private int key;
		
		public CypherKeyImpl(String key) {
			super();
			this.key = Integer.parseInt(key);
		}

		@Override
		public void setKey(String key) throws CypherException {
			this.key = Integer.parseInt(key);
			//CaesarCypher.this.key
		}

		@Override
		public String getKey() {
			return this.key + "";
		}
	}
	
	

}
