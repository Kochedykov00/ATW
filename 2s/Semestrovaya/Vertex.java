package Semestrovaya;

public class Vertex {

    public String label;
    public boolean isVisited;

    public Vertex(String label) {
        this.label = label;
        this.isVisited = false;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public boolean isVisited() {
        return isVisited;
    }

    public void setVisited(boolean isVisited) {
        this.isVisited = isVisited;
    }

}
