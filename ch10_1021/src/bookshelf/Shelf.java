package bookshelf;

import java.util.ArrayList;

public class Shelf {

	protected ArrayList<String> shelf;
	
	public Shelf(){
		shelf = new ArrayList<String>();
	}
	
	public ArrayList<String> getShelf(){
		return shelf;
	}
	
	//어레이리스트의 전체크기
	public int getCount(){
		return shelf.size();
	}
}
