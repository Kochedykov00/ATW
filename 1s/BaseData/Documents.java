/*
* @author Kochedykov Alexander
* 11-801
*/

public class Documents {
	String name;
	String size;
	String date;

	public Documents(String name, String size, String date) {
        this.name = name;
        this.size = size;
        this.date = date;
    }

	public String getName() {
		return name;
	}

	public String getSize() {
		return size;
	}

	public String getDate() {
		return date;
	}

	public void setName(String name){
		this.name = name;
	}

	public void setSize(String size){
		this.size = size;
	}

	public void setDate(String date){
		this.date = date;
	}

	public String toString() {
        return name + " " + size + " " + date;
    }

}






