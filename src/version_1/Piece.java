package version_1;

public class Piece {
	private int id;
	private Box position;
	private boolean isInFinalBox=false;
	
	public Piece(int id) {
		this.id=id;
		this.position=new HomeBox();
	}
	
}
